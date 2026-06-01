package com.example.books_management.controllers;

import com.example.books_management.commonUtils.CommonResponseBean;
import com.example.books_management.model.User;
import com.example.books_management.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {

    UserService userService;
    UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/create")
    public CommonResponseBean createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @PostMapping("/get")
    public CommonResponseBean getUser(@RequestBody User user) {
        return userService.getUser(user);
    }

    @GetMapping("/get")
    public CommonResponseBean getAllUsers() {
        return userService.getAllUsers();
    }

    @PatchMapping("/{id}")
    public CommonResponseBean patchUser(@PathVariable Integer id, @RequestBody User user) {
        return userService.patchUserName(id, user);
    }
}
