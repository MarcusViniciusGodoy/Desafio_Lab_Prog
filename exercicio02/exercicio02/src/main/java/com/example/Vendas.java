package com.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Vendas {
    private int id;
    private String departamento;
    private Double valor;

    @Override
    public String toString() {
        return String.format("ID: %-2d | Departamento: %-10s | Valor: R$ %.2f",
        id, departamento, valor);
    }
}
