package com.example.courseRegistrationSystem.model;


import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
@JsonPropertyOrder({"courseId","courseName","trainerName","courseDuration"})
public class Course {
    @Id
    private String courseId;
    private String courseName;
    private String trainerName;
    private Integer courseDuration;
}
