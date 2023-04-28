	package src.GestioneStruttura;

import java.util.ArrayList;
import java.util.HashMap;

public class TestStrutturaSanitaria {

	public static void main(String[] args){
		
		StrutturaSanitaria st = new StrutturaSanitaria(new ArrayList<Paziente>(), new ArrayList<Dottore>(),
				new HashMap<Paziente, Dottore>());
		
		st.aggiungiPersona("Giovanni", "Rossi", "RSSGNN33B30F316I");
		st.aggiungiPersona("Giuseppe", "Verdi", "VRDGPP76F09B666I");
		
		st.aggiungiMedico("Luana", "Bianchi", "SCVS", 1);
		st.aggiungiMedico("Marcella", "Gialla", "AFGA",2);
		
		try {
			//assegno un medico ad un paziente
			st.assegnaMedico(1, "RSSGNN33B30F316I");
			
			//ritorno un paziente grazie al metodo
			Paziente p = st.getPersona("RSSGNN33B30F316I");
			System.out.println(p.getNome());
			
			//ritorno un medico grazie al metodo
			Dottore dott = st.getMedico(1);
			System.out.println(dott.getNome());
			
			//controllo quale medico è assegnato ad un paziente
			Dottore dottAss = p.getMedico(p, st.dbPazientiDottori);
			System.out.println(p + " - " + dottAss);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
