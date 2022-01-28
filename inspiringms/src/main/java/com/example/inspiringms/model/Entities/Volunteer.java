package com.example.inspiringms.model.Entities;

import javax.persistence.*;

        import com.fasterxml.jackson.annotation.JsonIgnore;

        import java.util.ArrayList;
        import java.util.List;

@Entity
@Table
public class Volunteer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int volunteerId;
    private String specialty;
    private String expreince;
//    private int id ;

    @OneToOne
//            (cascade = CascadeType.ALL)
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

    public Volunteer(int volunteerId, String specialty, String expreince, User user) {
        this.volunteerId = volunteerId;
        this.specialty = specialty;
        this.expreince = expreince;
        this.user = user;
    }


    public Volunteer() {
    }

    public int getVolunteerId() {
        return volunteerId;
    }

    public void setVolunteerId(int volunteerId) {
        this.volunteerId = volunteerId;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getExpreince() {
        return expreince;
    }

    public void setExpreince(String expreince) {
        this.expreince = expreince;
    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Volunteer{" +
                "volunteerId=" + volunteerId +
                ", specialty='" + specialty + '\'' +
                ", expreince='" + expreince + '\'' +
                ", user=" + user +
                '}';
    }

}
