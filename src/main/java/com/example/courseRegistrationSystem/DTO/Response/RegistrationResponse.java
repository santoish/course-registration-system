package com.example.courseRegistrationSystem.DTO.Response;

import com.example.courseRegistrationSystem.Entity.Status;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RegistrationResponse {
    private Long id;
    private Long userId;
    private Long courseId;
    private Status status;
    private LocalDateTime registeredAt;
}
