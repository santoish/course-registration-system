package com.example.courseRegistrationSystem.DTO.Request;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class RegistrationRequest {
    @NotBlank(message = "Course Id is Required")
    private Long courseId;
}
