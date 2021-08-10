package com.test.treino.controller;

import java.util.List;

import com.test.treino.model.request.UserRequest;
import com.test.treino.model.response.UserResponse;
import com.test.treino.service.UserService;
import com.test.treino.service.implementation.UserServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UseController {

    @Autowired
    private UserServiceImpl service;

    @PostMapping("/newUser")
    public ResponseEntity<UserResponse> criar(@RequestBody UserRequest request) {

        return ResponseEntity.status(HttpStatus.CREATED).body(service.criar(request));
    }

    @GetMapping
    public ResponseEntity<List<UserResponse>> listar() {
        return ResponseEntity.ok(service.listar());
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserResponse> listarUserId(@PathVariable Long id) {

        return ResponseEntity.ok(service.listarUserId(id));
    }

}
