package prodotto_carrello;

import java.util.ArrayList;
import java.util.List;

public class Carrello {
	
	private String nomeCliente;
	private List<Prodotto> prodotti;
	
	public Carrello(String nomeCliente) {
		this.nomeCliente = nomeCliente;
		this.prodotti = new ArrayList<>();
	}
	
	public void aggiungiProdotto(Prodotto p, int q) {
		for (int i = 0; i < q; i++) {
			prodotti.add(p);
		}
	}
	
	public double totale() {
		double tot = 0;
		for(Prodotto p:prodotti) {
			tot += p.getPrezzo();
		}
		return tot;
	}
	
	public double totalePromozione() {
		double tot = 0;
		for(Prodotto p:prodotti) {
			if(p.getPromozione()) {
				tot += p.getPrezzo();
			}
		}
		return tot;
	}
	
	public int numeroTotaleProdotti() {
		int count =0;
		/*
		 * deve poter saltare alla prossima descrizione
		 
		for (int i = 0; i < prodotti.size(); i++) {
			for (int j = 0; j < prodotti.size()-1; j++) {
				if(!prodotti.get(i).getDescrizione().
						contentEquals(prodotti.get(j).getDescrizione())) {
					count ++;
					i++;
				}
			}
		}
		 * 
		 */
		 
		return count;
		}
	
	public int prodottiOrdinati() {
		int tot = 0;
		for(Prodotto p:prodotti) {
			tot++;
		}
		return tot;
	}

	@Override
	public String toString() {
		return nomeCliente + ", prodotti=" +prodotti;
	}
	
	
}
