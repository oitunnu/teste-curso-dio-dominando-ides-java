package com.dio;

public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;

        while (mesada>0) {
            double valorDoce = 5.0;
            if (valorDoce > mesada) {
                valorDoce = mesada;
            }
            
           System.out.println("Mesada: " + mesada);    
           System.out.println("Doce de valor: " + valorDoce + " adicionado no carrinho");
           mesada -= valorDoce;
        }
        System.out.println("Mesada: " + mesada);
        System.out.println("Maria gastou toda a mesada em doces");
    }
}
