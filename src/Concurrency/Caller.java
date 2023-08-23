package Concurrency;
import java.io.*;
import java.util.*;
import java.util.concurrent.Executor;
import java.util.Random;

public class Caller implements Executor {

	@Override
	public void execute(Runnable runnable) {
		// TODO Auto-generated method stub
		ArrayList <Integer> e =new ArrayList <Integer>();
		for(int i =0; i<15;i++) {
			
			e.add(i*5);
		}
		Random random = new Random(); 
		int j = random.nextInt(15); 
		
		List<Integer> subListArray= new ArrayList<Integer>();
		if(j>2) {
		subListArray=e.subList(2, j);}
		else {
			subListArray=e.subList(2, 10);
		}
		
		
		runnable.run();
		System.out.println(subListArray);
	}

}
