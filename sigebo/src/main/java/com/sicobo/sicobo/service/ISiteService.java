package com.sicobo.sicobo.service;

import com.sicobo.sicobo.dto.DTOSite;
import com.sicobo.sicobo.model.BeanSite;

import java.util.List;

public interface ISiteService {
    public List<BeanSite> listar();

    public void guardar(DTOSite dtoSite);

    public void eliminar(BeanSite beanSite);

    public BeanSite encontrarPersona(BeanSite beanSite);
}
