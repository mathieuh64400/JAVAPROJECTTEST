package encapsulation;

public class personne {
	
	private String nom;
	private int age;
	// encapsulation = setter et getter
	personne(String nom, int age){
		
		this.nom=nom;
		this.age=age;
		
	}
	
	
	public void setNom(String nom) {
		
		this.nom=nom;
	}
public void setAge(int age) {
		
		this.age=age;
	}

public String getNom() {
	return nom;
}

public int getAge() {
	return age;
}
	

}
