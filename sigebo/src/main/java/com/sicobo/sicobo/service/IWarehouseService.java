package com.sicobo.sicobo.service;

import com.sicobo.sicobo.dto.DTOWarehouse;
import com.sicobo.sicobo.dto.DTOWarehouseImage;
import com.sicobo.sicobo.model.BeanWarehouse;
import com.sicobo.sicobo.model.BeanWarehouseImage;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IWarehouseService {
    public ResponseEntity<Object> listar();

    public ResponseEntity<Object> guardar(DTOWarehouse dtoWarehouse);

    public ResponseEntity<Object> editar(DTOWarehouse dtoWarehouse);

    public ResponseEntity<Object> eliminar(BeanWarehouse beanWarehouse);

    public ResponseEntity<Object> buscar(Long id);
}
