package src.cassaPub;

import java.util.ArrayList;
import java.util.Date;

public class Scontrino extends Cameriere{
	
	//private Date data ;
	private String giorno;
	private ArrayList<Consumazione> consumazioni = new ArrayList<>();
	private String id;
	private static int idScontrino = 0;
	
	public Scontrino(String giorno, ArrayList<Consumazione> consumazioni, Cameriere cam) {
		this.giorno = giorno; 
		this.consumazioni = consumazioni;
		this.id = creaId(cam.getNome(),cam.getCognome(), idScontrino++);
	}
	
	public String creaId(String n,String c, int num) {
		return n.substring(0,2)+c.substring(0,2)+num;
	}

	public String getGiorno() {
		return giorno;
	}

	public void setGiorno(String giorno) {
		this.giorno = giorno;
	}

	public ArrayList<Consumazione> getConsumazioni() {
		return consumazioni;
	}

	public void setConsumazioni(ArrayList<Consumazione> consumazioni) {
		this.consumazioni = consumazioni;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Scontrino battuto " + giorno + "\nconsumazioni=" + consumazioni + super.toString() ;
	}

}
