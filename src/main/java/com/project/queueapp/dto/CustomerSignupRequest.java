package com.project.queueapp.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerSignupRequest {
    private String fullName;
    private String email;
    private String phone;
    private String password;
}
