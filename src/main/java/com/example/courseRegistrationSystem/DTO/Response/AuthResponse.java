package com.example.courseRegistrationSystem.DTO.Response;

import com.example.courseRegistrationSystem.Entity.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AuthResponse {
    private String token;
    private String email;
    private Role role;
    private String message;
}
