package com.colak.springtutorial.controller;

import com.colak.springtutorial.dto.signup.SignupRequestDto;
import com.colak.springtutorial.jpa.User;
import com.colak.springtutorial.service.RegistrationService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "portal")

@RequiredArgsConstructor
public class RegistrationController {

    private final RegistrationService registrationService;

    @PostMapping(path = "signup")
    public String registerUser(@Valid @RequestBody SignupRequestDto signupRequest) {
        User savedUser = registrationService.signup(signupRequest);
        return "Saved user as " + savedUser.getId();
    }
}
