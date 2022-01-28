package com.example.inspiringms.model.Entities;


import javax.persistence.*;

@Entity
@Table
public class User {
    @Id
    private int id ;
    private String username ;
    private String email;
    private int pass ;
    private String avatar;
    private int phn ;
    private int age ;
    private String gender;
    private String city ;
    private String descr ;

    public User(int id, String username, String email, int pass, String avatar, int phn, int age, String gender, String city, String descr) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.pass = pass;
        this.avatar = avatar;
        this.phn = phn;
        this.age = age;
        this.gender = gender;
        this.city = city;
        this.descr = descr;
    }


    //    public User(String username, String email, int pass, int phn, int age, String gender, String city, String descr) {
//        this.username = username;
//        this.email = email;
//        this.pass = pass;
//        this.phn = phn;
//        this.age = age;
//        this.gender = gender;
//        this.city = city;
//        this.descr = descr;
//    }

    public User() {
    }


    @OneToOne(mappedBy = "user")
    // @JsonIgnore
    private Disabled disabled;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPass() {
        return pass;
    }

    public void setPass(int pass) {
        this.pass = pass;
    }

    public String getAvatar() {return avatar;}

    public void setAvatar(String avatar) {this.avatar = avatar;}

    public int getPhn() {
        return phn;
    }

    public void setPhn(int phn) {
        this.phn = phn;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", pass=" + pass +
                ", avatar='" + avatar + '\'' +
                ", phn=" + phn +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", city='" + city + '\'' +
                ", descr='" + descr + '\'' +
                '}';
    }


    //    @Override
//    public String toString() {
//        return "User{" +
//                "id=" + id +
//                ", username='" + username + '\'' +
//                ", email='" + email + '\'' +
//                ", pass=" + pass +
//                ", phn=" + phn +
//                ", age=" + age +
//                ", gender='" + gender + '\'' +
//                ", city='" + city + '\'' +
//                ", descr='" + descr + '\'' +
//                '}';
//    }
}

