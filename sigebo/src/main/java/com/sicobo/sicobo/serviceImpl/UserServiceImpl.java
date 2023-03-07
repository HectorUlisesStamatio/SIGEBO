package com.sicobo.sicobo.serviceImpl;

import com.sicobo.sicobo.dao.DaoUser;
import com.sicobo.sicobo.dto.DTOUser;
import com.sicobo.sicobo.model.BeanUser;
import com.sicobo.sicobo.service.IUserService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class UserServiceImpl implements IUserService {

    @Autowired
    private DaoUser daoUser;

    @Override
    @Transactional(readOnly = true)
    public List<BeanUser> listar() {
        return daoUser.findAll();
    }

    @Override
    @Transactional
    public void guardar(DTOUser dtoUser) {
        BeanUser u = new BeanUser();
        daoUser.save(u);
    }

    @Override
    @Transactional
    public void eliminar(BeanUser beanUser) {
        daoUser.delete(beanUser);
    }

    @Override
    @Transactional(readOnly = true)
    public BeanUser encontrarPersona(BeanUser beanUser) {
        return daoUser.findById(beanUser.getId()).orElseThrow(EntityNotFoundException::new);
    }
}