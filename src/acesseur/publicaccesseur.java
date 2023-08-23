package acesseur;

import eltpackage.Test;

import eltpackage.Datattest;

public class publicaccesseur {
	
	

	public static void main(String[] args) {
		
		Test t = new Test(); // erreur si pas public ou protected
		
		Datattest D = new Datattest();
		
		//D.display2(); // protected ne marche pas car pas dans heritage 
		
	//	System.out.println(publicaccesseur.classdetest(2,3));
		t.display();
		
	}
}
