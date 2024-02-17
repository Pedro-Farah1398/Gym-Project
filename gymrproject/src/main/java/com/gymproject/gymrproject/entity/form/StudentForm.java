package com.gymproject.gymrproject.entity.form;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentForm {

    @NotBlank(message = "Please fill the field correctly")
    private String name;

    @NotBlank(message = "Please fill the field correctly")
    @CPF(message = "'${validatedValue}' is in invalid format")
    private String cpf;

    @NotBlank(message = "Please fill the field correctly")
    private String address;

    @NotNull(message = "Please fill the field correctly")
    @Past(message = "Date is invalid")
    private LocalDate BirthDate;
}
