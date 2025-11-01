package com.example;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class RelatorioVendas {
    public static void main(String[] args) {
        List<Vendas> listaVendas = List.of(
                new Vendas(1, "Eletrônicos", 1000.00),
                new Vendas(2, "Beleza", 200.00),
                new Vendas(3, "Esportes", 100.00),
                new Vendas(4, "Eletrônicos", 11000.00),
                new Vendas(5, "Higiene", 500.01),
                new Vendas(6, "Eletrônicos", 2500.00)
        );

        //a. soma total Eletrônicos
        double somaEletronicos = listaVendas.stream()
                .filter(x -> x.getDepartamento().equalsIgnoreCase("Eletrônicos"))
                .mapToDouble(Vendas::getValor)
                .sum();
        System.out.println("Soma total das vendas: R$ " + somaEletronicos);

        //b. valor > 500
        List<Vendas> vendas = listaVendas.stream()
                .filter(x -> x.getValor() > 500)
                .collect(Collectors.toList());
        System.out.printf("%nVendas valor maior que R$ 500: %n");
        vendas.forEach(System.out::println);

        //c. venda maior valor
        Vendas maiorVenda = listaVendas.stream()
                .max(Comparator.comparingDouble(Vendas::getValor))
                .orElse(null);
        System.out.printf("%nVenda maior valor: " + maiorVenda);
    }
}