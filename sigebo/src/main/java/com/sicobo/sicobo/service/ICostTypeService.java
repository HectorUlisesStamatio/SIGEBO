package com.sicobo.sicobo.service;

import com.sicobo.sicobo.dto.DTOCostType;
import com.sicobo.sicobo.model.BeanCostType;

import java.util.List;

public interface ICostTypeService {

    public List<BeanCostType> listar();

    public void guardar(DTOCostType dtoCostType);

    public void eliminar(BeanCostType beanCostType);

    public BeanCostType encontrarPersona(BeanCostType beanCostType);
}
