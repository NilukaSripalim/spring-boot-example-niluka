package com.example.niluka.jpa.h2.spring.boot.model;

import javax.persistence.*;

/**
 * This is the basic Entity class.
 */
@Entity
@Table(name = "Contact_Details")
public class RestModel {
    //id
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name="First_name")
    private String fname;
    @Column(name="Last_name")
    private String lname;
    //age
    private Integer age;

    public RestModel() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
