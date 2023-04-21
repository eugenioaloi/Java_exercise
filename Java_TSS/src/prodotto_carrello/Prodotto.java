package prodotto_carrello;

public class Prodotto {
	
	private String descrizione;
	private double prezzo;
	private boolean promozione;//true il prodotto è in promo
	
	public Prodotto(String descrizione, double prezzo, boolean promozione) {
		this.descrizione = descrizione;
		this.prezzo = prezzo;
		this.promozione = promozione;
	}
	
	public boolean isPromozione(Prodotto p,boolean promozione) {
		return p.promozione = promozione;
	}
	
	public double getPrezzo() {
		return prezzo;
	}
	
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public boolean getPromozione() {
		return promozione;
	}
	
	public String getDescrizione() {
		return descrizione;
	}
	
	@Override
	public String toString() {
		String msg = promozione ? "in promozione":"prezzo normale";
		return descrizione + ", prezzo: " + prezzo + " - " + msg + "\n";
	}
	

	
	
	
}
