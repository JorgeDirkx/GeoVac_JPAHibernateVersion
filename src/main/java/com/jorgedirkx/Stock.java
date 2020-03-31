package com.jorgedirkx;

import javax.persistence.*;

@Entity
@Table(name = "stock")
public class Stock {

    @Id
    @GeneratedValue
    private int stockId;
    private int quantity;
    @OneToOne
    private Vaccine vaccine;

    public int getStockId() {
        return stockId;
    }

    public void setStockId(int stockId) {
        this.stockId = stockId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Vaccine getVaccine() {
        return vaccine;
    }

    public void setVaccine(Vaccine vaccine) {
        this.vaccine = vaccine;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "stockId=" + stockId +
                ", quantity=" + quantity +
                ", vaccine=" + vaccine +
                '}';
    }
}
