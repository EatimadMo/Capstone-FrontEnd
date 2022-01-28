package com.example.inspiringms.model.Service;

import com.example.inspiringms.model.Entities.Disabled;
import com.example.inspiringms.model.Entities.User;
import com.example.inspiringms.model.Repository.DisabledRepository;
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

class DisabledServiceTest {
    @Mock
    DisabledRepository disabledRepository;
    @InjectMocks
    DisabledService disabledService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testGetDisableds() {
        List<Disabled> result = disabledService.getDisableds();
        Assertions.assertEquals(Arrays.<Disabled>asList(new Disabled(0, "disableType", "disableDegree", new User(0, "username", "email", 0, "avatar", 0, 0, "gender", "city", "descr"))), result);
    }

    @Test
    void testGetDisabled() {
        Optional<Disabled> result = disabledService.getDisabled(Integer.valueOf(0));
        Assertions.assertEquals(null, result);
    }

    @Test
    void testAddNewDisabled() {
        disabledService.addNewDisabled(new Disabled(0, "disableType", "disableDegree", new User(0, "username", "email", 0, "avatar", 0, 0, "gender", "city", "descr")));
    }

    @Test
    void testDeleteDisabled() {
        disabledService.deleteDisabled(Integer.valueOf(0));
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme