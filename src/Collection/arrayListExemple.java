package Collection;


import java.io.*;
import java.util.*;

public class arrayListExemple {
	
	
	
	public static void main(String[] args) {
		int min=0;
		int max=100;
		int max2=10;
		int min2=10;
		
	double a=	Math.random() * (max - min2 + 1) + min2  ;
	System.out.println(a);
	double b=	Math.random() * (max2 - min + 1) + min  ;
	System.out.println(b);
	int value= (int) a; //conversion double en int;
	int datatest= (int)Math.floor(b);
		
		
		
		//arrayList fournit tableaux dynamiques
		
		//implémentée à l'aide de l'interface List. Java
		
		//declaration de la list
		ArrayList<Integer> arraytest = new ArrayList<Integer>();
		
		  System.out.println("Array:" + arraytest); //permet de voir le tableau
		  if (arraytest.isEmpty()) { //permet de voir si le tableau est vide;
			    System.out.println("Liste vide");}
		  System.out.println("value"+value);
		  for(int i=0; i<value;i++) {
			  
			  int data= (i*2)+(datatest*5);
			  arraytest.add(data);
		  }
		  System.out.println("tableau initial"+ arraytest);
		  if (!arraytest.isEmpty() && arraytest.contains(54)) {
			  //obtenir valeur a un index specifié:
			  System.out.println("valeur a index 3:" + arraytest.get(3));
			   
			  System.out.println("Array taille:" + arraytest.size()); 
			  System.out.println(arraytest.contains(54));//cointains permet de verifier si contient 1 valeur
			  System.out.println(arraytest.indexOf(54));//indexOf permet de trouver 1 index si fournit 1 valeur
			  int index=arraytest.indexOf(54);
			  arraytest.remove(index); //supprimer  index 54
			  System.out.println("verif tableau"+arraytest);
			  //filtration d'un tableau === filter en js
			  arraytest.removeIf(n -> (n > 50 ));
			  System.out.println("tableau filtré"+arraytest);
			  
			  arraytest.set(0, 30); //remplace a l'index 0 la valeur par 30
			  //partition du tableau avec subList
			  List<Integer> arrList =arraytest.subList(0, 10);
			  System.out.println( "sous-tableau"+ arrList);
			  //ArrayList to Array
			  Object[] objects = arrList.toArray();
			 for(int j=0;j< objects.length;j++ ) {
				 System.out.println( "obj"+objects[j]);
				 
			 }
			  
			  
			  
			  

			  
		  }
		   
		  int val=value-datatest;
		  System.out.println("val"+val);
		  if(val<arraytest.size()) {
		 
		  System.out.println(" valeur du Array:" + arraytest.get(val)); //get permet de trouver 1 valeur si fournit index
		  }
		  for(Integer n : arraytest) { //permet de lire un arrayList
			  System.out.println("elt de arraytest "+n);
		  }
		
		  
		  
		  
	}
	

}
