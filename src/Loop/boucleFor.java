package Loop;

public class boucleFor {

	public static void main(String[] args) {
	int j=0;
	int arr[]= new int[4];
	
	
//	for(int i=0; i<arr.length; i++) {
//		arr[i]=j;
//		System.out.println(arr[i]);
//		j++;
//	}
//	
	
	int[] numbers= {7,10,100,1000};
	int result=0;
	for(int item: numbers) {
    	result=item%7;
//		System.out.println("result"+result);
		System.out.println(result);
	}
	
	
	}
}
