package interfaceelt;

public interface int1 {
	
	//Les interfaces spécifient ce qu'une classe doit faire et non comment. C'est le schéma directeur du comportement.
	//L'interface n'a pas de constructeur. 
	//Il spécifie donc un ensemble de méthodes que la classe doit implémenter.
	//Il est utilisé pour atteindre une abstraction totale
	//il peut réaliser plusieurs héritages.
	//Toute classe ne peut étendre qu'une seule classe, mais n'importe quelle classe peut implémenter un nombre infini d'interfaces.
	// les variables de l'interface sont finales, publiques et statiques.
	
	
	 final static public float a=273.15f ;
	 void chauffer();
	 void refroidir();
	 void maintenir();
	 
	 

}
