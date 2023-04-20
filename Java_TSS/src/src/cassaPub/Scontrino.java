package src.cassaPub;

import java.util.List;

public class Scontrino {
	
	private String giorno;
	private List<Consumazione> consumazioni;
	private static int id=0;//id generato in automatico
	private double totScontrino;
	private Cameriere cam;
	
	public Scontrino(String giorno, List<Consumazione> consumazioni, Cameriere cam) {
		this.giorno = giorno;
		this.consumazioni= consumazioni;
		this.cam = cam;
		totScontrino = totScontrino(consumazioni);
		id++;
	}

	public double totScontrino(List<Consumazione> consumazioni) {
		double tot = 0;
		for(Consumazione cons : consumazioni) {
			tot += cons.getPrezzo();
		}
		return tot;
	}
	
	public String getGiorno() {
		return giorno;
	}

	public void SetGiorno(String giorno) {
		this.giorno = giorno;
	}

	public List<Consumazione> getConsumazioni() {
		return consumazioni;
	}

	public void setConsumazioni(List<Consumazione> consumazioni) {
		this.consumazioni = consumazioni;
	}

	@Override
	public String toString() {
		return "Id scontrino: " + id + ", battuto " + giorno + "\n" + consumazioni + 
				"\n Cameriere responsabile " + cam + ". Totale speso=  " + totScontrino;
	}
	
}
