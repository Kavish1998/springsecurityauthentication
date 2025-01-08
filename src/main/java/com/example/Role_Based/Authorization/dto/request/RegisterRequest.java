package com.example.Role_Based.Authorization.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class RegisterRequest {
    private String firstName;
    private String lastName;
    private String email;
    private String password;

}
