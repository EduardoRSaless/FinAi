package br.com.finai.api.dtos;

import java.util.UUID;

public class AuthResponse {
    private String token;
    private UUID userId;
    private String name;
    private String email;
}
