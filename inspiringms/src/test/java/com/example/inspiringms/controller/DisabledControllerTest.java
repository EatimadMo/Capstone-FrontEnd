package com.example.inspiringms.controller;

import com.example.inspiringms.model.Entities.Disabled;
import com.example.inspiringms.model.Entities.User;
import com.example.inspiringms.model.Service.DisabledService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.*;

class DisabledControllerTest {
    @Mock
    DisabledService disabledService;
    @InjectMocks
    DisabledController disabledController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testGetDisableds() {
        when(disabledService.getDisableds()).thenReturn(Arrays.<Disabled>asList(new Disabled(0, "disableType", "disableDegree", new User(0, "username", "email", 0, "avatar", 0, 0, "gender", "city", "descr"))));

        List<Disabled> result = disabledController.getDisableds();
        Assertions.assertEquals(Arrays.<Disabled>asList(new Disabled(0, "disableType", "disableDegree", new User(0, "username", "email", 0, "avatar", 0, 0, "gender", "city", "descr"))), result);
    }

    @Test
    void testRegisterNewDisabled() {
        disabledController.registerNewDisabled(new Disabled(0, "disableType", "disableDegree", new User(0, "username", "email", 0, "avatar", 0, 0, "gender", "city", "descr")));
    }

    @Test
    void testDeleteDisabled() {
        disabledController.deleteDisabled("disabledId");
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme