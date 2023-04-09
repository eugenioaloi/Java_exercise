package src.negozioAlimentari;

public class Prodotto {
	
	private String codUnivoco;
	private String descrizione;
	private double prezzo;
	
	public Prodotto(String codUnivoco, String descrizione, double prezzo) {
		this.codUnivoco = codUnivoco;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
	}

	public String getCodUnivoco() {
		return codUnivoco;
	}

	public void setCodUnivoco(String codUnivoco) {
		this.codUnivoco = codUnivoco;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	@Override
	public String toString() {
		return codUnivoco + "|" + descrizione + "|" + prezzo ;
	}
	
	
	
}
