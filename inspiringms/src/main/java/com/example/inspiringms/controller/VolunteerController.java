package com.example.inspiringms.controller;


import com.example.inspiringms.model.Entities.Volunteer;
import com.example.inspiringms.model.Service.VolunteerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path = "api/volunteer")
public class VolunteerController {

    private VolunteerService volunteerService;

    @Autowired
    public VolunteerController(VolunteerService volunteerService) {
        this.volunteerService = volunteerService;
    }

    @GetMapping
    public List<Volunteer> getVolunteers() {
        return volunteerService.getVolunteers();
    }

    @PostMapping(path= "add")
    public void registerNewVolunteer(@RequestBody Volunteer volunteer){
        volunteerService.addNewVolunteer(volunteer);
    }




    @DeleteMapping(path = "delete/{volunteerId}")
    public void deleteVolunteer(@PathVariable ("volunteerId") String  volunteerId){
        int volId = Integer.parseInt(volunteerId);
        volunteerService.deleteVolunteer(volId);
    }
}
