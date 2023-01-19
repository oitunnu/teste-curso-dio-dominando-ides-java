package com.dio;

import java.util.Scanner;

public class ExDoWhile {
    public static void main(String[] args) {
        /*
         * Maior e Média: Faça um programa que leia 5 números 
         * e informe o maior número e a média desses números
         */
        Scanner scan = new Scanner(System.in);
        int i = 0;
        int number;
        /*int largest = Integer.MIN_VALUE;
        int median = 0;
        int sum = 0;
        
        do {
            System.out.println("Give me a number: ");
            number = scan.nextInt();
            i++;
            System.out.println("Number: " + number + " Time: " + i);
            
            if(number > largest) {
                largest = number;
            }
            sum = sum + number;            
        } while (i < 5);
        
        median = sum/5;
        System.out.println("Largest number is: " + largest + " And median is: " + median);*/

        /*
         * Par e Ímpar: Faça um programa que peça N números inteiros. 
         * Calcule e mostre a quantidade de números pares e a quantidade de números impares.
         */
        int xNumber;
        int pair = 0;
        int odd = 0;

        System.out.println("How many numbers are you going to write?");
        xNumber = scan.nextInt();

        do {
            System.out.println("Write " + xNumber + " numbers: ");
            number = scan.nextInt();       // get input from user
            if(number % 2 == 0){        // If remainder is zero, add 1 to pair, else add 1 to odd
                pair++;
            } else {
                odd++;
            }
            i++;
        } while (i < xNumber);
        scan.close();

        System.out.println("The number of pairs are: " + pair + " and odds are: " + odd);
    }
}
