package src.negozioAbbigliamento;

public class CapoAbbigliamento extends TipoCapoAbbigliamento{
	
	private int taglia;
	private int qtAcquistata;
	private int qtDisponibile;
	
	public CapoAbbigliamento(String marca,String modello, double costo, 
			int taglia, int qtAcquistata, int qtDisponibile) {
		super(marca,modello,costo);
		this.taglia = taglia;
		this.qtAcquistata = qtAcquistata;
		this.qtDisponibile = qtDisponibile;
	}

	public void venduto(int nVenduti) {
		if(nVenduti<qtDisponibile) {
			setQtDisponibile(qtDisponibile-nVenduti);
		}
	}
	
	public int getTaglia() {
		return taglia;
	}

	public void setTaglia(int taglia) {
		this.taglia = taglia;
	}

	public int getQtAcquistata() {
		return qtAcquistata;
	}

	public void setQtAcquistata(int qtAcquistata) {
		this.qtAcquistata = qtAcquistata;
	}

	public void setQtDisponibile(int qtDisponibile) {
		this.qtDisponibile= qtDisponibile;
	}
	
	public int getQtDisponibile() {
		return qtDisponibile;
	}

	public String getDettagli(){
		return super.toString()+ "Vendtuti " + qtAcquistata + " pezzi della taglia " + 
				taglia + ". Qt disponibile: " + qtDisponibile;
	}
	
}
