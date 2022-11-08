package com.dio;

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

        for (int i = 0; i <= 10; i++) {
            if (i == 5) 
                //continue;
                break;
            
            System.out.println(i);
        }
    }
}
