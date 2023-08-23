package Thread;
import Thread.MathUtils;
public class Thread1 extends Thread {
	public int i;
	MathUtils mu;
	 public Thread1(int i,MathUtils mu ) {
		 this.i=i; 
		 this.mu=mu;
		
	 }

@Override
public  void run() {
	
	try {
		mu.getMulti(this.i);
//			
//		Thread.sleep(20);
//		System.out.println(" Thread1 is running"+this.i);
//		
//		
		
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	
	
}
}
