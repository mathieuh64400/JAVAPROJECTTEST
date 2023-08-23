package heritage;

 public class Personnage extends Dynastie {
	
	String titre;
	int debutDeReigne;
	int finDeReigne;
	Boolean genre;
	String successeur;
	String caractere;
	String teritoireaC;
	
	Personnage (
			String titre,
	int debutDeReigne,
	int finDeReigne,
	Boolean genre,
	String successeur,
	String caractere,
	String teritoireaC,
	
	String Nom,
	 String territoire,
	 String caracteristique,
	String rivale){
		
		super(Nom,territoire,caracteristique,rivale);
		this.titre=titre;
		this.debutDeReigne=debutDeReigne;
		this.finDeReigne=finDeReigne;
		this.genre=genre;
		this.successeur=successeur;
		this.caractere=caractere;
		this.teritoireaC=teritoireaC;
	}
	
	public void transmettre() {
		
		System.out.println(this.titre +"mort en"+ this.finDeReigne +" transmet le trone a "+this.successeur );
	}
	
	public  String agir() {
		
		return this.gouverner() +this.titre+ "de la dynastie"+this.Nom +" qui a debute sont reigne en"+ this.debutDeReigne +" a declanché une guerre contre "+this.rivale+" car il est "+ this.caractere;
		
		
	}
	
	public void aquerir() {
		
		System.out.println( this.agir()+". En effet" +  this.titre +" cherche a aquerir le territoire "+ this.teritoireaC);
	
	}
	
	
	
	

}
