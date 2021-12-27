package codeChef;

import java.util.Scanner;

public class atm2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		float Y = sc.nextFloat();
		
		if (X%5==0 && Y>=((float)X+0.50) && X!=0){
			Y = Y-(float)X-(float)0.50;
			System.out.printf("%.2f",Y);
		}
		else {
			System.out.printf("%.2f",Y);
		}

	}

}
