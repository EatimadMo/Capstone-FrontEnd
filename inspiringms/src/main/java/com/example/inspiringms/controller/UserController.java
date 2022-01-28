package com.example.inspiringms.controller;

import com.example.inspiringms.model.Entities.User;
import com.example.inspiringms.model.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

//@CrossOrigin(origins = "http:/localhost:8080")
@RestController
@RequestMapping(path = "api/inspir")
public class UserController<userService> {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getUsers() {
        return userService.getUsers();
    }


    @GetMapping(path = "{userId}")
    public Optional<User> getUser(@PathVariable (name = "userId") Integer userId) {
        return userService.getUser(userId);
    }
    @GetMapping(path = "login")
    public String checkLogin(@RequestParam (name = "email") String email ,
                             @RequestParam (name = "password") String password ) {
        return userService.getCheck(email,password);

    }

    @PostMapping(path= "add")
    public void registerNewUser(@RequestBody User user){
        userService.addNewUser(user);
    }

    @DeleteMapping(path = "delete/{userId}")
    public void deleteUser(@PathVariable ("userId") Integer userId){
        userService.deleteUser(userId);
    }
}