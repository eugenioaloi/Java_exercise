package src.negozioAbbigliamento;

public class Negozio {
	public static void main(String[] args) {
		
		TipoCapoAbbigliamento giaccaColmar = new TipoCapoAbbigliamento("Colmar","Giacca",350.5 );
		
		System.out.println("Prezzo prima dello sconto: " + giaccaColmar.getCosto());
		
		giaccaColmar.applicaSconto(30);
		
		System.out.println("Prezzo dopo lo sconto: " + giaccaColmar.getCosto());
		
		CapoAbbigliamento jeansLevis = new CapoAbbigliamento("Levis", "Jeans", 79.8, 40, 30, 30);
		
		jeansLevis.venduto(2);
		
		System.out.println(jeansLevis.getDettagli());
		
	}
}
