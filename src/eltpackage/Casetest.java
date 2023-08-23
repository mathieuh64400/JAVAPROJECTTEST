package eltpackage;

public class Casetest {

	
	public static void main(String args[]) {
		
//		array in java
		int[] anarray; // declaration d'un tableau d'entier
		float[] anotherarray;// declaration d'un tableau de nombre a virgule;
		
		// comme ce type de tableau a une memoire fixe on doit preciser taille
		anarray= new int[10];
		int valuelengthofarray= anarray.length;
		System.out.println(valuelengthofarray);
		
		anotherarray= new float[5];
		int valuelengthofarray2= anotherarray.length;
		System.out.println(valuelengthofarray2);
		
		
		anarray[0]=100;
		
		anotherarray[0]= 3.665f;
		anotherarray[1]= 3.24588f;
		anotherarray[2]= 3.2585f;
		anotherarray[3]= 3.255f;
		anotherarray[4]= 3.34435f;
	//	anotherarray[5]= 3.3443555f;
		
		
		
		System.out.println(anotherarray[0]);
		System.out.println(anotherarray[1]);
		System.out.println(anotherarray[2]);
		System.out.println(anotherarray[3]);
		System.out.println(anotherarray[4]);
	//	System.out.println(anotherarray[5]); impossible car length >5
 }
 
 
}
