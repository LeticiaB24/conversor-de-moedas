package br.com.currencyconverter.model;

public enum MoedaDisponivel {
    ARS("Peso Argentino", "ARS"),
    BOB("Boliviano", "BOB"),
    BRL("Real Brasileiro", "BRL"),
    CLP("Peso Chileno", "CLP"),
    COP("Peso Colombiano", "COP"),
    USD("Dólar Americano", "USD");

    private final String nome;
    private final String codigo;

    MoedaDisponivel(String nome, String codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getCodigo() {
        return codigo;
    }
}
