package com.example.jwtspringexample.response;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
public class SignupResponse {
    private String token;
    private String type = "Bearer";
    private String refreshToken;
    private Long id;
    private String username;
    private String email;
    private List<String> roles;
    public SignupResponse(String accessToken, String refreshToken, Long id, String username, String email, List roles) {
        this.token = accessToken;
        this.refreshToken = refreshToken;
        this.id = id;
        this.username = username;
        this.email = email;
        this.roles = roles;
    }
}
