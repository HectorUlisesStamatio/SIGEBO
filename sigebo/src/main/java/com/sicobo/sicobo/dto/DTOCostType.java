package com.sicobo.sicobo.dto;

import jakarta.validation.constraints.PositiveOrZero;
import lombok.Data;

@Data
public class DTOCostType {

    @PositiveOrZero(message = "El campo tiene que ser mínimo de 0")
    private Double amount;

    private boolean status;

}
