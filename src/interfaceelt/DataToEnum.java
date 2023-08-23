package interfaceelt;

public class DataToEnum {
	 	@Deprecated // permet de specifier qu'un element est obsolete : pour documentation @dep... et pour reflexion d'execution @Dep...
	public static void data() {
		System.out.println("hey ca va?");
	}
	 	@SuppressWarnings({"checked", "deprecation"})
static public void main (String[] args) {
	DAY t= DAY.LUNDI;
	
	System.out.println(t.getValue());// valeur de enum en min (valeur entre "") 
	// @Override que sur des methodes.Une méthode annotée avec @Override doit remplacer une méthode d'une superclasse.
	
	System.out.println(t.name()); // nom de enum en MAJ
	
	DataToEnum.data();

}
}
