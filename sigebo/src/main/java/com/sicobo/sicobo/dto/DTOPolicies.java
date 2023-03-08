package com.sicobo.sicobo.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class DTOPolicies {
    @NotBlank(message = "No debe estar vacío")
    private String description;

    @NotNull(message = "El campo no debe ser nulo")
    @Pattern(regexp = "^true$|^false$", message = "Los únicos valores admitidos son verdadero o falso")
    private boolean status;

}
