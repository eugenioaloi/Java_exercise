package src.biblioteca;

public class LibroPerBambini extends Libro{

	private int etaConsigliata;
	
	public LibroPerBambini(String titolo, String autore, boolean inPresito, int etaConsigliata) {
		super(titolo,autore,inPresito);
		this.etaConsigliata= etaConsigliata;
	}

	public String getDescrizione(){
		return super.getDescrizione() + ", età consigliata: "+ etaConsigliata + " anni.";
	}
	
	public int getEtaConsigliata() {
		return etaConsigliata;
	}

	public void setEtaConsigliata(int etaConsigliata) {
		this.etaConsigliata = etaConsigliata;
	}

}
