package oops;

import java.util.Scanner;

public class Arrays {
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int emp_id[] = new int[5];
		double emp_salary[] = new double[5];
		double emp_bonus[] = new double[5];
		
		double emp[][] = new double[5][3];
		
		Scanner sc = new Scanner(System.in);
		
/*						
		for (int i=0 ; i<emp_id.length ; i++) {
			
			System.out.println("Enter Employee id of: "+(i+1)+" employee");
			emp_id[i] = sc.nextInt();
			
			System.out.println("Enter Employee salary of: "+(i+1)+" employee");			
			emp_salary[i] = sc.nextDouble();
			
		}
		
		for (int i=0 ; i<emp_id.length ; i++) {
			System.out.println("\nEmployee Id: "+emp_id[i]+"  Employee Salary: "+emp_salary[i]);
		}    
*/
		
		for (int i=0; i<=4; i++){
			
			for (int j=0; j<=2; j++) {
				
				if (j == 0) {
					System.out.println("Enter Employee Id of: "+(i+1)+" employee");
					emp[i][j] = sc.nextDouble();
				}
				else if (j == 1) {
					System.out.println("Enter Employee Salary of: "+(i+1)+" employee");
					emp[i][j] = sc.nextDouble();
				}
				else if (j == 2) {
					System.out.println("Enter Employee Bonus of: "+(i+1)+" employee");
					emp[i][j] = sc.nextDouble();
				}
			
			}
			
		}
		
		System.out.print("Emp_Id Emp Sal Emp_Bon\n");
		for (int i=0; i<=4; i++) {
			for (int j=0; j<=2; j++) {
				System.out.print(emp[i][j]+" ");
			}
			System.out.println("\n");
		}
		
	}
	
}
