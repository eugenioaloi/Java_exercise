package src.cassaPub;

import java.util.ArrayList;
import java.util.HashMap;

public class Cassa {
	
	// la chieave è il giorno e il valore è l'arraylist di sconttrini emessi
	private HashMap<String, ArrayList<Scontrino>> giornataLavoro = new HashMap<>();
	
	public Cassa(HashMap<String, ArrayList<Scontrino>> giornataLavoro) {
		this.giornataLavoro = giornataLavoro;
	}
	
	//implementare
	public double incassoMedioGG() {
		return 0;
	}
	
	//implementare
	public void giornoIncassoMax() {
		
	}

	//implementare
	public double incassoMinWeek() {
		return 0;
	}
	
	//implementare
	public void migliorCameriere() {
		
	}
	
	//implementare
	public void peggiorameriere() {
		
	}
	
	//implementare
	public void migliorCliente() {
		
	}
	
	//implementare
	public void MasciFemmine() {
		
	}
	
	//implementare
	public void migliorConsuma() {
		
	}
	
	//implementare
	public void peggiorConsuma() {
		
	}
	
}
