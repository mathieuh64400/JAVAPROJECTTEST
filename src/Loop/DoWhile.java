package Loop;
import java.util.Random;   
public class DoWhile {
	public static void main(String args[]) {
		Random random = new Random(); 
		int i = random.nextInt(50);   
		int j0= random.nextInt(10);
		int result=0;
		// System.out.println(i);
//		 int i = 0;
//		 while (i < 50) {
//			 result=(j0-i)/3;
//		   System.out.println(result);
//		   i++;
//		   System.out.println( "i est ="+i);
//		   System.out.println( "j est ="+j0);
//		 }
		
	
		do {
			result=(i-j0)/3;
		  System.out.println("i est ="+i);
		  System.out.println("J est ="+j0);
		  System.out.println("result est = "+ result);
		  i++;
		  j0--;
		}
		while (result < 20);
		
		
		
		
		
	}

}
