package oops;

import java.util.Scanner;

public class ArithmaticCalculator {
	
	static void sum(int num1, int num2) {
		
		System.out.println("\nSum of two number is "+(num1+num2));
	}
	
	static void sub(int num1, int num2) {
		
		System.out.println("\nSubtraction of two number is "+(num1-num2));
	}
	
	static void mult(int num1, int num2) {
		
		System.out.println("\nMultiplication of two number is "+(num1*num2));
	}
	
	static void div(int num1, int num2) {
		
		System.out.println("\nDivision of two number is "+(num1/num2));
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Arithmatic Calculator");
		ArithmaticCalculator calc = new ArithmaticCalculator();

		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter 1st number :");
		int num1 = sc.nextInt();
		System.out.println("\nEnter 2nd number :");
		int num2 = sc.nextInt();
							
					
		sum(num1, num2);
	    sub(num1, num2);
	    mult(num1, num2);
	    div(num1, num2);
		
		}
			
}
