package com.jorgedirkx;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table (name = "client")
public class Client {

    @Id @GeneratedValue
    private int id;
    private String name;
    private Date dob;
    private String passportNr;
    private String gender;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getPassportNr() {
        return passportNr;
    }

    public void setPassportNr(String passportNr) {
        this.passportNr = passportNr;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                ", passportNr='" + passportNr + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
