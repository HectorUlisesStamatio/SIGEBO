package com.sicobo.sicobo.service;

import com.sicobo.sicobo.dto.DTOPayment;
import com.sicobo.sicobo.model.BeanPayment;

import java.util.List;

public interface IPaymentService {
    public List<BeanPayment> listar();

    public void guardar(DTOPayment dtoPayment);

    public void eliminar(BeanPayment beanPayment);

    public BeanPayment encontrarPersona(BeanPayment beanPayment);
}
