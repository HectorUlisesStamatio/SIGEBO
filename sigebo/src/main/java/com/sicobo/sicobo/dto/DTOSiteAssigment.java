package com.sicobo.sicobo.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Data;

@Data
public class DTOSiteAssigment {

    @NotNull(message = "El campo no debe ser nulo")
    @PositiveOrZero(message = "Tiene que ser un número positivo o 0")
    private int beanUser;

    @NotNull(message = "El campo no debe ser nulo")
    @PositiveOrZero(message = "Tiene que ser un número positivo o 0")
    private int beanSite;

    @NotNull(message = "El campo no debe ser nulo")
    @Pattern(regexp = "^true$|^false$", message = "Los únicos valores admitidos son verdadero o falso")
    private boolean status;
}
