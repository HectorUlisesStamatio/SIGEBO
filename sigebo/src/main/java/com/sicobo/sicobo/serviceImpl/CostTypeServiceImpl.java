package com.sicobo.sicobo.serviceImpl;

import com.sicobo.sicobo.dao.DaoCostType;
import com.sicobo.sicobo.model.BeanCostType;
import com.sicobo.sicobo.service.ICostTypeService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class CostTypeServiceImpl implements ICostTypeService {

    @Autowired
    private DaoCostType daoCostType;

    @Override
    @Transactional(readOnly = true)
    public List<BeanCostType> listarCostos() {
        return daoCostType.findAll();
    }

    @Override
    @Transactional
    public void guardar(BeanCostType beanCostType) {
         daoCostType.save(beanCostType);
    }

    @Override
    @Transactional
    public void eliminar(BeanCostType beanCostType) {
            daoCostType.delete(beanCostType);
    }

    @Override
    @Transactional(readOnly = true)
    public BeanCostType encontrarPersona(BeanCostType beanCostType) {
        return daoCostType.findById(beanCostType.getId()).orElseThrow(EntityNotFoundException::new);
    }
}
