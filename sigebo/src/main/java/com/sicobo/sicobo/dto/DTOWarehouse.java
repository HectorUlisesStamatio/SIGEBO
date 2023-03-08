package com.sicobo.sicobo.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Data;

@Data
public class DTOWarehouse {

    @NotBlank(message = "El campo no debe estar en blanco")
    private String description;

    @NotBlank(message = "El campo no debe estar en blanco")
    private String section;

    @PositiveOrZero(message="El campo tiene que como mínimo valer 0")
    private Double finalCost;

    @NotNull(message = "El campo no debe ser nulo")
    @Pattern(regexp = "^true$|^false$", message = "Los únicos valores admitidos son verdadero o falso")
    private boolean status;

    @NotNull(message = "El campo no debe ser nulo")
    @PositiveOrZero(message = "Tiene que ser un número positivo o 0")
    private int beanSite;

    @NotNull(message = "El campo no debe ser nulo")
    @PositiveOrZero(message = "Tiene que ser un número positivo o 0")
    private int warehousesType;
}
