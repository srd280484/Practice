package oops;

public class ThreadClassRunnable implements Runnable {

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
		
		ThreadClassRunnable th = new ThreadClassRunnable();
		Thread t = new Thread(th);
		t.start();
		th.inc();
		//th.inc2();	

	}

}

