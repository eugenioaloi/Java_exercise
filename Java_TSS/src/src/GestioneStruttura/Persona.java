package src.GestioneStruttura;

import java.util.HashMap;

public interface Persona {
	
	String getNome();
	String getCognome();
	
	Dottore getMedico(Persona p, HashMap<Paziente, Dottore> dbPazientiDottori);
	
}
