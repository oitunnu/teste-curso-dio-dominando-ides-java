package com.dio.calculadora;
import java.util.Scanner;

/**
 * <h1>Calculator</h1>
 * This calculator has 4 different functions:
 * add, subtract, divide and multiply
 * It accepts integer as well as float
 * 
 * @author Omotayo Itunnu Yussuf
 * @version 1.0
 */

public class Calculadora {

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		
		double a, b;
		
		//get input
		System.out.println("Digite o primeiro valor: ");
		a = scan.nextInt();
		System.out.println("Digite o segundo valor: ");
		b = scan.nextInt();
		
		//the operations
		double addition = add(a, b);
		double subtraction = subtract(a, b);
		double division = divide(a, b);
		double multiplication = multiply(a, b);
		
		//print results
		System.out.println("adicao " + addition);
		System.out.println("subtracao " + subtraction);
		System.out.println("divisao " + division);
		System.out.println("multiplicacao " + multiplication);
		scan.close();
		
	}
/**
 * This method adds two numbers
 * @param a the first number
 * @param b the second number
 * @return the addition of the two numbers given
 */
	public static double add(double a, double b) {
		return a + b;
	}
	
/**
 * This method subtracts two numbers
 * @param a the first number
 * @param b the second number
 * @return the result of the subtraction of (a - b)
 */
	public static double subtract(double a, double b) {
		return a - b;
	}

/**
 * This method divide one number by another
 * @param a the first number
 * @param b the second number
 * @return the division of the two numbers given as in (a/b)
 */
	public static double divide(double a, double b) {
		return a / b;
	}

/**
 * This method multiply two numbers
 * @param a the first number
 * @param b the second number
 * @return the result of the multiplication of the two numbers given
 */
	public static double multiply(double a, double b) {
		return a * b;
	}
}
