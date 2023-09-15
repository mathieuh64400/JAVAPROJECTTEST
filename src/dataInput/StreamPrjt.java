package dataInput;
import java.util.*;
import java.util.stream.*;
public class StreamPrjt {
	public static void main(String[] args) {
			List<Integer> n = Arrays.asList(1,2,3,4,5);
			Long count = n.stream().count();
			System.out.println("count "+ count); // compte le nbre d'element dans un tableau
			
			
			  int even
	          = n.stream()
	            .reduce(0, (ans, i) -> ans + i);
	 
	        System.out.println(even);
	        
	        List<Integer> s= n.stream().map(x-> x*x).collect(Collectors.toList());
			for( int x : s) {
				System.out.println(x);
			}
			
//	 liste de data :
			List<String> v = Arrays.asList("Jean-laurent","Hervé","Yulia","Béatrice","Monica","Mégane","Mathieu");
			
			List<String> StringD= v.stream().filter(d->d.endsWith("a")).collect(Collectors.toList());
			
			for(String t: StringD) {
				System.out.print(" "+t);
			}
			
			 // demonstration of reduce method
	      
			
	}

}
