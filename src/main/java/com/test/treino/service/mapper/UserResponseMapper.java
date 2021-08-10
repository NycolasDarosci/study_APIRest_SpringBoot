package com.test.treino.service.mapper;

import java.util.List;
import java.util.stream.Collectors;

import com.test.treino.model.response.UserResponse;
import com.test.treino.persistence.Entity.User;
import com.test.treino.service.Mapper;
import com.test.treino.service.MapperList;

import org.springframework.stereotype.Service;

/*
    interface Mapper que implementa 
    um método de conversão
    do User objeto para UserResponse, 

    
    Interface MapperList que converte um objeto List<User>
    para List<UserResponse>
*/

@Service
public class UserResponseMapper implements Mapper<User, UserResponse>, MapperList<User, UserResponse> {

    @Override
    public UserResponse map(User input) {

        if (input == null) {
            return null;
        }

        UserResponse response = new UserResponse();

        response.setId(input.getId());
        response.setEmail(input.getEmail());
        response.setName(input.getName());

        return response;
    }

    @Override
    public List<UserResponse> map(List<User> lista) {
        return lista.stream().map(x -> map(x)).collect(Collectors.toList());
    }

}
