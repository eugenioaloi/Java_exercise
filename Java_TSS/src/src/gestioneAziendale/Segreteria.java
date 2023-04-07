package src.gestioneAziendale;

public class Segreteria {

	public static String creaId(String n,String c, int a) {
		
		return n.substring(0,2)+c.substring(0,2)+a;
	}
	

}
