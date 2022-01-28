package com.example.inspiringms.model.Service;


import com.example.inspiringms.model.Entities.Disabled;
import com.example.inspiringms.model.Repository.DisabledRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DisabledService {

    private DisabledRepository disabledRepository;

    @Autowired
    public DisabledService(DisabledRepository disabledRepository) {
        this.disabledRepository = disabledRepository;
    }

    public List<Disabled> getDisableds() {
        return disabledRepository.findAll();
    }

    public Optional<Disabled> getDisabled(Integer disabledId) {
        return disabledRepository.findById(disabledId);
    }

    public void addNewDisabled(Disabled disabled) {
        disabledRepository.save(disabled);

    }
    public void deleteDisabled(Integer disabledId) {
        disabledRepository.deleteById(disabledId);
        //boolean exist = disabledRepository.existsById(disabledId);
        // put a condition on 'exist'. if exist then delete
    }
}