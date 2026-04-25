package com.example.courseRegistrationSystem.DTO.Response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CourseResponse {
    private Long id;
    private String courseName;
    private String description;
    private String trainerName;
    private Integer capacity;
    private Integer enrolledCount;
    private Integer spotsAvailable;
}
