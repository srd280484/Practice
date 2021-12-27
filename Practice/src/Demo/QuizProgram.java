package Demo;

import java.util.Scanner;

public class QuizProgram {
	
	public static void main(String[] args) {
		
		int choice;
		Scanner sc=new Scanner(System.in);
		System.out.println("Who is the author of book titled - Play Nice But Win ?\n\n1. Jeff Bezos\n2. Tim Cook\n3. Michael Dell\n4. Satya Nadella\n");
		System.out.println("Choose from above options 1/2/3/4 :");
		choice=sc.nextInt();
				
		if ( choice == 3) {
			System.out.println("Congratulations !!! Your answer is correct.");		
		}
		else {
			System.out.println("Wrong answer !!! Please try again.\n");
			main(new String[1]);
		}
	}
}
