package com.example;

public class Valida {
    public static void main(String[] args) {
        String[] expressoes = {
                "[({()})]",  
                "[(])",      
                "{[()]}",    
                "((())",     
                "{[()]}()",  
                "}{",        
        };

        for (String exp : expressoes) {
            boolean valida = ValidarExpressao.validarExpressao(exp);
            System.out.println(exp + " -> " + valida);
        }
    }
}