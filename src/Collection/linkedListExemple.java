package Collection;

//Importing required classes 
import java.util.LinkedList;
import java.io.*;



public class linkedListExemple {
	
	public static void main(String[] args) {
		
	    // Creating an empty LinkedList of string type
        LinkedList<String> listex = new LinkedList<String>();
        
        listex.add("Geeks");
        listex.add("For");
        listex.add("Geeks");
  
        // Printing the current elements of LinkedList
        System.out.println(listex);
        
        listex.addFirst("hey! ");
        listex.addLast("!!!!");
        System.out.println(listex);
        
        

        // Adding element at a particular index
        // by passing as an argument
        listex.add(1, "Java By");
        System.out.println(listex);
        
        // Creating another linked list and copying
        LinkedList<String> sec_list = new LinkedList<>();
        sec_list = (LinkedList<String>) listex.clone();
        
        System.out.println("copie "+sec_list);
        // Clearing the list
        sec_list.clear();
        
        
        System.out.println("copie "+sec_list);
        
        String value = listex.element();
      
        // print the head of list
        System.out.println("Head of list : " + value);
        
        // offering a new element
        // adds element at tail.
        listex.offer("Astha");
        
        System.out.println("offer "+listex);
        
        System.out.println(" -------- ");
        
        System.out.println(" ligne 55"+listex.poll());
        System.out.println(listex);
     // using pollFirst() to retrieve and remove the head
        
        System.out.println("Head element of the list is : " + listex.pollFirst());
 // using pollLast() to retrieve and remove the head
        
        System.out.println("Last element of the list is : " + listex.pollLast());
        System.out.println(listex);
        
        
        System.out.println(" -------- ");
        // peek at the head of the list
        // Prints 1st element, "hey!"
        System.out.println("Head of the list : " + listex.peek());
        System.out.println(" the list : " + listex);
        
        //conversion en string
        
        String sentence= listex.toString();
        System.out.println(" the list : " + sentence);
        
        
        // Pop an element from stack
        String s = listex.pop();
        
 
        // Printing the popped element.
        System.out.println("pop elt"+s);
        
        
        
        
        
	}

}
