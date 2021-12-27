package oops;

import java.util.Scanner;

public class HighestTemp {
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] city = new String[5];
		int[] temp = new int[5];
		Scanner sc = new Scanner(System.in);
		
			
		for (int i=0; i<temp.length; i++) {
			
				System.out.println("Enter City's Name: ");
				city[i] = sc.next();					
				
				System.out.println("Enter City's temperature: ");
				temp[i] = sc.nextInt();
		}

		int tmp = temp[0];
		String City = city[0];
		
		for (int i=0; i<temp.length; i++) {
			
			if ( tmp < temp[i]) {
				tmp = temp[i];
				City = city[i];
						
			}
		}
		
		System.out.println("\nCity: "+City+" has highest Temperature of: "+tmp+" F");
		
	}
	
}
