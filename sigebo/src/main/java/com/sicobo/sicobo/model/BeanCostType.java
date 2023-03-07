package com.sicobo.sicobo.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "cost_type")
public class BeanCostType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    private Double amount;

    private boolean status;

/*
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "warehouses_type_id", referencedColumnName = "id")
    private BeanWarehousesType beanWarehousesType;
*/

    private LocalDateTime fechaCreacion;

    @Column(name = "fecha_act")
    private LocalDateTime fechaActualizacion;

    @PrePersist
    private void prePersist(){
        this.fechaCreacion = LocalDateTime.now();
    }

    @PreUpdate
    private void preUpdate(){
        this.fechaActualizacion = LocalDateTime.now();
    }
}
