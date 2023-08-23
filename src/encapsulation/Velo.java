package encapsulation;

public class Velo extends Vehicule {
	
	int taille;
	Velo(int taille, String Color, int nombreRoue){
		
		super(Color,  nombreRoue);
		
		this.taille=taille;
	}
	
	
	@Override String rouler() {
		
		
		return "je roule avec mon "+this.nombreRoue+" roues de couleur"+this.Color+". ce velo posséde deux roues en carbone";
	}
	
	@Override int typer() {
		
		
		return this.nombreRoue;
	}
	
	public void agir(int m) {
		this.action();
		
		System.out.println("je roule avec un velo de "+this.taille+"cm donc"+this.rouler()+" pour moi le velo c est mieux a"+m);
		
	}

}
