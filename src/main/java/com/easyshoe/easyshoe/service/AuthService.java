package com.easyshoe.easyshoe.service;


import com.easyshoe.easyshoe.dto.AuthenticationResponse;
import com.easyshoe.easyshoe.dto.LoginRequest;
import com.easyshoe.easyshoe.dto.RegisterRequest;
import com.easyshoe.easyshoe.model.User;
import com.easyshoe.easyshoe.repository.AuthRepository;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthService {
    @Autowired
    private AuthRepository authRepository;



    public void register(RegisterRequest registerRequest) {
        User user = new User();
        user.setUsername(registerRequest.getUsername());


        user.setPassword(registerRequest.getPassword());
        user.setIsAdmin(registerRequest.getIsAdmin());
        authRepository.save(user);
    }

    public AuthenticationResponse login(LoginRequest loginRequest){
        User user =authRepository.findByUsername(loginRequest.getUsername()).get();
        if(loginRequest.getPassword().equals(user.getPassword())) {
            return new AuthenticationResponse();
        }

        return null;
    }



 /*   public AuthenticationResponse login(LoginRequest loginRequest) {
        Authentication authentication = authenticationManager
                .authenticate(new UsernamePasswordAuthenticationToken(loginRequest.getUsername(),
                        loginRequest.getPassword()));
        SecurityContextHolder.getContext().setAuthentication(authentication);

        return new AuthenticationResponse(jwtProvider.generateToken(authentication), loginRequest.getUsername());
    }

    public Optional<org.springframework.security.core.userdetails.User> getCurrentUser() {
        org.springframework.security.core.userdetails.User principal = (org.springframework.security.core.userdetails.User)
                SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return Optional.of(principal);
    }*/





}
