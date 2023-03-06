package com.sicobo.sicobo.service;

import com.sicobo.sicobo.model.BeanCostType;

import java.util.List;

public interface ICostTypeService {

    public List<BeanCostType> listarCostos();

    public void guardar(BeanCostType beanCostType);

    public void eliminar(BeanCostType beanCostType);

    public BeanCostType encontrarPersona(BeanCostType persona);
}
