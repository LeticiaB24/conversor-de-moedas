package br.com.currencyconverter.api;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ApiClient {

    private static final String API_KEY = System.getenv("EXCHANGE_API_KEY");

    private void validarChaveAPI() {
        if (API_KEY == null || API_KEY.isEmpty()) {
            throw new IllegalStateException("Chave da API não configurada. Defina a variável de ambiente EXCHANGE_API_KEY.");
        }
    }

    public String getExchangeRates(String moedaOrigem) throws Exception {
        validarChaveAPI();

        String urlString = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/latest/" + moedaOrigem;
        URL url = new URL(urlString);

        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        int responseCode = connection.getResponseCode();
        if (responseCode != 200) {
            throw new Exception("Falha na requisição. Código de erro HTTP: " + responseCode);
        }

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }

            return response.toString();
        }
    }
}
