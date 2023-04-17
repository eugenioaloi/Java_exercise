package src.biblioteca;

import java.util.ArrayList;

public class TestBiblioteca <T> {
	
	public static void main(String[] args){
		
		ArrayList bibiliotecaJava = new ArrayList<>();
		
		Biblioteca test = new Biblioteca<>(bibiliotecaJava);
		
		bibiliotecaJava.add(new Libro("Un mese con Montalbano", "Andrea Camilleri", false));
		bibiliotecaJava.add(new LibroPerBambini("Alla ricerca di Nemo", "Disney", true, 6));

		for(Object obj:bibiliotecaJava) {
			
			Libro l = (Libro)obj;
			System.out.println(l.getDescrizione());
			System.out.println("E' in biblioteca? " + test.inBiblioteca(l) );//true
			test.prestato(l, true);
			System.out.println("E' in biblioteca? " + test.inBiblioteca(l) );//false
				
		}
		
		int nAnni = 18;
		
			System.out.println("Quanti libri ci sono in prestito? " + test.totInPrestito());
			System.out.println("Non ci sono libri in prestito " + test.nessunPrestito());
			System.out.println("Quanti libri per bambini sotto i " + nAnni + " ci sono in biblioteca? " 
					+ test.perBambini(nAnni));
	}
	
}
