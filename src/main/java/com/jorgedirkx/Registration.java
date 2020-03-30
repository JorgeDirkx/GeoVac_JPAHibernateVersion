package com.jorgedirkx;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "registration")
public class Registration {

    @Id
    @GeneratedValue
    private int id;
    private Date vaccination2Months;
    private Date vaccination3Months;
    private Date vaccination4Months;
    private Date vaccination12Months;
    private Date vaccination15Months;
    private Date vaccination6Yrs;
    private Date vaccination12Yrs;
    private Date vaccination14Yrs;

    @ManyToOne
            @JoinColumn(name = "id")
    Vaccine vaccine;
    @ManyToOne
            @JoinColumn(name ="id")
    Client client;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getVaccination2Months() {
        return vaccination2Months;
    }

    public void setVaccination2Months(Date vaccination2Months) {
        this.vaccination2Months = vaccination2Months;
    }

    public Date getVaccination3Months() {
        return vaccination3Months;
    }

    public void setVaccination3Months(Date vaccination3Months) {
        this.vaccination3Months = vaccination3Months;
    }

    public Date getVaccination4Months() {
        return vaccination4Months;
    }

    public void setVaccination4Months(Date vaccination4Months) {
        this.vaccination4Months = vaccination4Months;
    }

    public Date getVaccination12Months() {
        return vaccination12Months;
    }

    public void setVaccination12Months(Date vaccination12Months) {
        this.vaccination12Months = vaccination12Months;
    }

    public Date getVaccination15Months() {
        return vaccination15Months;
    }

    public void setVaccination15Months(Date vaccination15Months) {
        this.vaccination15Months = vaccination15Months;
    }

    public Date getVaccination6Yrs() {
        return vaccination6Yrs;
    }

    public void setVaccination6Yrs(Date vaccination6Yrs) {
        this.vaccination6Yrs = vaccination6Yrs;
    }

    public Date getVaccination12Yrs() {
        return vaccination12Yrs;
    }

    public void setVaccination12Yrs(Date vaccination12Yrs) {
        this.vaccination12Yrs = vaccination12Yrs;
    }

    public Date getVaccination14Yrs() {
        return vaccination14Yrs;
    }

    public void setVaccination14Yrs(Date vaccination14Yrs) {
        this.vaccination14Yrs = vaccination14Yrs;
    }

    public Vaccine getVaccine() {
        return vaccine;
    }

    public void setVaccine(Vaccine vaccine) {
        this.vaccine = vaccine;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Registration{" +
                "id=" + id +
                ", vaccination2Months=" + vaccination2Months +
                ", vaccination3Months=" + vaccination3Months +
                ", vaccination4Months=" + vaccination4Months +
                ", vaccination12Months=" + vaccination12Months +
                ", vaccination15Months=" + vaccination15Months +
                ", vaccination6Yrs=" + vaccination6Yrs +
                ", vaccination12Yrs=" + vaccination12Yrs +
                ", vaccination14Yrs=" + vaccination14Yrs +
                ", vaccine=" + vaccine +
                ", client=" + client +
                '}';
    }
}
