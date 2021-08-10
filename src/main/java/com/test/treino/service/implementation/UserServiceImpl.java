package com.test.treino.service.implementation;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import com.test.treino.model.request.UserRequest;
import com.test.treino.model.response.UserResponse;
import com.test.treino.persistence.Entity.User;
import com.test.treino.persistence.repository.UserRepository;
import com.test.treino.service.UserService;
import com.test.treino.service.mapper.UserRequestMapper;
import com.test.treino.service.mapper.UserResponseMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javassist.NotFoundException;

// implementa uma interface, é um contrato que tem que ser feito para implementar
// os métodos, é obrigatório
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repo;

    @Autowired
    private UserRequestMapper requestMapper;

    @Autowired
    private UserResponseMapper responseMapper;
    /*
     * - Lógica de como funciona as conversões de request para entity e entity para
     * response -
     * 
     * @Override public UserResponse adicionar(UserRequest request) {
     * 
     * // apenas o objeto User persiste no banco; User user = new User();
     * 
     * 
     * // Request -> persistir no banco -> devolver os dados(response)
     * 
     * // Request user.setEmail(request.getEmail());
     * user.setName(request.getName());
     * 
     * // persistir no banco repo.saveAndFlush(user);
     * 
     * // devolver os dados(response) UserResponse response = new UserResponse();
     * response.setEmail(user.getEmail()); response.setName(user.getName());
     * response.setId(user.getId());
     * 
     * return response; }
     */

    @Override
    public UserResponse criar(UserRequest request) {

        // requisição -> User
        User user = requestMapper.map(request);

        // User salva no banco
        User db = repo.saveAndFlush(user);

        // banco -> resposta
        return responseMapper.map(db);

    }

    @Override
    public List<UserResponse> listar() {

        // buscar no banco
        List<User> lista = repo.findAll();

        // converter para response
        return responseMapper.map(lista);

    }

    @Override
    public UserResponse listarUserId(Long id) {

        // buscar no banco por id
        User user = repo.getById(id);

        // devolve os dados
        try {
            if (user != null) {
                return responseMapper.map(user);
            }

        } catch (EntityNotFoundException e) {
            throw new EntityNotFoundException("o objeto com id:" + id + " não foi encontrado!");
        }

        // devolve nulo
        return null;

    }

    @Override
    public UserResponse atualizar(Long id, UserRequest request) {
        return null;
    }

    @Override
    public void deletar(Long id) {
        // TODO Auto-generated method stub

    }

}
