package encapsulation;

public abstract class Vehicule {
	 public String Color;
	 public int nombreRoue;
	 //classe abstraite ne peuvent pas etre instancier; principe de la super class 
	//Une méthode abstraite est une méthode qui n'a pas d'implémentation.
	//Les classes abstraites peuvent avoir des constructeurs
	//Les classes abstraites peuvent implémenter des interfaces :
	
	
	//regle de base:
	//Toute classe contenant une ou plusieurs méthodes abstraites doit également être déclarée abstraite
	
	
	abstract String rouler(); //Ces méthodes sont parfois appelées responsabilité de sous-classe car elles n'ont pas d'implémentation spécifiée dans la super-classe.
	abstract int typer(); //aucun corps de méthode n'est présent.
	
	Vehicule(String Color, int nombreRoue){
		
		this.Color=Color;
		this.nombreRoue= nombreRoue;
	}
	
	public void action() {
		
		System.out.println(" hey cela bouge ");
		
		
	}

}
