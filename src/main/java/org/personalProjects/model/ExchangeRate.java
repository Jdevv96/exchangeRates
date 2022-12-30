package org.personalProjects.model;


import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class ExchangeRate {

    private String base;
    private Date date;
    private Map<String, Double> rates;

    public ExchangeRate() {
    }

    public ExchangeRate(Map<String, Double> rates) {
        this.rates = rates;
    }

    public ExchangeRate(String base, Date date, Map<String, Double> rates) {
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Map<String, Double> getRates() {
        return rates;
    }

    public void setRates(HashMap<String, Double> rates) {
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
