package com.sicobo.sicobo.dto;

import jakarta.validation.constraints.NotBlank;
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

    private boolean status;

}
