package src.negozioAbbigliamento;

public class TipoCapoAbbigliamento {
	
	private String marca;
	private String modello;
	private double costo;
	
	public TipoCapoAbbigliamento(String marca,String modello, double costo) {
		this.marca = marca;
		this.modello = modello;
		this.costo = costo;
	}
	
	public double applicaSconto(double perc) {
		double sconto = costo-((costo*perc)/100); 
		modificaCosto(sconto);
		return sconto;
	}
	
	public void modificaCosto(double sconto) {
		setCosto(sconto);
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getMarca() {
		return marca;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	@Override
	public String toString() {
		return modello + " " + marca + ", ha un costo di " + costo; 
	}
	
}
