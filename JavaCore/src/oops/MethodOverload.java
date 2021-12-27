package oops;

public class MethodOverload {
	
	public void area(int b,int h) {
		System.out.println("Area of Triangle: "+0.5*b*h);
	}
	
	public void area(int r) {
		System.out.println("Are of circle: "+3.14*r*r);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverload mo = new MethodOverload();
		mo.area(4, 3);
		mo.area(5);

	}

}
