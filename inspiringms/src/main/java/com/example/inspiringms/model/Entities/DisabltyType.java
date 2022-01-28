//package com.example.inspiringms.model.Entities;
//
//
//import com.fasterxml.jackson.annotation.JsonIdentityInfo;
//import com.fasterxml.jackson.annotation.ObjectIdGenerators;
//
//import javax.persistence.*;
//import java.util.List;
//
//@Entity
//@Table
//@JsonIdentityInfo(
//        generator = ObjectIdGenerators.PropertyGenerator.class,
//        property = "dtypeId")
//public class DisabltyType {
//    @Id
//    private int dtypeId;
//    private String name ;
//    private String type;
//    private String info;
//
//
//    @ManyToMany
//    @JoinTable(name = "disabiltyType_disabled",
//            joinColumns = @JoinColumn(name = "dtypeId"),
//            inverseJoinColumns = @JoinColumn(name = "disabledId"))
//    private List<Disabled> disableds;
//
//    public DisabltyType(int dtypeId, String name, String type, String info, List<Disabled> disableds) {
//        this.dtypeId = dtypeId;
//        this.name = name;
//        this.type = type;
//        this.info = info;
//        this.disableds = disableds;
//    }
//
//
////    public DisabltyType(int dtypeId, String name, String type, String info) {
////        this.dtypeId = dtypeId;
////        this.name = name;
////        this.type = type;
////        this.info = info;
////    }
//
//    public DisabltyType() {
//    }
//
//    public int getDtypeId() {
//        return dtypeId;
//    }
//
//    public void setDtypeId(int dtypeId) {
//        this.dtypeId = dtypeId;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getType() {
//        return type;
//    }
//
//    public void setType(String type) {
//        this.type = type;
//    }
//
//    public String getInfo() {
//        return info;
//    }
//
//    public void setInfo(String info) {
//        this.info = info;
//    }
//
////    public List<Disabled> getDisableds() {
////        return disableds;
////    }
////
////    public void setDisableds(List<Disabled> disableds) {
////        this.disableds = disableds;
////    }
//
//    public List<Disabled> getDisableds() {
//        return disableds;
//    }
//
//    public void setDisableds(List<Disabled> disableds) {
//        this.disableds = disableds;
//    }
//}
