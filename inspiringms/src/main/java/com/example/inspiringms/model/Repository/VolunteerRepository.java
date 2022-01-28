package com.example.inspiringms.model.Repository;

import com.example.inspiringms.model.Entities.Volunteer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface VolunteerRepository  extends JpaRepository<Volunteer, Integer> {
}

