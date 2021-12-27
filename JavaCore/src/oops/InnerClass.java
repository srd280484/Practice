package oops;

   class innerClass2 {
	
	private String msg = "Welcome to Java";
	
	class Inner{
		
		void hello() {
			System.out.println(msg+", Let us start Learning Inner Classes");
		}
	}
	
}
   
   class innerClass3 {
	   
	   private String msg = "Inner Classes";
	   
	   void display() {
		   
		   class inner{
			   void msg() {
				   System.out.println(msg);
			   }
		   }
	   	   
	   inner I = new inner();
	   I.msg();
   }

	   
   }

    public class InnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		innerClass2 in = new innerClass2();
		innerClass2.Inner obj = in.new Inner();
		System.out.println(in.getClass());
		obj.hello();
		
		innerClass3 in3 = new innerClass3();
		in3.display();

	}
	
}


