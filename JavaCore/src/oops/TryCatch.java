package oops;

public class TryCatch {
	
	void Division () throws ArithmeticException {
		int a=45,b=0,rs;
		rs = a/b;
		System.out.println("The result is :"+rs);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	int[] ar = new int[3];
		
		int j=7;
		
		try {
			if (ar.length < j) {
				throw (new ArithmeticException("Array out of bound !!!"));
			}
			else {
				ar[j] = 3;
			}
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.print("Array index is out of bound ");
			System.out.println(e.getMessage());
		
		}
		finally {
			System.out.println("The array is of size "+ar.length);
		}
		*/
		
		TryCatch T = new TryCatch();
		
		try {
			T.Division();
		}
		catch(ArithmeticException e) {
			System.out.println("Error: "+e);
		}
		
	}
}
