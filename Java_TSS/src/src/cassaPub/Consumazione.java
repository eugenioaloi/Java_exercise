package src.cassaPub;

public class Consumazione {
	
	private String nome;
	private int quantità;
	private double prezzo;
	
	public Consumazione(String nome, int quantità, double prezzo) {
		this.nome = nome;
		this.quantità = quantità;
		this.prezzo = prezzo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantità() {
		return quantità;
	}

	public void setQuantità(int quantità) {
		this.quantità = quantità;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	@Override
	public String toString() {
		return quantità + " - " + nome + ", prezzo: " + prezzo; 
	}
	
	
	
	

}
