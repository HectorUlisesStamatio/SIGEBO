package com.sicobo.sicobo.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

@Data
public class DTOUser {

    @NotBlank(groups = {Modify.class}, message = "El campo no puede estar vacío")
    private String name;

    @NotBlank(groups = {Modify.class}, message = "El campo no puede estar vacío")
    private String lastname;

    @NotBlank(groups = {Modify.class}, message = "El campo no puede estar vacío")
    private String surname;

    @NotBlank(groups = {Register.class}, message = "El campo no puede estar vacío")
    private String email;

    @Length(groups = {Modify.class}, max = 13)
    @NotBlank(groups = {Modify.class}, message = "El campo no puede estar vacío")
    private String rfc;

    @Length(groups = {Modify.class}, max = 15)
    @NotBlank(groups = {Modify.class}, message = "El campo no puede estar vacío")
    private String phone_number;

    @NotNull(groups = {Modify.class}, message = "El campo no debe ser nulo")
    @Pattern(groups = {Modify.class}, regexp = "^true$|^false$", message = "Los únicos valores admitidos son verdadero o falso")
    private boolean status;

    @NotBlank(groups = {Register.class}, message = "El campo no puede estar vacío")
    private String username;

    @Length(groups = {Register.class}, min = 12)
    @NotBlank(groups = {Register.class}, message = "El campo no puede estar vacío")
    private String password;

    @NotBlank(groups = {Register.class, Modify.class}, message = "El campo no puede estar vacío")
    private String role;

    private int number_attempts;

    @NotNull(groups = {Register.class}, message = "El campo no puede ser nulo")
    private boolean policy_acceptance;


    public interface Register {
    }

    public interface Modify {
    }


}
