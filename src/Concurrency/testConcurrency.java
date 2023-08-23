package Concurrency;
import java.util.concurrent.Executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
public class testConcurrency {
	public static void main (String[] args) {
		
		executorInvoke();
		executorServiceInvoke();
		invoke() ;
	}

	public static void invoke() {
		   ExecutorService executorService = Executors.newFixedThreadPool(20);

		   Future<String> future = executorService.submit(() -> {
		       // ...
		       Thread.sleep(10000l);
		       return "Hello";
		   });
		   if(!future.isDone()) {
			   System.out.println("task is in progress");
		   }else {
			   System.out.println("Tache est complete");
		   }
		   
		   
		   
		}

	private static void executorInvoke() {
		Executor executor = new Caller();
		
		executor.execute(()->{ //=> ne fonctionne pas mais -> oui
			System.out.println("Hey exutor exemple");
		});
		
		
	}
	private static void executorServiceInvoke() {
		// TODO Auto-generated method stub
		ExecutorService executorService = Executors.newFixedThreadPool(5000);
		executorService.submit(()->{System.out.println("Hey executorS exemple");});
		try {
	if(! executorService.isShutdown()) {
		System.out.println("alors:"+executorService.isTerminated()); 
			if(	executorService.awaitTermination( 20000, TimeUnit.NANOSECONDS )) {
					System.out.println("result");
				
				executorService.shutdownNow();
					
			} else{
			System.out.println("errors");
			};
			
		}}
		catch(InterruptedException e) {
			  e.printStackTrace();
		}
		
	}

	

}
