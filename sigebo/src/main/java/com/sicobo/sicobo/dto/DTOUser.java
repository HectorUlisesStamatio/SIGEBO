package com.sicobo.sicobo.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class DTOUser {


    private String name;

    private String lastname;

    private String surname;

    @NotBlank(message = "El campo no puede estar vacío")
    private String email;

    private String rfc;

    private String phone_number;

    private boolean status;

    @NotBlank(message = "El campo no puede estar vacío")
    private String username;

    @NotBlank(message = "El campo no puede estar vacío")
    private String password;

    @NotBlank(message = "El campo no puede estar vacío")
    private String role;

    private int number_attempts;

    @NotNull(message = "El campo no puede ser nulo")
    private boolean policy_acceptance;

}
