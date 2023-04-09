package src.negozioAlimentari;

import java.util.ArrayList;
import java.util.Collections;

public class CassaNegozio {
	
	ArrayList<Prodotto> inventario = new ArrayList<>();
	ArrayList<Prodotto> carrello = new ArrayList<>();
	
	private final int IVA_ALIMENTARI= 4;
	
	public void aggiungiProdotto(Prodotto p) {
		inventario.add(p);
	}
	
	public String promozione(String cod, int perc) {
		double prezzoPromo = 0;
		String msg="";
		for (Prodotto p: inventario) {
			if(cod.contentEquals(p.getCodUnivoco())) {
				prezzoPromo = p.getPrezzo()-((p.getPrezzo()*perc)/100);
				p.setPrezzo(prezzoPromo);
				msg = "Prodotto in promozione: " + p;
				break;
			}else {
				msg =  "Promozione annullata";
			}
		}
		return msg;
	}
	
	public void leggi(Prodotto p) {
		for( int i = 0; i < inventario.size(); i++ ){
		    Prodotto prod = inventario.get( i );
		    if(prod.equals(p))
		    {
		         inventario.remove(p);
		         carrello.add(p);
		         i--; 
		         System.out.println(p);
		    }  
		}
	}
	
	public double totale() {
		double totale = 0;
		for(Prodotto p:carrello) {
			totale += p.getPrezzo();
		}
		return totale;
	}
	
	public double netto() {
		double netto = 0;
		for(Prodotto p:carrello) {
			netto += p.getPrezzo();
		}
		
		return netto-((netto*IVA_ALIMENTARI)/100);	
	}
	
	public double tasse() {
		double tasse = 0;
		for(Prodotto p:carrello) {
			tasse += p.getPrezzo();
		}
		
		return (tasse*IVA_ALIMENTARI)/100;	
	}
	
	public void stampaCarrello() {
		ArrayList<String> carrOrdinato = new ArrayList<>();
		for(Prodotto p:carrello) {
			carrOrdinato.add(p.getDescrizione());
		}
		Collections.sort(carrOrdinato);
		System.out.println("Prodotti comprati in ordine alfabetico:" + carrOrdinato);
	}
	
	public void stampaInventario() {
		for(Prodotto p: inventario) {
			System.out.println(p);
		}
	}
	
	
}
