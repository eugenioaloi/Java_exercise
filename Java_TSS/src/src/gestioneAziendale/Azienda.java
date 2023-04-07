package src.gestioneAziendale;

import java.util.ArrayList;
import java.util.Scanner;

public class Azienda {
	public static void main(String[] args) {
		
		ArrayList<Impiegato> imp = addImpiegato();
		
		stampaDettagli(imp);
		
		System.out.println("Totale stipendi: " + stipendioTot(imp));
		
	}
	
	private static void stampaDettagli(ArrayList<Impiegato> impiegati) {
		for (Impiegato imp: impiegati) {
			System.out.println(imp);
		}
	}
	
	private static int stipendioTot(ArrayList<Impiegato> impiegati) {
		int totStipendio = 0;
		for(Impiegato imp : impiegati) {
			totStipendio += imp.getStipendio();
		}
		
		return totStipendio;
	}
	
	private static ArrayList<Impiegato> addImpiegato() {
		ArrayList<Impiegato> impiegati = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quanti impiegati vuoi inserire a sistema?");
		int n = sc.nextInt();
		sc.nextLine();
		
		for (int j = 0; j < n; j++) {
			System.out.println("Inserisci il nome");
			String nome = sc.nextLine();
			sc.nextLine();
			System.out.println("Inserisci il cognome");
			String cognome = sc.nextLine();
			sc.nextLine();
			System.out.println("Inserisci l'anno di nascita");
			int anno_nascita = sc.nextInt();
			sc.nextLine();
			System.out.println("Inserisci lo stipendio");
			int stipendio = sc.nextInt();
			sc.nextLine();
			impiegati.add(new Impiegato(nome, cognome, anno_nascita, stipendio));
		}
		sc.close();
		
		return impiegati;
	}
	
}
