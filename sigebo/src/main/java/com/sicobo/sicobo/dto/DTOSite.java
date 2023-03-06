package com.sicobo.sicobo.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class DTOSite {
    @NotBlank(message = "El campo no debe estar en blanco")
    private String name;

    private boolean status;

    @NotBlank(message = "El campo no debe estar en blanco")
    private String address;
}
