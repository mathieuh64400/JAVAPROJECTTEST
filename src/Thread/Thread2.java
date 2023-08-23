package Thread;

import Thread.MathUtils;

public class Thread2  extends Thread {
	public int i;
	MathUtils mu;
	
	
	 public Thread2(int i,MathUtils mu) {
		 this.i=i;
		 this.mu=mu;
	 } 
	 
	 @Override
	public void run()  {
		 
		 try {
			 
			 mu.getMulti(this.i);
//			 Thread.sleep(50);
			
			
			 
		 } catch(Exception e) {
			 e.printStackTrace();
		 }
		 
	 }
}
