package src.cassaPub;

public class Cliente {
	
	private String nome;
	private String cognome;
	private char sesso;
	
	public Cliente(String nome, String cognome, char sesso) {
		this.nome = nome;
		this.cognome = cognome;
		this.sesso = sesso;
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
	
	public char getSesso() {
		return sesso;
	}

	public void setSesso(char sesso) {
		this.sesso = sesso;
	}

	@Override
	public String toString() {
		return "Cliente " + nome + " " + cognome +". " + sesso;
	}
	
	
	

}
