package oops;

public class MethodCallByValue {
	
	int val=32;
	
	int operation(int val) {
		val=val*10/100;
		return val;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodCallByValue v = new MethodCallByValue();
		System.out.println("Value before method is called:"+v.val);
		v.operation(20);
		System.out.println("Value after method is called:"+v.val);

	}

}
