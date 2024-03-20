package com.faizal108.jwt.controller;

import com.faizal108.jwt.entity.User;
import com.faizal108.jwt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/api/v1/auth/")
public class HomeController {

    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public List<User> getUser(){
        return this.userService.getUsers();
    }

    @GetMapping("/current-user")
    public String getLoggedInUser(Principal principal){
        return "Welcome : " + principal.getName();
    }
}
