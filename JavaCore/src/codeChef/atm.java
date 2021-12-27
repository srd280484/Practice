package codeChef;

import java.util.Scanner;

public class atm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter amount in USD to withdraw (multiple of 5): ");
		int withdraw = sc.nextInt();
		
		System.out.println("Enter Account balance in USD: ");
		double balance = sc.nextDouble();
		
		if (balance >= (withdraw+0.50) && withdraw !=0){
			
			if ( withdraw%5 != 0 ) {
			System.out.println("\nCannot withdraw, account balance is: "+String.format("%.2f",balance));
		    }
		    else {
		    	balance = balance-(withdraw+0.50);
			System.out.println("\nCash dispensed, account balance is: "+String.format("%.2f",balance));
			}
		}
		else {
			System.out.println("\nNot enough balance: "+String.format("%.2f", balance));
		}

	}

}
