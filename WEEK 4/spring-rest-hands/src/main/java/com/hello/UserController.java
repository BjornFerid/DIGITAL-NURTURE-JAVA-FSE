package com.example.springresthandson.controller;

import com.example.springresthandson.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {


    private List<User> users = new ArrayList<>();


    @GetMapping
    public List<User> getAllUsers() {
        return users;
    }


    @PostMapping
    public String addUser(@RequestBody User user) {
        users.add(user);
        return "User added successfully!";
    }
}
