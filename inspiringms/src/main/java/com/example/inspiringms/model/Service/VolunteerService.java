package com.example.inspiringms.model.Service;

import com.example.inspiringms.model.Entities.Volunteer;
import com.example.inspiringms.model.Repository.VolunteerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class VolunteerService {



    private VolunteerRepository volunteerRepository;

    @Autowired
    public VolunteerService(VolunteerRepository volunteerRepository) {
        this.volunteerRepository = volunteerRepository;
    }

    public List<Volunteer> getVolunteers() {
        return volunteerRepository.findAll();
    }

    public Optional<Volunteer> getVolunteer(Integer volunteerId) {
        return volunteerRepository.findById(volunteerId);
    }

    public void addNewVolunteer(Volunteer volunteer) {
        volunteerRepository.save(volunteer);

    }
    public void deleteVolunteer(Integer volunteerId) {
        volunteerRepository.deleteById(volunteerId);
        //boolean exist = disabledRepository.existsById(disabledId);
        // put a condition on 'exist'. if exist then delete
    }
}