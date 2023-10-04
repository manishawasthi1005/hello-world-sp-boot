package com.manish.helloworldsb.controller;

import com.manish.helloworldsb.model.User;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
public class UsersController {
    @RequestMapping("/users")
    public List<User> getUsers()
    {
        List<User> usersList =  new ArrayList<User>();
        usersList.add(new User("1", "John", "Mcdliech", "john.mac@test.com"));
        usersList.add(new User("2", "Thomas", "Weisner", "thomas.weisner@gmail.com"));
        usersList.add(new User("3", "Emil", "Gonsalwis", "emil.gonzalwis@hotmail.com"));
        return usersList;
    }
}
