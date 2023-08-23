
public class StringExemple {
	
	public static void main(String[] args) {
		String S1="Joe is studing";
		String S2=" in Supervielle College";
		
		System.out.println(S1.length());
		System.out.println(S1.concat(S2)); // concatenation de 2 lettres
		System.out.println(S1.charAt(7)); // valeur d'1 lettre a position X
		System.out.println(S1.contains("is"));// contient une chainee
		System.out.println(S2.compareTo(S1)); //compare si chaine a des elements egaux 0=> totalement identique;
		System.out.println(S1.endsWith("g")); //verifie si phrase termine par 1 mot ;
	}

}
