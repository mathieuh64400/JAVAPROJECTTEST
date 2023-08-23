package ArithmeticDemo;

public class operators {
	public static void main (String[] args) {
		int valueA= 10;
		int valueB= 1;
		
		int result= valueA + valueB;
		System.out.println(result);
		int newres= result-valueB;
		System.out.println(newres);
		int newres2= (newres-valueB)*valueA;
		System.out.println(newres2);
		float newresfin= (newres2/result);
		System.out.println(newresfin);
		
	}

}
