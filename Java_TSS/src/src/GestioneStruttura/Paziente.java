package src.GestioneStruttura;

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

	public String getCodFiscale() {
		return codFiscale;
	}

	@Override
	public String toString() {
		return "Paziente= " + nome + cognome + ", codFiscale= " + codFiscale ;
	}

	
	
	
}
