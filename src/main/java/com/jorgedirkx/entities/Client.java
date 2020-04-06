package com.jorgedirkx.entities;

import javax.persistence.*;
import java.util.*;

@Entity
@Table (name = "client")

/*@NamedQueries({
        @NamedQuery(name = "Client.findByName", query = "SELECT c from Client c where c.name = :name"),
        @NamedQuery(name ="Client.findAll", query = "SELECT c  from Client c")
})

 */

public class Client {

    @Id @GeneratedValue
    private int id;
    private String name;
    private Date dob;
    private String passportNr;
    private String gender;

    public Client() {
    }

    public Client(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Client (int id, String name, Date dob, String passportNr, String gender){
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.passportNr = passportNr;
        this.gender = gender;
    }

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
