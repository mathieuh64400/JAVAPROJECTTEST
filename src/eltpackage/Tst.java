package eltpackage;

import Thread.MathUtils;
import Thread.Thread1;
import Thread.Thread2;


public class Tst {
	public static void main(String[] args) {
		MathUtils obj = new MathUtils() ;
//		int n= 10;
//		for(int i=0; i<n; i++) {
//			
			Thread1 t1= new Thread1(2,obj);
			
			//t1.setDaemon(true); // tue les threads
			t1.start();
			
			
//			if(i>6) {
//			t1.interrupt();
//			System.out.println("Thread2 n°"+i+" est arrété"+i);
//			}
			
			Thread2 t2 = new Thread2(3,obj);
			//t2.setDaemon(true);// tue les threads
			t2.start();
		
//			if(i>3) {
//			t2.interrupt();
//			System.out.println("Thread2 n°"+i+" est arrété"+i);
//			}
			
			
//		}
	}

}
