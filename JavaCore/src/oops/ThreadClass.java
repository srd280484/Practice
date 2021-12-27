package oops;

public class ThreadClass extends Thread {

	public void run() {
		for (int i=101;i<200;i++) {
			System.out.println(i);
			   }
		}
	
	public void inc() {
		for (int i=0;i<100;i++) {
		System.out.println(i);
		   }
	}
	
	public void inc2() {
		for (int i=101;i<200;i++) {
		System.out.println(i);
		   }
	}
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadClass th = new ThreadClass();
		th.start();
		th.inc();
		//th.inc2();	

	}

}

