package com.test.treino.service.mapper;

import com.test.treino.model.request.UserRequest;
import com.test.treino.persistence.Entity.User;
import com.test.treino.persistence.repository.UserRepository;
import com.test.treino.service.Mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
    classe que implementa um método de conversão
    de UserRequest para User, 
    utilizando uma interface Mapper  
*/

@Service
public class UserRequestMapper implements Mapper<UserRequest, User> {

    /*
     * método para converter UserRequest para objeto User preciso convertê-lo para
     * salvar no banco
     */
    @Override
    public User map(UserRequest input) {

        if (input == null) {
            return null;
        }

        User obj = new User();

        obj.setEmail(input.getEmail());
        obj.setName(input.getName());

        return obj;
    }

}
