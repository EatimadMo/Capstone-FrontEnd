package com.example.inspiringms.model.Repository;



import com.example.inspiringms.model.Entities.Disabled;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DisabledRepository  extends JpaRepository<Disabled, Integer> {
}

