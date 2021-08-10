package com.test.treino.convert;

import java.util.List;
import java.util.stream.Collectors;

import com.test.treino.model.response.UserResponse;
import com.test.treino.model.request.UserRequest;
import com.test.treino.persistence.Entity.User;

public class userConvert {

    public UserResponse toUserDto(User user) {
        UserResponse userDto = new UserResponse();
        userDto.setName(user.getName());
        userDto.setEmail(user.getEmail());
        return userDto;
    }

    public List<UserResponse> toUserDto(List<User> user) {
        return user.stream().map(x -> toUserDto(x)).collect(Collectors.toList());
    }

    public UserRequest toUserForm(User user) {
        UserRequest userForm = new UserRequest();
        userForm.setName(user.getName());
        userForm.setEmail(user.getEmail());
        return userForm;
    }

    public List<UserRequest> toUserForm(List<User> user) {
        return user.stream().map(x -> toUserForm(x)).collect(Collectors.toList());
    }
}
