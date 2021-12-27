package Oops;

public class methodCallByValue {
	
	int val=32;
	
	int operation(int val) {
		val=val*10/100;
		return val;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodCallByValue v = new methodCallByValue();
		System.out.println("Value before method is called:"+v.val);
		v.operation(20);
		System.out.println("Value after method is called:"+v.val);

	}

}
