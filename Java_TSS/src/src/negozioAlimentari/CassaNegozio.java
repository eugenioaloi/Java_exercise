package src.negozioAlimentari;

import java.util.ArrayList;
import java.util.Collections;

public class CassaNegozio {
	
	private ArrayList<Prodotto> inventario;
	private ArrayList<Prodotto> carrello;
	Prodotto pr;
	
	private final int IVA_ALIMENTARI= 4;
	
	public CassaNegozio(ArrayList<Prodotto> inventario, ArrayList<Prodotto> carrello) {
		this.inventario = inventario;
		this.carrello = carrello;
	}
	
	public void inventario() {
		
		inventario.add(new Prodotto("C00001","Pasta Barilla",0.7));
		inventario.add(new Prodotto("C00002","Latte TappoRosso",1.65));
		inventario.add(new Prodotto("C00003","Caffe' Lavazza",2.5));
		inventario.add(new Prodotto("C00004","Caffe' Illy",2.0));
		inventario.add(new Prodotto("C00005","Biscotti Cioccolato",2.0));
		inventario.add(new Prodotto("C00006","Vino Rosso",2.0));
		
	}
	
	public void aggiungiProdotto(Prodotto p) {
		inventario.add(p);
	}
	
	public double sconto (String cod, int perc) {
		double sconto = 0;
		for (Prodotto p: inventario) {
			if(cod.contentEquals(p.getCodUnivoco())) {
				sconto = ((p.getPrezzo()*perc)/100);
			}
		}
		return sconto;
	}
	
	public void promozione(String cod, int perc) {
		
	}
	
	public void leggi(String cod) {
		for (int i = 0; i < inventario.size(); i++) {
			Prodotto p = inventario.get(i);
			if(p.getCodUnivoco().contentEquals(cod)) {
				inventario.remove(p);
				carrello.add(p);
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
