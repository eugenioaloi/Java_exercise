package src.cassaPub;

import java.util.ArrayList;
import java.util.Scanner;

public class TestCassa {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Benvenuto al ristorante Java");
		System.out.println("Quante ordinazioni vuoi fare");
		int ordinazioni = sc.nextInt();;
		
		ArrayList<Consumazione> consumazioni = new ArrayList<>();
		
		for(int i= 0;i<ordinazioni;i++) {
			System.out.println("Inserisci l'ordinazione");
			String nome = sc.nextLine();
			//String nome = "pizza";
			sc.nextLine();
			System.out.println("nome ord: " + nome);
			System.out.println("Inserisci la quantità");
			int qt = sc.nextInt();
			System.out.println("Inserisci il prezzo");
			double prezzo = sc.nextDouble();
			consumazioni.add(new Consumazione(nome, qt, prezzo));
		}
		
		Scontrino s1 = new Scontrino("lunedi", consumazioni, new Cameriere("Mario", "Rossi"));
		
		
		System.out.println(s1);
		
		
		
	}
}
