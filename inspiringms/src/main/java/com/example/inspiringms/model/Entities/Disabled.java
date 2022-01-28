package com.example.inspiringms.model.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class Disabled {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int disabledId;
    private String disableType;
    private String disableDegree;
//    private int id ;

    @OneToOne
//    (cascade = CascadeType.ALL)
    @JoinColumn(name = "id", unique = true, nullable = false)
    private User user;


//    @ManyToMany(mappedBy = "disableds")
//    @JsonIgnore
//    private List<DisabltyType> disabltyTypes = new ArrayList<>();

//    public Disabled(int disabledId, String disableType, String disableDegree, User user, List<DisabltyType> disabltyTypes) {
//        this.disabledId = disabledId;
//        this.disableType = disableType;
//        this.disableDegree = disableDegree;
//        this.user = user;
//        this.disabltyTypes = disabltyTypes;
//    }


    public Disabled(int disabledId, String disableType, String disableDegree, User user) {
        this.disabledId = disabledId;
        this.disableType = disableType;
        this.disableDegree = disableDegree;
        this.user = user;
    }

    public Disabled() {
    }



    public int getDisabledId() {
        return disabledId;
    }

    public void setDisabledId(int disabledId) {
        this.disabledId = disabledId;
    }

    public String getDisableType() {
        return disableType;
    }

    public void setDisableType(String disableType) {
        this.disableType = disableType;
    }

    public String getDisableDegree() {
        return disableDegree;
    }

    public void setDisableDegree(String disableDegree) {
        this.disableDegree = disableDegree;
    }

//    public int getId() {
//        return id;
//    }

//    public void setId(int id) {
//        this.id = id;
//    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

//    public List<DisabltyType> getDisabltyTypes() {
//        return disabltyTypes;
//    }
//
//    public void setDisabltyTypes(List<DisabltyType> disabltyTypes) {
//        this.disabltyTypes = disabltyTypes;
//    }

//    public List<DisabltyType> getDisabltyTypes() {
//        return disabltyTypes;
//    }
//
//    public void setDisabltyTypes(List<DisabltyType> disabltyTypes) {
//        this.disabltyTypes = disabltyTypes;
//    }

    @Override
    public String toString() {
        return "Disabled{" +
                "disabledId=" + disabledId +
                ", disableType='" + disableType + '\'' +
                ", disableDegree='" + disableDegree + '\'' +
//                ", id=" + id +
                ", user=" + user +
                '}';
    }
}
