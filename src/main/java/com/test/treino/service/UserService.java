package com.test.treino.service;

import java.util.List;

import com.test.treino.model.request.UserRequest;
import com.test.treino.model.response.UserResponse;

// interface é uma classe abstrata que agrupa um número indeterminado de métodos
// com corpos vazios, apenas o que vai retornar e receber como parâmetro
public interface UserService {

    UserResponse criar(UserRequest request);

    List<UserResponse> listar();

    UserResponse listarUserId(Long id);

    UserResponse atualizar(Long id, UserRequest request);

    void deletar(Long id);
}
