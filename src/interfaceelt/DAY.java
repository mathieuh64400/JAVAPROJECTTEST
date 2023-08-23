package interfaceelt;

public enum DAY {
LUNDI("lundi"),MARDI("mardi"),MERCREDI("mercredi"),JEUDI("jeudi"),VENDREDI("vendredi"),SAMEDI("samedi"),DIMANCHE("dimanche");

private String value;
	 DAY(String value){
		this.value=value;
	}
	public String getValue() {
		return value;
	}


}
