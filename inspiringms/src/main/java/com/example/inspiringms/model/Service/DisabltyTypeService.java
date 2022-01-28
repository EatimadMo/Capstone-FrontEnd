//package com.example.inspiringms.model.Service;
//
//
//
//
//import com.example.inspiringms.model.Entities.Disabled;
//import com.example.inspiringms.model.Entities.DisabltyType;
//import com.example.inspiringms.model.Repository.DisabledRepository;
//import com.example.inspiringms.model.Repository.DisabltyTypeRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class DisabltyTypeService {
//
//    private DisabltyTypeRepository disabltyTypeRepository;
//
//    @Autowired
//    public DisabltyTypeService(DisabltyTypeRepository disabltyTypeRepository) {
//        this.disabltyTypeRepository = disabltyTypeRepository;
//    }
//
//    public List<DisabltyType> getDisabltyTypes() {
//        return disabltyTypeRepository.findAll();
//    }
//
//    public Optional<DisabltyType> getDisabltyType(Integer dtypeId) {
//        return disabltyTypeRepository.findById(dtypeId);
//    }
//
//    public void addNewDisabltyType(DisabltyType disabltyType) {
//        disabltyTypeRepository.save(disabltyType);
//
//    }
//    public void deleteDisabltyType(Integer dtypeId) {
//        disabltyTypeRepository.deleteById(dtypeId);
//        //boolean exist = disabltyTypeRepository.existsById(dtypeId);
//        // put a condition on 'exist'. if exist then delete
//    }
//}
//

