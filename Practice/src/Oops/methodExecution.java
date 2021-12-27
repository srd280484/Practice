package Oops;

public class methodExecution {
	
	public int multiply(int num1,int num2) {
		int result = num1*num2;
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodExecution m = new methodExecution();
		System.out.println("Multiplication :"+m.multiply(10, 3));

	}

}
