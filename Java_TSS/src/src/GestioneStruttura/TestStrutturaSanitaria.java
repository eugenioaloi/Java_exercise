package src.GestioneStruttura;

import java.util.ArrayList;

public class TestStrutturaSanitaria {

	public static void main(String[] args){
		
		StrutturaSanitaria st = new StrutturaSanitaria(new ArrayList<Paziente>(), new ArrayList<Dottore>());
		
		st.aggiungiPersona("Giovanni", "Rossi", "RSSGNN33B30F316I");
		st.aggiungiPersona("Giuseppe", "Verdi", "VRDGPP76F09B666I");
		st.aggiungiMedico("Luana", "Bianchi", "SCVS", 1);
		st.aggiungiMedico("Marcella", "Gialla", "AFGA",2);
		
		
		try {
			Paziente p = st.getPersona("X");
			System.out.println(p.getNome());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			Dottore dott = st.getMedico(10);
			System.out.println(dott.getNome());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
}
