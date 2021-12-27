package oops;

class EmpInfo{
	
	int id;
	String name;
	
	EmpInfo (){
	
	System.out.println("ID & Name");
	
	}
	EmpInfo(int id, String name){
		this();
		this.id=id;
		this.name=name;
		
	}
	
	void display() {
		
		System.out.println("ID: "+id+ " Name: "+name);
	}
}

public class ConstructorDemo {
	
	public static void main( String[] args) {
		
		EmpInfo emp1 = new EmpInfo();
		EmpInfo emp2 = new EmpInfo();
		EmpInfo emp3 = new EmpInfo(100,"Sat");
		EmpInfo emp4 = new EmpInfo(200,"Matt");
		emp1.display();
		emp2.display();
		emp3.display();
		emp4.display();
		
		
	}

}
