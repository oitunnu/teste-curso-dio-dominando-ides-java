package com.dio;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;;

public class AboutMe {
    public static void main(String[] args) {
        try {
        // create object scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("First name");
        String name = scanner.next();

        System.out.println("Your surname");
        String surname = scanner.next();

        System.out.println("Your age");
        int age = scanner.nextInt();

        System.out.println("Your height");
        double height = scanner.nextDouble();

        // print data from user
        System.out.println("Hi, my name is " + name.toUpperCase() + " " + surname.toUpperCase());
        System.out.println("I am " + age + " years old ");
        System.out.println("My height is " + height + "cm ");
        scanner.close();
        } catch (InputMismatchException e) {
            System.out.println("The blank space for age and height must be numeric");
        }
        
    }
}
