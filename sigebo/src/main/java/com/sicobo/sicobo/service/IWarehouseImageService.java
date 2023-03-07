package com.sicobo.sicobo.service;

import com.sicobo.sicobo.dto.DTOWarehouseImage;
import com.sicobo.sicobo.model.BeanWarehouseImage;

import java.util.List;

public interface IWarehouseImageService {
    public List<BeanWarehouseImage> listar();

    public void guardar(DTOWarehouseImage dtoWarehouseImage);

    public void eliminar(BeanWarehouseImage beanWarehouseImage);

    public BeanWarehouseImage encontrarPersona(BeanWarehouseImage beanWarehouseImage);
}
