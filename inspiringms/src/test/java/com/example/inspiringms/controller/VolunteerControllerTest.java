package com.example.inspiringms.controller;

import com.example.inspiringms.model.Entities.User;
import com.example.inspiringms.model.Entities.Volunteer;
import com.example.inspiringms.model.Service.VolunteerService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.*;

class VolunteerControllerTest {
    @Mock
    VolunteerService volunteerService;
    @InjectMocks
    VolunteerController volunteerController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testGetVolunteers() {
        when(volunteerService.getVolunteers()).thenReturn(Arrays.<Volunteer>asList(new Volunteer(0, "specialty", "expreince", new User(0, "username", "email", 0, "avatar", 0, 0, "gender", "city", "descr"))));

        List<Volunteer> result = volunteerController.getVolunteers();
        Assertions.assertEquals(Arrays.<Volunteer>asList(new Volunteer(0, "specialty", "expreince", new User(0, "username", "email", 0, "avatar", 0, 0, "gender", "city", "descr"))), result);
    }

    @Test
    void testRegisterNewVolunteer() {
        volunteerController.registerNewVolunteer(new Volunteer(0, "specialty", "expreince", new User(0, "username", "email", 0, "avatar", 0, 0, "gender", "city", "descr")));
    }

    @Test
    void testDeleteVolunteer() {
        volunteerController.deleteVolunteer("volunteerId");
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme