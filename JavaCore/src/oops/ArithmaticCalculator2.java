package oops;

import java.util.Scanner;

public class ArithmaticCalculator2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			
		System.out.println("Enter choices:\n1. Addition\n2. Substraction\n3. Multiplication\n4. Divide\n5. Exit");
		int choice = sc.nextInt();
		
		
		if (choice == 5) {
			System.out.println("Bye !!!");
			break;
		}
		
		System.out.println("Enter Number1: ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter Number2: ");
		int num2 = sc.nextInt();
		
		if (choice == 1){
			System.out.println(num1+num2);
		}
		
		else if (choice == 2){
			System.out.println(num1-num2);
		}
		
		else if (choice == 3){
			System.out.println(num1*num2);
		}
		
		else if (choice == 4){
			System.out.println(num1/num2);
		}
		
		}
				
	}

}
