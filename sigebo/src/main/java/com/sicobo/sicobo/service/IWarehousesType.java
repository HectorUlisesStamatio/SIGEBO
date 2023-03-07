package com.sicobo.sicobo.service;

import com.sicobo.sicobo.dto.DTOWarehousesType;
import com.sicobo.sicobo.model.BeanWarehousesType;

import java.util.List;

public interface IWarehousesType {
    public List<BeanWarehousesType> listar();

    public void guardar(DTOWarehousesType dtoWarehousesType);

    public void eliminar(BeanWarehousesType beanWarehousesType);

    public BeanWarehousesType encontrarPersona(BeanWarehousesType beanWarehousesType);
}
