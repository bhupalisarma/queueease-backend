package com.project.queueapp.dto;
import lombok.Data;

@Data
public class CustomerLoginRequest {
    private String email;
    private String password;
}
