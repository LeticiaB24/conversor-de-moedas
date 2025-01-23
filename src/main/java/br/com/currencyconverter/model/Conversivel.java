package br.com.currencyconverter.model;

public interface Conversivel {
    double converter(String moedaOrigem, String moedaDestino, double valor) throws Exception;
}

