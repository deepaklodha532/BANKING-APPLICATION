package com.bankDomain.BankingApp.controllers;

import com.bankDomain.BankingApp.dto.UserDto;
import com.bankDomain.BankingApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<UserDto> createUser (@RequestBody UserDto userDto)
    {
        return ResponseEntity.status(HttpStatus.OK).body(userService.createUser(userDto));
    }



}
