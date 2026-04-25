package com.example.courseRegistrationSystem.DTO.Request;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseRequest {
    @NotBlank(message = "Course Name is Required")
    private String courseName;
    @NotBlank
    private String description;

    @NotBlank
    private String trainerName;

    @NotNull(message =  "Capacity is required")
    @Min(value = 10, message = "Capacity must be at least 10")
    @Max(value = 50, message = "Capacity cannot exceed 50")
    private Integer capacity;

}
