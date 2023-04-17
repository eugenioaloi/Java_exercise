package src.biblioteca;

import java.util.ArrayList;

public class Biblioteca<T> {
	
	public ArrayList<T> libri = new ArrayList<>();
	
	public Biblioteca(ArrayList<T> libri) {
		this.libri= libri;
	}
	
	//aggiunge un libro
	public void addLibro(T l) {
		libri.add(l);
	}
	
	//true se il libro è presente in biblioteca
	public boolean inBiblioteca(Libro t) {
		return t.getInPrestito()?false:true;
	}
	
	//consente di dare in prestito un libro
	public void prestato(Libro l, boolean stato) {
		l.setInPresito(stato);
	}
	
	//consente di restituire un libro
	public void restituito(Libro l, boolean stato) {
		l.setInPresito(stato);
	}
	
	//conta il numero di libri in prestito
	public int totInPrestito() {
		int conto = 0;
		for(T l: libri) {
			if(((Libro) l).getInPrestito()==true) {
				conto++;
			}
		}
		return conto;
	}
	
	//true se non ci sono libri in prestito
	public boolean nessunPrestito() {
		boolean nessuno = true;
		for(T l: libri) {
			if(((Libro) l).getInPrestito()==true) {
				nessuno = false;
			}
		}
		return nessuno;
	}
	
	// conta quanti libri per bambini di età minore o uguale a n sono presenti in biblioteca
	public int perBambini(int n) {
		int conto = 0;
		for(T lb:libri) {
			if(lb instanceof LibroPerBambini) {
				if(((LibroPerBambini) lb).getEtaConsigliata()<=n) {
					conto++;
				}
			}
		}
		return conto;
	}
	
}
