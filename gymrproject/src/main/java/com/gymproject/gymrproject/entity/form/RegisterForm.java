package com.gymproject.gymrproject.entity.form;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegisterForm {

    @NotNull
    private LocalDate registerDate;

    @NotNull
    @Positive(message = "Value must be positive")
    private Long studentId;
}
