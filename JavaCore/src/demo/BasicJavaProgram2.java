package demo;

import java.util.Scanner;

public class BasicJavaProgram2 {
	public static void main(String[] args) {
		int num1, num2;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number? ");
		num1 = sc.nextInt();
		System.out.println("Enter 2nd number? ");
		num2 = sc.nextInt();
		
		System.out.println("Addition of two number is: "+ (num1 + num2));
		System.out.println("Substraction of two number is: "+ (num1 - num2));
		System.out.println("Multiplation of two numeber is: "+ (num1 * num2));
		System.out.println("Divison of two number is: "+ (num1 / num2));
		System.out.println("Modular of two numner is: "+ (num1 % num2));
	}

}
