package com.sicobo.sicobo.service;

import com.sicobo.sicobo.dto.DTOPayment;
import com.sicobo.sicobo.dto.DTOPolicies;
import com.sicobo.sicobo.model.BeanPayment;
import com.sicobo.sicobo.model.BeanPolicies;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IPoliciesService {
    public ResponseEntity<Object> listar();

    public ResponseEntity<Object> guardar(DTOPolicies dtoPolicies);

    public ResponseEntity<Object> editar(DTOPolicies dtoPolicies);

    public ResponseEntity<Object> eliminar(BeanPolicies beanPolicies);

    public ResponseEntity<Object> buscar(Long id);
}
