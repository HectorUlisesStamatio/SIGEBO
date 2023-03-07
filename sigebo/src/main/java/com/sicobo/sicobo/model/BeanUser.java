package com.sicobo.sicobo.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
public class BeanUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String lastname;

    private String surname;

    private String email;

    private String rfc;

    private String phone_number;

    private String username;

    private String password;

    @Enumerated(EnumType.STRING)
    private Rol role;

    private int number_attempts;

    private boolean policy_acceptance;

    private boolean status;


    private LocalDateTime fechaCreacion;

    @Column(name = "fecha_act")
    private LocalDateTime fechaActualizacion;

    public enum Rol {
        ADMIN,
        GESTOR,
        USUARIO
    }

    @PrePersist
    private void prePersist(){
        this.fechaCreacion = LocalDateTime.now();
    }

    @PreUpdate
    private void preUpdate(){
        this.fechaActualizacion = LocalDateTime.now();
    }


}
