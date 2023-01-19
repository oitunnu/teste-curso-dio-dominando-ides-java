package com.dio;

import java.util.Scanner;

public class ExemploFor {
    public static void main(String[] args) {
       /*  for (int apple = 1; apple <= 15; apple ++){
            System.out.println("I have " + apple + " apples");
        }*/

        /*String alunos[] = { "Alice", "Breno", "June", "Victory"};

        for (int i = 0; i < alunos.length; i++) {
            System.out.println("The student in index i = " + i + " is " + alunos [i]);
        }*/

       /* String alunos[] = { "Alice", "Breno", "June", "Victory"};

        for (String aluno : alunos) {
            System.out.println("The student's name is " + aluno);
        }*/ 

        /*for (int i = 0; i <= 10; i++) {
            if (i == 5) 
                //continue;
                break;
            
            System.out.println(i);
        }*/
        /*
         * Tabuada: Desenvolva um gerador de tabuada, capaz de gerar a tabuada 
         * de qualquer número inteiro entre 1 a 10. O usuário deve informar 
         * de qual numero ele deseja ver a tabuada. A saída deve ser conforme o exemplo abaixo:
         *
         * Tabuada de 5:
         *  5 X 1 = 5
         *  5 X 2 = 10
         *  ...
         *  5 X 10 = 50
         */
        Scanner scan = new Scanner(System.in);
        int number;
        
        // get the number for the multiplication table
        System.out.println("Calculate the times table of this number: ");
        number = scan.nextInt();

        // shows the multiplication table for the given number
        System.out.println( number + " Times Table");

        for (int i = 1; i < 11; i++) {
            System.out.println(number + " X " + i + " = " + number*i);
        }
        
        /*
         * Fatorial: Faça um programa que calcule o fatorial de um número inteiro 
         * fornecido pelo usuário. Ex.: 5!=5.4.3.2.1=120
         */
        int factorial = 1;
        
        for (int index = 1; index <= number; index++) {
            factorial = factorial * index;
        }
        scan.close();

        System.out.println("The factorial of " + number + " is " + factorial);
    }
}
