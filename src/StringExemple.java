import java.lang.*;
public class StringExemple {
	
	public static void main(String[] args) {
		String S1="Joe is studing";
		String S2=" in Supervielle College";
		String S3 =S1.concat(S2);
//		System.out.println(S3);
		
		System.out.println(S1.length()); //longueur de la chaine 
		System.out.println(S1.concat(S2)); // concatenation de 2 lettres
		System.out.println(S1.charAt(7)); // valeur d'1 lettre a position X
		System.out.println(S1.contains("is"));// contient une chainee
		System.out.println(S2.compareTo(S1)); //compare si chaine a des elements egaux 0=> totalement identique;
		System.out.println(S1.endsWith("g")); //verifie si phrase termine par 1 mot ;
		System.out.println(S2.startsWith(" i"));
		System.out.println(S3.equals("Joe is studing"));// chaine est egal a une autre chaine
		System.out.println("sublist"+ S2.substring(0,15));
		
		//elimine les espaces
		System.out.println(S2.trim());
		System.out.println(" charToArray "+S2.toCharArray());
for( char x: S2.trim().toCharArray()) {
			
			System.out.println(x);
		}
		
		String[] arrString =S1.split(" ",2); // on peut ajouter ou retirer une limite
		int IndeString = S1.lastIndexOf("n");
		System.out.print(IndeString);
		for(String y: arrString) {
			System.out.println( "y"+y);
		}
		
		System.out.println(S2.replace("l", "m"));
		
		 System.out.println(S2.replaceFirst("ll", "mm"));
		
		 //getChars pour faire une copie de char
		 
		 char[] dArray = new char[20];
		 
		 S2.getChars(3, 10, dArray, 1);
		 System.out.println(dArray);
		 System.out.println(String.join(S1," ",S2));
		 StringBuffer sbf = new StringBuffer(S1);
		 sbf.reverse();
		 System.out.print(sbf);
		 
	Boolean valeurT=S2.equalsIgnoreCase(S1);
	System.out.println(valeurT);
		 
	} 

}
