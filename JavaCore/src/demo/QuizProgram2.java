package demo;

import java.util.Scanner;

public class QuizProgram2 {
	
	public static void main(String[] args) {
		
		while (true) {
			
			int choice;
			Scanner sc=new Scanner(System.in);
			System.out.println("Who is the author of book titled - Play Nice But Win ?\n\n1. Jeff Bezos\n2. Tim Cook\n3. Michael Dell\n4. Satya Nadella\n5. Exit\n");
			System.out.println("Choose from above options 1/2/3/4/5 :");
			choice=sc.nextInt();
					
			if ( choice == 3) {
				System.out.println("Congratulations !!! Your answer is correct.");
				break;
			}
			else if ( choice == 5) {
				break;
			}
			else {
				System.out.println("Wrong answer !!! Please try again.\n");
				
			}
		}
	}
				
}
