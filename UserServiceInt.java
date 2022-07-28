package com.example.demo.service;

import com.example.demo.entity.Users;

import java.util.List;

public interface UserServiceInt {
    public void save(Users users);
    public List<Users> findAllUsers();
}
