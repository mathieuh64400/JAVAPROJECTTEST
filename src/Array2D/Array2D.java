package Array2D;

public class Array2D {

	public static void main(String[] args) {
		int[][] arr= {{},{},{},{}}; // tableau vide de taille = a 3 Byte;
		int[] array1=new int[2];// array contenant des integers et avec deux 
		int[] array2=new int[2];
		int[] array3=new int[2];
		int[] array4=new int[2];
		
		
		array1[0]= 10;
		array1[1]= 11;
		
		array2[0]= 1;
		array2[1]= 10;
		
		
		
		array3[0]= 2;
		array3[1]= 15;
		
		array4[0]= 25;
		array4[1]= 150;
		
		
		arr[0]=array1;
		arr[1]=array2;
		arr[2]=array3;
		arr[3]=array4;
		for(int i=0; i<4; i++) {
			for(int j=0; j<2; j++) {
				System.out.println(arr[i][j]);
			}
			
			
		}
		System.out.println(arr[0][0]);
	}
}
