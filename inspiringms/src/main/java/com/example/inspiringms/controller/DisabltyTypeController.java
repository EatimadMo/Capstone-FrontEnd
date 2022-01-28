//package com.example.inspiringms.controller;
//
//
//
//
//
//import com.example.inspiringms.model.Entities.Disabled;
//import com.example.inspiringms.model.Entities.DisabltyType;
//import com.example.inspiringms.model.Service.DisabledService;
//import com.example.inspiringms.model.Service.DisabltyTypeService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import java.util.Optional;
//
//@RestController
//@RequestMapping(path = "api/disabltyType")
//public class DisabltyTypeController {
////        <disabltyTypeService> {
//
//    private DisabltyTypeService disabltyTypeService;
//
//    @Autowired
//    public DisabltyTypeController(DisabltyTypeService disabltyTypeService) {
//        this.disabltyTypeService = disabltyTypeService;
//    }
//
//    @GetMapping
//    public List<DisabltyType> getDisabltyTypes() {
//        return disabltyTypeService.getDisabltyTypes();
//    }
//
//
//    @GetMapping(path = "{disabledId}")
//    public Optional<DisabltyType> getDisabltyType(@PathVariable (name = "dtypeId") Integer dtypeId) {
//        return disabltyTypeService.getDisabltyType(dtypeId);
//    }
//
//    @PostMapping(path= "add")
//    public void registerNewDisabltyType(@RequestBody DisabltyType disabltyType){
//        disabltyTypeService.addNewDisabltyType(disabltyType);
//    }
//    @DeleteMapping(path = "delete/{dtypeId}")
//    public void deleteDisabltyType(@PathVariable ("dtypeId") Integer dtypeId){
//        disabltyTypeService.deleteDisabltyType(dtypeId);
//    }
//}
//

