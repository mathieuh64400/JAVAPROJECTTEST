package dataaboutconst;
import java.util.Random;
public class constanteexemple {
	
	
	public static int calculdata() {
		final int a= 12;
		Random random = new Random(); 
		int i = random.nextInt(50); 
		int n= a*i;
		
		return  n;
		
	}
	
	public static void main(String[] args) {
		
		
		
		System.out.println(" la valeur est "+'\n'+constanteexemple.calculdata());
		
		
		
	}

}
