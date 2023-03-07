package com.sicobo.sicobo.service;

import com.sicobo.sicobo.dto.DTOUser;
import com.sicobo.sicobo.model.BeanUser;

import java.util.List;

public interface IUserService {
    public List<BeanUser> listar();

    public void guardar(DTOUser dtoUser);

    public void eliminar(BeanUser beanUser);

    public BeanUser encontrarPersona(BeanUser beanUser);
}
