package com.sicobo.sicobo.serviceImpl;

import com.sicobo.sicobo.dao.DaoPayment;
import com.sicobo.sicobo.dto.DTOPayment;
import com.sicobo.sicobo.model.BeanPayment;
import com.sicobo.sicobo.service.IPaymentService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class PaymentServiceImpl implements IPaymentService {

    @Autowired
    private DaoPayment daoPayment;

    @Override
    @Transactional(readOnly = true)
    public List<BeanPayment> listar() {
        return daoPayment.findAll();
    }

    @Override
    @Transactional
    public void guardar(DTOPayment dtoPayment) {
        BeanPayment b = new BeanPayment();
        daoPayment.save(b);
    }

    @Override
    @Transactional
    public void eliminar(BeanPayment beanPayment) {
        daoPayment.delete(beanPayment);
    }

    @Override
    @Transactional(readOnly = true)
    public BeanPayment encontrarPersona(BeanPayment beanPayment) {
        return daoPayment.findById(beanPayment.getId()).orElseThrow(EntityNotFoundException::new);
    }
}
