package com.example.currencyconverter.service.dto;

import java.util.Map;

public class ExchangeRateResponse {

    private Map<String, Double> rates;

    public Map<String, Double> getRates() {
        return rates;
    }

    public void setRates(Map<String, Double> rates) {
        this.rates = rates;
    }

    public double getRate(String currency) {
        return rates.get(currency);
    }
}
