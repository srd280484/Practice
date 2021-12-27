package oops;

class MyException extends Exception {
	
	public MyException(String s) {
		
		super(s);
	}
}

public class CustomException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		try {
			throw new MyException("My custom exception !!!");
		}
		catch(MyException e) {
			System.out.println("Caught the exception");
			System.out.println(e.getMessage());
		}
		
	}

}
