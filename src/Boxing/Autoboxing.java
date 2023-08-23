package Boxing;
//Importing required classes
import java.io.*;
public class Autoboxing {
	public static void main(String[] args) {
	// creation d'un wrapper Integer 
		int i= 10;
	Integer t= new Integer(i); //ajout d'un valeur;

	
	//Unboxing :conversion d'un objet d'un type wrapper en sa valeur primitive;
	 i= t;
	System.out.println(i);
	
	
	
	 // ou AutoBox
	Integer iobj= Integer.valueOf(i);
	float n= 3.25f; // float primitive Type 
	// AutoBoxing to Float Wrapper
	Float gfg =n;
	
	System.out.println(gfg);
	
	}

}
