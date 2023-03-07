package com.sicobo.sicobo.service;

import com.sicobo.sicobo.dto.DTOWarehouse;
import com.sicobo.sicobo.model.BeanWarehouse;

import java.util.List;

public interface IWarehouseService {
    public List<BeanWarehouse> listar();

    public void guardar(DTOWarehouse dtoWarehouse);

    public void eliminar(BeanWarehouse beanWarehouse);

    public BeanWarehouse encontrarPersona(BeanWarehouse beanWarehouse);
}
