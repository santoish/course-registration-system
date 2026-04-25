package com.example.courseRegistrationSystem.DTO.Request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class LoginRequest {
    @Email
    @NotBlank(message ="Email is Required")
    private String email;

    @NotBlank(message = "Password is Required")
    @Size(min = 6, max = 12,message = "Password Limit is up to 12")
    private String password;
}
