package com.sicobo.sicobo.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Data;

import java.util.Date;

@Data
public class DTOPayment {

    @PositiveOrZero(message = "El campo tiene que ser mínimo de 0")
    private Double amount;

    @PositiveOrZero(message = "El campo tiene que ser mínimo de 0")
    private int amountMonths;

    @NotNull(message = "El campo no debe ser nulo")
    private Date paymentDate;

    @NotNull(message = "El campo no debe ser nulo")
    private Date dueDate;

    @NotNull
    @Pattern(regexp = "^true$|^false$", message = "Los únicos valores admitidos son verdadero o falso")
    private boolean status;

    @NotNull(message = "El campo no debe ser nulo")
    @PositiveOrZero(message = "Tiene que ser un número positivo o 0")
    private int beanWarehouse;

    @NotNull(message = "El campo no debe ser nulo")
    @PositiveOrZero(message = "Tiene que ser un número positivo o 0")
    private int beanUser;
}
