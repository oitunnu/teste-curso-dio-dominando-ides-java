package com.dio;

import java.util.Scanner;

public class ExemploWhile {
    public static void main(String[] args) {
        /*double mesada = 50.0;

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
        System.out.println("Maria gastou toda a mesada em doces"); */
        
        Scanner scan = new Scanner(System.in);
        /*
        * Nome e Idade: Faça um programa que leia conjuntos de dois valores,
        * o primeiro representando o nome do aluno e o segundo representando a sua idade. 
        * (Pare o programa inserindo o valor 0 no campo nome)
        */        
        System.out.println("Write name and age: ");
        String name = scan.next();
        int age = scan.nextInt();

        while (name.compareTo("0") > 1) {       // compare character '0' with name given
            System.out.println("Name: ");
            name = scan.next();
            System.out.println("Age: ");
            age = scan.nextInt();
        }        

       /*int i = 1;
        
        while (true) {                   // using infinite loop for while
            System.out.println("Hi");
            i++;
            System.out.println(i);
            if(i == 10) break;          // to leave this loop, use break
        }*/

        /*
        * Nota: Faça um programa que peça uma nota, entre zero e dez. 
        * Mostre uma mensagem caso o valor seja inválido e continue pedindo 
        * até que o usuário informe um valor válido. 
        */
        System.out.println("Give me a number between 0 and 10: ");
        int value = scan.nextInt();

        while ((value < 0 ) || (value > 10 )) {
            System.out.println("Invalid number! Give me a number between 0 and 10: ");
            value = scan.nextInt();
        }
        scan.close();
    }
}