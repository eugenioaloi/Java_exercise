package src.GestioneStruttura;

import java.util.ArrayList;
import java.util.HashMap;

public class StrutturaSanitaria {
	
	ArrayList<Paziente> pazienti;
	ArrayList<Dottore> dottori;
	HashMap<Paziente, Dottore> dbPazientiDottori;
	
	public StrutturaSanitaria(ArrayList<Paziente> pazienti,ArrayList<Dottore> dottori,
			HashMap<Paziente, Dottore> dbPazientiDottori ) {
		this.pazienti= pazienti;
		this.dottori = dottori;
		this.dbPazientiDottori = dbPazientiDottori;
	}
	
	public void aggiungiPersona(String nome,String cognome,String codFiscale) {
		pazienti.add(new Paziente(nome, cognome, codFiscale));
	}
	
	public void aggiungiMedico(String nome,String cognome,String codFiscale, int matricola) {
		dottori.add(new Dottore(nome, cognome, codFiscale, matricola));
	}
	
	public void assegnaMedico(int matricola, String codFiscale) throws Exception {
		Paziente p = getPersona(codFiscale);
		Dottore dott = getMedico(matricola);
		if(p!=null && dott!=null) {
			dbPazientiDottori.put(p, dott);
		}
	}
	
	public Paziente getPersona(String codFiscale) throws Exception{
		Paziente p = new Paziente();
		boolean flag = true;
		while(flag) {
			for(Paziente paz: pazienti) {
				if(paz.getCodFiscale().contentEquals(codFiscale)) {
					flag = false;
					p=paz;
				}
			}
			if(p.getCodFiscale()==null) {
				throw new Exception("ErrPersonaInesistente");
			}else {
				flag= false;
			}
		}
		return p;
	}
	
	public Dottore getMedico(int matricola) throws Exception{
		Dottore d = new Dottore();
		boolean flag = true;
		while(flag) {
			for(Dottore dott: dottori) {
				if(dott.getMatricola() == matricola) {
					flag = false;
					d=dott;
				}
			}
			if(d.getMatricola()==0) {
				throw new Exception("ErrMedicoInesistente");
			}else {
				flag= false;
			}
		}
		return d;
	}
	
}
