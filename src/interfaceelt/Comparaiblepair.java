package interfaceelt;
import java.io.*;
import java.util.*;

public class Comparaiblepair implements Comparable<Comparaiblepair> {
	
	String X; 
	int Y;
	
	public Comparaiblepair(String X, int Y) {
		
		this.X=X;
		this.Y=Y;
		
	}
    public String toString()
    {
        return "(" + X + "," + Y + ")";
    }
    @Override public int compareTo(Comparaiblepair a) { //L'interface Comparable contient la méthode compareTo pour décider de l'ordre des éléments.
    	 // if the string are not equal
        if (this.X.compareTo(a.X) != 0) {
            return this.X.compareTo(a.X);
        }
        else {
            // we compare integer values
            // if the strings are equal
            return this.Y - a.Y;
        }
    	
    }

}
