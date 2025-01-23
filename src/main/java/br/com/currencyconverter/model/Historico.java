package br.com.currencyconverter.model;

import java.util.ArrayList;
import java.util.List;

public class Historico {
    private final List<Conversao> historico;

    public Historico() {
        this.historico = new ArrayList<>();
    }

    public void adicionarConversao(Conversao conversao) {
        historico.add(conversao);
    }

    public List<Conversao> getHistorico() {
        return historico;
    }
}
