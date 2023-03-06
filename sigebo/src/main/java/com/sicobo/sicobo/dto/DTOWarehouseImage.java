package com.sicobo.sicobo.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class DTOWarehouseImage {
    @NotBlank(message = "El campo no puede estar en blanco")
    private String url;

}
