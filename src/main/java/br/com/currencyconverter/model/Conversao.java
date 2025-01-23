package br.com.currencyconverter.model;

import java.util.Date;

public record Conversao(String moedaOrigem, String moedaDestino, double valorOriginal, double valorConvertido, Date dataHoraConversao) {}

