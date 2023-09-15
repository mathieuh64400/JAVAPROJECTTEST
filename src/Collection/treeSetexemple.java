package Collection;
import java.io.*;
import java.util.Iterator;
import java.util.TreeSet;
public class treeSetexemple {
	
	public static void main(String[] args) {
		 TreeSet<Integer> treeadd = new TreeSet<Integer>();
		 
		 for(int i= 1; i< 10; i++) {
			 treeadd.add(i*7);
			 
		 }
		 System.out.println("treeadd"+ treeadd);
	       int value = treeadd.ceiling(25); // first value after an int
	       
           // printing  the ceiling value
           System.out.println("Ceiling value for 25: "
                              + value);
           
           //ceiling est equivalent a higher
           System.out.println(treeadd.higher(25));
           
           
           // getting the floor value for 25
           // using floor() method
           int value1 = treeadd.floor(25);
 
           // printing the floor value = valeur precedente 25
           System.out.println("Floor value for 25: "
                              + value1);
       
        // Creating the subset tree
           TreeSet<Integer> sub_set = new TreeSet<Integer>();
           
           sub_set = (TreeSet<Integer>)treeadd.subSet(6, 30);// subset entre valeur_min=6 && valeur_max=30;
           
           System.out.println(sub_set);
           
           System.out.println("After removing element" + sub_set.pollFirst() +'\n'+
                   " from TreeSet: " + sub_set);
          
           System.out.println("After removing element" + sub_set.pollLast() +'\n'+
                   " from TreeSet: " + sub_set);
 
           //tailset ordre a partir d'un certain nombre
           
           // Creating the tailSet tree
           TreeSet<Integer> tail_set = new TreeSet<Integer>();
     
           // Limiting the values till 7
           tail_set = (TreeSet<Integer>)treeadd.tailSet(10);
     
           // Creating an Iterator
           Iterator iterate;
           iterate = tail_set.iterator();
     
           // Displaying the tree set data
           System.out.println("The resultant values from the tail: "+tail_set);
     
           // Iterating through the tailSet
           while (iterate.hasNext()) {
               System.out.println(iterate.next() + " ");
           }
           
           
           
           
           
           
           
		 
	}

}
