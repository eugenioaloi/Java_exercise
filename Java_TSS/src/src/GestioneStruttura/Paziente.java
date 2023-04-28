package src.GestioneStruttura;

import java.util.HashMap;
import java.util.Map;

public class Paziente implements Persona {
	
	private String nome;
	private String cognome;
	private String codFiscale;
	
	public Paziente() {};
	
	public Paziente(String nome, String cognome, String codFiscale) {
		this.nome = nome;
		this.cognome = cognome;
		this.codFiscale = codFiscale;
	}
	
	@Override
	public String getNome() {
		return nome;
	}
	@Override
	public String getCognome() {
		return cognome;
	}
	
	@Override
	public Dottore getMedico(Persona p, HashMap<Paziente, Dottore> dbPazientiDottori) {
		Dottore d= new Dottore();
		for(Map.Entry<Paziente,Dottore> el: dbPazientiDottori.entrySet()) {
			if(el.getKey()==p) {
				d = el.getValue();
			}
		}
		return d;
	}

	public String getCodFiscale() {
		return codFiscale;
	}

	@Override
	public String toString() {
		return "Paziente: " + nome + " "+ cognome + " CF: " + codFiscale ;
	}
	
}
