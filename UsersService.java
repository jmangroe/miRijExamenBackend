package com.example.demo.service.impl;

import com.example.demo.entity.Users;
import com.example.demo.repos.UsersRepository;
import com.example.demo.service.UserServiceInt;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@AllArgsConstructor(onConstructor = @__({@Autowired}))
public class UsersService implements UserServiceInt {
    private final UsersRepository usersRepository;

    @Override
    public void save(Users users){
        usersRepository.save(users);
    }
    @Override
    public List<Users> findAllUsers(){
        return usersRepository.findAll();
    }
}
