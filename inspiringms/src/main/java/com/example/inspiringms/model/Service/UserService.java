package com.example.inspiringms.model.Service;

import com.example.inspiringms.model.Entities.User;
import com.example.inspiringms.model.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUser(Integer userId) {
        return userRepository.findById(userId);
    }

    public void addNewUser(User user) {
        userRepository.save(user);

    }
    public void deleteUser(Integer userId) {
        userRepository.deleteById(userId);
    }

    public String getCheck(String email ,String pass) {
        if( userRepository.existsByEmail(email) == true){
            String passw = userRepository.findPasswordByEmail(email);
            if (passw.equals(pass)){
                return "authenticated" ;
            }
            else {
                return "Password does not match"; }
        }

        return "Username not found";
    }
}

