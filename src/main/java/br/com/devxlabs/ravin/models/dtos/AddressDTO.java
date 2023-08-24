package br.com.devxlabs.ravin.models.dtos;

import java.io.Serial;
import java.io.Serializable;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class AddressDTO implements Serializable{

    @Serial
    private static final long serialVersionUID = 1L;
    
    @NotBlank(message = "O campo Estado não pode estar em branco")
    @NotNull(message = "O Campo Estado pode ser vazio")
    private String state;

    @NotBlank(message = "O campo Cidade não pode estar em branco")
    @NotNull(message = "O Campo Cidade pode ser vazio")
    private String city;

    @NotBlank(message = "O campo Rua não pode estar em branco")
    @NotNull(message = "O Campo Rua pode ser vazio")
    private String street;

    @NotBlank(message = "O campo CEP não pode estar em branco")
    @NotNull(message = "O Campo CEP pode ser vazio")
    private String zipcode;
}
