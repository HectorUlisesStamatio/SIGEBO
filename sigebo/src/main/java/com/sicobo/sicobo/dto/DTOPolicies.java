package com.sicobo.sicobo.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class DTOPolicies {
    @NotBlank(message = "No debe estar vacío")
    private String description;

    private boolean status;

}
