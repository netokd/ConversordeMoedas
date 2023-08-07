package com.conversor;

/*PARA FINS DIDATICOS IREI CRIAR O HASHMAP COM O CODIGO DAS MOEDAS E OS VALORES, VAI SER UM VALOR FIXO, PARA TESTES
*ONDE VAI SER O VALOR BASEADO NO BRL, ONDE SE CONVERTERIA TUDO PARA BRL E DEPOIS SE NECESSARIO PARA A MOEDA FINAL 
CASO NAO SEJA BRL A MOEDA FINAL.    
*/

import java.util.HashMap;
import java.util.Map;

public class CurrencyConverter {
    // Criar o HashMap para armazenar as moedas e suas taxas de câmbio
    private Map<String, Double> currencyExchangeRates = new HashMap<>();

    public CurrencyConverter() {
        // Adicionar taxas de câmbio ao HashMap
        currencyExchangeRates.put("BRL", 1.00); // PREÇO DO REAL VALOR BASE 1
        currencyExchangeRates.put("USD", 4.91); // PREÇO DO DOLAR AMERICANO EM RELAÇÃO AO BRL INDEXADO FIXAMENTE
        currencyExchangeRates.put("EUR", 5.39); // PREÇO DO EURO EM RELAÇÃO AO BRL INDEXADO FIXAMENTE
        currencyExchangeRates.put("CAD", 3.66); // PREÇO DO DOLAR CANADENSE EM RELAÇÃO AO BRL INDEXADO FIXAMENTE
        currencyExchangeRates.put("ARS", 0.017); // PREÇO DO PESO ARGENTINO EM RELAÇÃO AO BRL INDEXADO FIXAMENTE
        currencyExchangeRates.put("UYU", 0.13); // PREÇO DO PESO URUGUAIANO EM RELAÇÃO AO BRL INDEXADO FIXAMENTE
        currencyExchangeRates.put("CLP", 0.0057); // PREÇO DO PESO CHILENO EM RELAÇÃO AO BRL INDEXADO FIXAMENTE
        currencyExchangeRates.put("CNY", 0.68); // PREÇO DO YUAN CHINESE EM RELAÇÃO AO BRL INDEXADO FIXAMENTE
    }

    public static void main(String[] args) {
        // Aqui você pode criar uma instância de CurrencyConverter e usar o método
        // convertCurrency
        CurrencyConverter currencyConverter = new CurrencyConverter();
        System.out.println("Taxas de câmbio após inicialização:");
        for (Map.Entry<String, Double> entry : currencyConverter.currencyExchangeRates.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        double convertedAmount = currencyConverter.convertCurrency(1.0, "USD", "BRL");
        System.out.println("Converted amount: " + convertedAmount);

    }

    public double convertCurrency(double amount, String fromCurrency, String toCurrency) {
        Double fromRate = currencyExchangeRates.get(fromCurrency.toUpperCase());
        Double toRate = currencyExchangeRates.get(toCurrency.toUpperCase());
        if (fromRate == null || toRate == null) {
            throw new IllegalArgumentException("Moeda não encontrada no mapa de taxas de câmbio.");
        } else if (toCurrency.toUpperCase().equals("BRL")) {

            return amount * fromRate;
        } else {
            return (amount / toRate) * fromRate;
        }

    }
}
