package src.GestioneStruttura;

public class Dottore implements Medico {
	
	private String nome;
	private String cognome;
	private String codFiscale;
	private int matricola;

	public Dottore() {};
	
	public Dottore(String nome, String cognome, String codFiscale, int matricola) {
		this.nome = nome;
		this.cognome = cognome;
		this.codFiscale = codFiscale;
		this.matricola = matricola;
	}

	@Override
	public int getMatricola() {
		return matricola;
	}

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	public String getCodFiscale() {
		return codFiscale;
	}

	@Override
	public String toString() {
		return "Dottore: " + nome + " " +  cognome + " CF: " + codFiscale + ", matricola= "
				+ matricola ;
	}
	
}
