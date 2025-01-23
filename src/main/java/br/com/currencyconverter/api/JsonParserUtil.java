package br.com.currencyconverter.api;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class JsonParserUtil {

    public static double parseExchangeRate(String jsonResponse, String moedaDestino) {

        Gson gson = new Gson();
        JsonObject jsonObject = gson.fromJson(jsonResponse, JsonObject.class);

        if (jsonObject.has("conversion_rates")) {
            JsonObject rates = jsonObject.getAsJsonObject("conversion_rates");

            if (rates.has(moedaDestino)) {
                return rates.get(moedaDestino).getAsDouble();
            } else {
                throw new IllegalArgumentException("Moeda destino não encontrada nas taxas de câmbio.");
            }
        } else {
            throw new IllegalArgumentException("Resposta da API não contém as taxas de câmbio.");
        }
    }
}


