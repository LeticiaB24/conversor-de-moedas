package br.com.currencyconverter.model;

import br.com.currencyconverter.api.ApiClient;
import br.com.currencyconverter.api.JsonParserUtil;

public class Moeda implements Conversivel {

    private final ApiClient apiClient;

    public Moeda() {
        apiClient = new ApiClient();
    }

    @Override
    public double converter(String moedaOrigem, String moedaDestino, double valor) {
        try {

            String jsonResponse = apiClient.getExchangeRates(moedaOrigem);
            double taxaConversao = JsonParserUtil.parseExchangeRate(jsonResponse, moedaDestino);


            return valor * taxaConversao;
        } catch (Exception e) {
            System.out.println("Erro ao realizar a conversão: " + e.getMessage());
            return 0;
        }
    }
}

