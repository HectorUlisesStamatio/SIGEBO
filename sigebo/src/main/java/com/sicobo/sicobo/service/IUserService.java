package com.sicobo.sicobo.service;

import com.sicobo.sicobo.dto.DTOUser;
import com.sicobo.sicobo.model.BeanUser;
import org.springframework.http.ResponseEntity;

public interface IUserService {
    public ResponseEntity<Object> listar();

    public ResponseEntity<Object> guardar(DTOUser dtoUser);

    public ResponseEntity<Object> editar(DTOUser dtoUser);

    public ResponseEntity<Object> eliminar(BeanUser beanUser);

    public ResponseEntity<Object> buscar(Long id);
}
