package com.sicobo.sicobo.service;

import com.sicobo.sicobo.dto.DTOPolicies;
import com.sicobo.sicobo.model.BeanPolicies;

import java.util.List;

public interface IPoliciesService {
    public List<BeanPolicies> listar();

    public void guardar(DTOPolicies dtoPolicies);

    public void eliminar(BeanPolicies beanPolicies);

    public BeanPolicies encontrarPersona(BeanPolicies beanPolicies);
}
