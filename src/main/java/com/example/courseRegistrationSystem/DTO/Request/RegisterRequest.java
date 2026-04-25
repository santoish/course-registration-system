package com.example.courseRegistrationSystem.DTO.Request;

import com.example.courseRegistrationSystem.Entity.Role;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class RegisterRequest {
    @NotBlank(message = "Name is Required")
    private String name;

    @Email
    @NotBlank(message = "Email is Required")
    private String email;

    @NotBlank(message = "Password is required")
    @Size(max = 12,min = 6)
    private String password;

    @NotNull(message = "Role is Required")
    private Role role;

}
