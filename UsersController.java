package com.example.demo.controler;

import com.example.demo.entity.Users;
import com.example.demo.service.impl.UsersService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
public class UsersController {
    private final UsersService usersService;

    @GetMapping("/get/all/users")
    public ResponseEntity<List<Users>> allUsers() {
        List<Users> users = usersService.findAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @PostMapping("/list")
    public void newUser(@RequestBody Users users) {
        usersService.save(users);

    }

}
