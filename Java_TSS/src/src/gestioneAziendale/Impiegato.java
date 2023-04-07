package src.gestioneAziendale;

public class Impiegato {
	
	private String nome;
	private String cognome;
	private int anno_nascita;
	private int stipendio;
	private String id;
	
	
	public Impiegato(String nome, String cognome, int anno_nascita, int stipendio) {
		this.nome = nome;
		this.cognome = cognome;
		this.anno_nascita = anno_nascita;
		this.stipendio = stipendio;
		this.id = Segreteria.creaId(nome,cognome,anno_nascita);
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCognome() {
		return cognome;
	}


	public void setCognome(String cognome) {
		this.cognome = cognome;
	}


	public int getAnno_nascita() {
		return anno_nascita;
	}


	public void setAnno_nascita(int anno_nascita) {
		this.anno_nascita = anno_nascita;
	}


	public int getStipendio() {
		return stipendio;
	}


	public void setStipendio(int stipendio) {
		this.stipendio = stipendio;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	@Override
	public String toString() {
		return nome + " " + cognome + " matricola: " + id + ". Percepsice " + stipendio + "€";
	}
	
	
	
	

	
	
	
	
	

}
