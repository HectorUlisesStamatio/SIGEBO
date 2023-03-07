package com.sicobo.sicobo.service;

import com.sicobo.sicobo.dto.DTOState;
import com.sicobo.sicobo.model.BeanState;

import java.util.List;

public interface IStateService {
    public List<BeanState> listar();

    public void guardar(DTOState dtoState);

    public void eliminar(BeanState beanState);

    public BeanState encontrarPersona(BeanState beanState);
}
