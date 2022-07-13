package com.easyshoe.easyshoe.controller;


import com.easyshoe.easyshoe.dto.AuthenticationResponse;
import com.easyshoe.easyshoe.dto.LoginRequest;
import com.easyshoe.easyshoe.dto.RegisterRequest;
import com.easyshoe.easyshoe.service.AuthService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller

@CrossOrigin(
        origins = {"http://localhost:4788/"},
        allowCredentials = "false",
        originPatterns = {"*"},
        allowedHeaders = {"*"},
        exposedHeaders = {"*"},
        maxAge = 60 * 30,
        methods = {RequestMethod.GET, RequestMethod.DELETE, RequestMethod.POST, RequestMethod.PUT}
)
@RequestMapping("/api/auth")
public class AuthController {
    @Autowired
    private AuthService authService;


    @PostMapping("/register")
    public ResponseEntity register(@RequestBody RegisterRequest registerRequest) {
        authService.register(registerRequest);
        return new ResponseEntity(HttpStatus.OK);
    }


    @PostMapping("/login")
    public AuthenticationResponse login(@RequestBody LoginRequest loginRequest)  {
        return authService.login(loginRequest);
    }
}
