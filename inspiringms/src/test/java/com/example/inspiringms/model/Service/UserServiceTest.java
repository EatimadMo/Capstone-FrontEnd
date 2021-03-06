package com.example.inspiringms.model.Service;

import com.example.inspiringms.model.Entities.User;
import com.example.inspiringms.model.Repository.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.mockito.Mockito.*;

class UserServiceTest {
    @Mock
    UserRepository userRepository;
    @InjectMocks
    UserService userService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testGetUsers() {
        List<User> result = userService.getUsers();
        Assertions.assertEquals(Arrays.<User>asList(new User(0, "username", "email", 0, "avatar", 0, 0, "gender", "city", "descr")), result);
    }

    @Test
    void testGetUser() {
        Optional<User> result = userService.getUser(Integer.valueOf(0));
        Assertions.assertEquals(null, result);
    }

    @Test
    void testAddNewUser() {
        userService.addNewUser(new User(0, "username", "email", 0, "avatar", 0, 0, "gender", "city", "descr"));
    }

    @Test
    void testDeleteUser() {
        userService.deleteUser(Integer.valueOf(0));
    }

    @Test
    void testGetCheck() {
        when(userRepository.findPasswordByEmail(anyString())).thenReturn("findPasswordByEmailResponse");
        when(userRepository.existsByEmail(anyString())).thenReturn(Boolean.TRUE);

        String result = userService.getCheck("email", "pass");
        Assertions.assertEquals("replaceMeWithExpectedResult", result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme