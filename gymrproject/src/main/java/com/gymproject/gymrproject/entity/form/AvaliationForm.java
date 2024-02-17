package com.gymproject.gymrproject.entity.form;

import com.gymproject.gymrproject.entity.Student;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AvaliationForm {

    @NotNull
    @Positive(message = "Value must be positive")
    public Long studentId;

    @NotNull
    @Positive(message = "Value must be positive")
    private double weight;

    @NotNull
    @Positive(message = "Value must be positive")
    private double height;
}
