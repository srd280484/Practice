package Demo;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		int n;
	    double fact=1;
		int i=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to calculate its Factorial? ");
		n = sc.nextInt();
				
/*for (int i=1; i<=n; i++) {
			fact = fact * i;
		}*/
		
		while (i<=n) {
			fact *= i;
			i++;
		}
		System.out.println("Factorial of number "+n+" is "+fact);
			
	}

}
