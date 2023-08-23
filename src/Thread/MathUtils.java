package Thread;

public class MathUtils {
	final int valmax=10;
	 public void getMulti(int n) { //si pas synchronized alors thread1 puis Thread2 puis reThread1 puis re Thread2
		 synchronized(this) { for(int i=1; i < valmax; i++) {
			if(n>=3) {
				System.out.println("-"+n*i+"-");
			}
			if(n==2) {System.out.println("- -"+n*i+" - - ");}
			
			try {
				
				Thread.sleep(400);
			} catch(Exception e) {
				 e.printStackTrace();
			 }
		}
	}
	 }
}
