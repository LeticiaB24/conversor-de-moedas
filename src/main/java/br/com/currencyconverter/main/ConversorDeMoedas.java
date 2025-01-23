package br.com.currencyconverter.main;

import br.com.currencyconverter.model.*;
import java.util.Date;
import java.util.Scanner;

public class ConversorDeMoedas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Moeda moeda = new Moeda();
        Historico historico = new Historico();

        while (true) {

            System.out.println("***********************************");
            System.out.println("      CONVERSOR DE MOEDAS         ");
            System.out.println("***********************************");

                    System.out.println("Escolha uma opção:");
                    System.out.println("1. Converter moeda");
                    System.out.println("2. Ver histórico");
                    System.out.println("3. Sair");

            int opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.println("Selecione a moeda de origem:");
                for (int i = 0; i < MoedaDisponivel.values().length; i++) {
                    System.out.println((i + 1) + ". " + MoedaDisponivel.values()[i].getNome());
                }
                int opcaoOrigem = scanner.nextInt();
                MoedaDisponivel moedaOrigem = MoedaDisponivel.values()[opcaoOrigem - 1];

                System.out.println("Selecione a moeda de destino:");
                for (int i = 0; i < MoedaDisponivel.values().length; i++) {
                    System.out.println((i + 1) + ". " + MoedaDisponivel.values()[i].getNome());
                }
                int opcaoDestino = scanner.nextInt();
                MoedaDisponivel moedaDestino = MoedaDisponivel.values()[opcaoDestino - 1];

                System.out.println("Informe o valor a ser convertido: ");
                double valor = scanner.nextDouble();

                try {
                    double valorConvertido = moeda.converter(moedaOrigem.getCodigo(), moedaDestino.getCodigo(), valor);
                    System.out.println("Valor convertido: " + valorConvertido + " " + moedaDestino.getCodigo());
                    historico.adicionarConversao(new Conversao(moedaOrigem.getCodigo(), moedaDestino.getCodigo(), valor, valorConvertido, new Date()));
                    System.out.println("Conversão de " + valor + " " + moedaOrigem.getCodigo() + " para " + valorConvertido + " " + moedaDestino.getCodigo());
                } catch (Exception e) {
                    System.out.println("Erro ao realizar conversão: " + e.getMessage());
                }
            } else if (opcao == 2) {
                System.out.println("Histórico de conversões:");
                for (Conversao c : historico.getHistorico()) {
                    System.out.println(c.valorOriginal() + " " + c.moedaOrigem() + " para " +
                            c.valorConvertido() + " " + c.moedaDestino());
                }
            } else if (opcao == 3) {
                System.out.println("Saindo...");
                break;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}
