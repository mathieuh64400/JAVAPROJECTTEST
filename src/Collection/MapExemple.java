package Collection;
import java.util.*;
import java.util.stream.*;

public class MapExemple {
	
	public static void main(String[]args) {
		
		 Map<String, Integer> hm
         = new HashMap<String, Integer>();
		  // ajout d'un system clé valeur;
		 
		 //The map java interface is present in java.util package is used to represent a mapping between a key and a value.Map put() method is used to associate the specified value with the specified key in the map.
	
		 String[] arr = {"A","B","C"};
		 
		 
		 for(int i=0;i<arr.length;i++) {
			 hm.put(arr[i], i*4);
		 }
		  System.out.println(hm);
		  
		  System.out.println(hm.get("A"));
		  
		  System.out.println(hm.containsValue(0));
		  
		  System.out.println(hm.hashCode());

		 
		  System.out.println(hm.size());
		  
		  //ensemble clé valeur
		  System.out.println("The set is: " + hm.entrySet());
		// Using keySet() to get the set view of keys
	        System.out.println("The set of key  is: " + hm.keySet());
	        //creation d'une collection = set de valeur
			  System.out.println(hm.values());
		 
		 //conversion d'une collection d'une map en arrayList
		//  ArrayList<Integer> arraytest = new ArrayList<Integer>();
//				    
		   List<String> vList = new ArrayList(hm.values()); //
		   System.out.println(vList);
		   ArrayList<String> arraytest = new ArrayList<String>(vList);
		   System.out.println(arraytest);
		   arraytest.add(" Hey ");
		   arraytest.add(" Man ");
		   System.out.println(arraytest);
		   
		   
		 
//		  for(int i=0; i<hm.size();i++) {
//			  System.out.println(hm.get(arr[i]));
//			  arraytest.add(hm.get(arr[i]));
//		  }
//		  System.out.println(arraytest);
		  

	
	}

}
