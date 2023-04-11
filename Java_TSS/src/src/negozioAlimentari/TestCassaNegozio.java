package src.negozioAlimentari;

import java.util.ArrayList;
import java.util.Scanner;

public class TestCassaNegozio {
	public static void main(String[] args) {
		
		ArrayList<Prodotto> inventario = new ArrayList<>();
		ArrayList<Prodotto> carrello = new ArrayList<>();
		
		CassaNegozio cassa = new CassaNegozio(inventario,carrello);
		
		cassa.inventario();
		
		menuUtente(cassa);
		
	}
	
	public static void menuUtente(CassaNegozio cassa) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Benvenuto nel super");
		
		boolean flag = true;
		
		while(flag) {
			System.out.println("\nScegli cosa fare nel terminale -> \n-1 aggiungi -2 promuovi -3 leggi"
					+ "\n-4 stampa il totale -5 stampa il lordo - 6 stampa il totale delle tasse"
					+ "\n-7 stampa il carrello 8-stampa l'inventario 9-chiudi il programma");
					
			int scelta = sc.nextInt();
			
			switch(scelta) {
				case 1 ->{
					System.out.println("Inserisci il codice del prodotto che vuoi aggiungere");
					String cod = sc.next();
					sc.nextLine();
					System.out.println("Inserisci la descrizione del prodotto che vuoi aggiungere");
					String desc = sc.nextLine();
					System.out.println("Inserisci il prezzo del prodotto che vuoi aggiungere");
					double prezzo = sc.nextDouble();
					sc.nextLine();
					cassa.aggiungiProdotto(new Prodotto(cod, desc, prezzo));
					System.out.println("Prodotto aggiunto all'inventario");
					break;
				}
				case 2 ->{
					System.out.println("metodo da implementare");
					/*
					System.out.println("Inserisci il cod del prodotto in promozione");
					String cod = sc.next();
					sc.nextLine();
					System.out.println("Inserisci la % della promozione");
					int perc = sc.nextInt();
					sc.nextLine();
					//System.out.println(cassa.promozione(cod, perc));
					 * */
					break;
				} 
				case 3 ->{
					System.out.println("Inserisci il codice del prodotto che vuoi comprare");
					String cod = sc.next();
					sc.nextLine();
					cassa.leggi(cod);
					System.out.println("Prodotto aggiunto al carrello codice : " + cod);
					break;
				} 
				case 4 ->{
					System.out.println("Totale lordo: " + cassa.totale());
					break;
				} 
				case 5 ->{
					System.out.println("Totale netto: " + cassa.netto());
					break;
				} 
				case 6 ->{
					System.out.println("Totale tasse: " + cassa.tasse());
					break;
				} 
				case 7 ->{
					cassa.stampaCarrello();
					break;
				} 
				case 8 ->{
					System.out.println("Inventario");
					cassa.stampaInventario();
					break;
				} 
				case 9 ->{
					flag = false;
					sc.close();
					System.out.println("Programma chiuso correttamente");
				} 
				default ->{
					System.out.println("Inserimento non riconosciuto");
				}
			}
		}
	}
	
}
