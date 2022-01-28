package com.example.inspiringms.model.Service;

import com.example.inspiringms.model.Entities.User;
import com.example.inspiringms.model.Entities.Volunteer;
import com.example.inspiringms.model.Repository.VolunteerRepository;
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

class VolunteerServiceTest {
    @Mock
    VolunteerRepository volunteerRepository;
    @InjectMocks
    VolunteerService volunteerService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testGetVolunteers() {
        List<Volunteer> result = volunteerService.getVolunteers();
        Assertions.assertEquals(Arrays.<Volunteer>asList(new Volunteer(0, "specialty", "expreince", new User(0, "username", "email", 0, "avatar", 0, 0, "gender", "city", "descr"))), result);
    }

    @Test
    void testGetVolunteer() {
        Optional<Volunteer> result = volunteerService.getVolunteer(Integer.valueOf(0));
        Assertions.assertEquals(null, result);
    }

    @Test
    void testAddNewVolunteer() {
        volunteerService.addNewVolunteer(new Volunteer(0, "specialty", "expreince", new User(0, "username", "email", 0, "avatar", 0, 0, "gender", "city", "descr")));
    }

    @Test
    void testDeleteVolunteer() {
        volunteerService.deleteVolunteer(Integer.valueOf(0));
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme