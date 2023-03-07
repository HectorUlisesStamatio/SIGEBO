package com.sicobo.sicobo.serviceImpl;

import com.sicobo.sicobo.dao.DaoPolicies;
import com.sicobo.sicobo.dto.DTOPolicies;
import com.sicobo.sicobo.model.BeanPolicies;
import com.sicobo.sicobo.service.IPoliciesService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class PoliciesServiceImpl implements IPoliciesService {

    @Autowired
    private DaoPolicies daoPolicies;

    @Override
    @Transactional(readOnly = true)
    public List<BeanPolicies> listar() {
        return daoPolicies.findAll();
    }

    @Override
    @Transactional
    public void guardar(DTOPolicies dtoPolicies) {
        BeanPolicies p = new BeanPolicies();
        daoPolicies.save(p);
    }

    @Override
    public void eliminar(BeanPolicies beanPolicies) {
        daoPolicies.delete(beanPolicies);
    }

    @Override
    @Transactional(readOnly = true)
    public BeanPolicies encontrarPersona(BeanPolicies beanPolicies) {
        return daoPolicies.findById(beanPolicies.getId()).orElseThrow(EntityNotFoundException::new);
    }
}
