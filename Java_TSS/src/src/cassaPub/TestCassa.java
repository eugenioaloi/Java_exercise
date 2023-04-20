package src.cassaPub;

import java.util.ArrayList;
import java.util.List;

public class TestCassa {
	public static void main(String[] args) {
		
		//oggi
		Cameriere gianni = new Cameriere("Gianni", "Pinotto");
		Cameriere lola = new Cameriere("Lola", "Bunny");
		
		
		List<Consumazione> consumTV1 = new ArrayList<>();
		consumTV1.add(new Consumazione("Coca cola", 2, 6.0));
		consumTV1.add(new Consumazione("Pizza margherita", 2, 10.0));
		
		Scontrino s1 = new Scontrino("Mercoledì", consumTV1, gianni);
		
		
		List<Consumazione> consumTV2 = new ArrayList<>();
		consumTV2.add(new Consumazione("Birra weiss", 2, 8.0));
		consumTV2.add(new Consumazione("Pizza diavola", 2, 12.0));
		
		Scontrino s2 = new Scontrino("Mercoledì", consumTV2, lola);
		
		
		System.out.println(s1);
		System.out.println(s2);
		
		
	}
}
