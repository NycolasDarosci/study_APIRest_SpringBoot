package com.test.treino.persistence.repository;

import java.util.Optional;

import com.test.treino.model.request.UserRequest;
import com.test.treino.persistence.Entity.User;

import org.springframework.data.jpa.repository.JpaRepository;

// extends - herdando todos os métodos do JpaRepository
public interface UserRepository extends JpaRepository<User, Long> {

    UserRequest save(UserRequest user);

}
