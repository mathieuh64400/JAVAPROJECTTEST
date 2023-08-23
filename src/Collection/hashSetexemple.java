package Collection;
import java.util.*;
public class hashSetexemple {
	public static void main(String[] args) {
		
		//La classe Java HashSet implémente l'interface Set, soutenue par une table de hachage qui est en fait une instance HashMap . A
	
		// Creating an empty HashSet
        HashSet<String> h = new HashSet<String>();
        
        h.add("A");
        h.add("B");
        h.add("C");
        h.add("C"); //hset supprimme les doublons => unique
        System.out.println(h);
        
        System.out.println(h.contains("D"));
        if(!h.contains("D")) {
        	
        	 h.add("D"); 
        }
        System.out.println(h.contains("D"));
        System.out.println(h.size());
       // h.clear();
        System.out.println(h);
        System.out.println("hey");
        
        
        
//        cas des abstractSEt
        System.out.println("-----------------------");
        
        AbstractSet<String>
        abstract_set1 = new HashSet<String>();
    AbstractSet<String>
        abstract_set2 = new HashSet<String>();
    
    
    abstract_set1.add("A");
    abstract_set2.add("B");
    
  boolean value=  abstract_set1.equals(abstract_set2);
  
  System.out.println(value);
  abstract_set1.add("B");
  abstract_set1.add("C");
  abstract_set1.add("D");
  abstract_set1.add("E");
  System.out.println("The initiale value of the set: "
          + abstract_set1);
  System.out.println("The hashcode value of the set: "
          + abstract_set1.hashCode());
	
	
	
	}

}
