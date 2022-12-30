package org.personalProjects.model;

import java.time.LocalDate;
import java.util.HashMap;

public class CurrencyModel {

    private String base;
    private LocalDate date;
    private HashMap <String, Float> rates = new HashMap<>();

    // Default
    public CurrencyModel() {
    }

    // Constructor call by date
    public CurrencyModel(LocalDate date, HashMap<String, Float> rates) {
        this.date = date;
        this.rates = rates;
    }

    public CurrencyModel(String base, LocalDate date, HashMap<String, Float> rates) {
        this.base = base;
        this.date = date;
        this.rates = rates;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public HashMap<String, Float> getRates() {
        return rates;
    }

    public void setRates(HashMap<String, Float> rates) {
        this.rates = rates;
    }

    @Override
    public String toString() {
        return "currency{" +
                "base='" + base + '\'' +
                ", date=" + date +
                ", rates=" + rates +
                '}';
    }
}
