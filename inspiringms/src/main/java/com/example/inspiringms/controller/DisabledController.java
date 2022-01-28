package com.example.inspiringms.controller;

import com.example.inspiringms.model.Entities.Disabled;
import com.example.inspiringms.model.Service.DisabledService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/disabled")
public class DisabledController {
//        <disabledService> {

    private DisabledService disabledService;

    @Autowired
    public DisabledController(DisabledService disabledService) {
        this.disabledService = disabledService;
    }

    @GetMapping
    public List<Disabled> getDisableds() {
        return disabledService.getDisableds();
    }

    @PostMapping(path= "add")
    public void registerNewDisabled(@RequestBody Disabled disabled){
        disabledService.addNewDisabled(disabled);
    }





//    @GetMapping(path = "{disabledId}")
//    public Optional<Disabled> getDisabled(@PathVariable (name = "disabledId") Integer disabledId) {
//        return disabledService.getDisabled(disabledId);
//    }


    @DeleteMapping(path = "delete/{disabledId}")
    public void deleteDisabled(@PathVariable ("disabledId") String  disabledId){
        int disId = Integer.parseInt(disabledId);
        disabledService.deleteDisabled(disId);
    }
}
