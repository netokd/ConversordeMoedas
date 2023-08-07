package com.conversor;

public class Currency {
    private String currencyCode; // Código da moeda (por exemplo, "USD" para Dólar Americano)
    private double exchangeRate; // Taxa de câmbio em relação ao BRL

    public Currency(String currencyCode, double exchangeRate) {
        this.currencyCode = currencyCode;
        this.exchangeRate = exchangeRate;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public double getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }
}
