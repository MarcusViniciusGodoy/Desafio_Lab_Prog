package com.example;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidarExpressao {
    public static boolean validarExpressao(String expressao) {
        Deque<Character> pilha = new ArrayDeque<>();

        for (char c : expressao.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                pilha.push(c);
            }
            else if (c == ')' || c == ']' || c == '}') {
                if (pilha.isEmpty()) {
                    return false; 
                }

                char topo = pilha.pop();

                if ((c == ')' && topo != '(') ||
                    (c == ']' && topo != '[') ||
                    (c == '}' && topo != '{')) {
                    return false;
                }
            }
        }
        return pilha.isEmpty();
    }
}
