package com.faizal108.jwt.service;

import com.faizal108.jwt.entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

@Service
public class UserService {

    private List<User> users = new ArrayList<>();

    public UserService(){
        users.add(new User(UUID.randomUUID().toString(), "Faizal Kadiwal","faizal@gmail.com"));
        users.add(new User(UUID.randomUUID().toString(), "Muskan Kadiwal","muskan@gmail.com"));
        users.add(new User(UUID.randomUUID().toString(), "John Doe","john@gmail.com"));
        users.add(new User(UUID.randomUUID().toString(), "Alfiza Kadiwal","alfiza@gmail.com"));
    }

    public List<User> getUsers(){
        return this.users;
    }
}
