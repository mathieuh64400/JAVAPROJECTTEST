package heritage;

public class Dynastie {
	
	public String Nom;
	public  String territoire;
	public String caracteristique;
	public String rivale;
	
	 Dynastie ( String Nom,
	 String territoire,
		 String caracteristique,
		String rivale){
		 
		 this.Nom=Nom;
			 this.territoire=territoire;
			 this.caracteristique=caracteristique;
			this.rivale=rivale;
		 
		 
		 
	 }
	 public String gouverner() {
		 
		 return " HISTORIQUEMENT la maison "+this.Nom+" possede tous les traits "+this.caracteristique+" et  gouverne "+this.territoire+ " et est en rivalité avec "+ this.rivale;
		 
		 
	 }

}
