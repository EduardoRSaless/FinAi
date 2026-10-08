package br.com.finai.application.services;

import br.com.finai.api.dtos.AuthResponse;
import br.com.finai.api.dtos.LoginRequest;
import br.com.finai.infrastructure.repositories.UserRepository;import org.apache.catalina.User;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    private final UserRepository userRepository;

    public AuthenticationService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public AuthResponse authenticate(LoginRequest request){
        User user = userRepository.findByEmail(request.getEmail());
        if ()

    }

}
