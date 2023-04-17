package src.biblioteca;

public class Libro {
	
	private String titolo;
	private String autore;
	private boolean inPresito;
	
	public Libro(String titolo, String autore, boolean inPresito) {
		this.titolo = titolo;
		this.autore = autore;
		this.inPresito = inPresito;
	}

	public String getDescrizione() {
		String disponibile = inPresito!=true?" E'disponibile":" Non disponibile";
		return  titolo + " dell'autore: " + autore + ". " + disponibile;
	}
	
	public boolean getInPrestito() {
		return inPresito;
	}
	
	public void setInPresito(boolean stato) {
		if(inPresito==true && stato == false) {
			this.inPresito = stato;
		}else if(inPresito==false && stato ==true) {
			this.inPresito = stato;
		}else if(inPresito==true) {
			System.out.println("Il libro è in prestito");
		}else {
			System.out.println("Il libro è in biblioteca");
		}
	}

}
