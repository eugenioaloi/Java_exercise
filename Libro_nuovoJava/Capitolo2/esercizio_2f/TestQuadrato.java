package esercizio_2f;

public class TestQuadrato {
	
	public static void main(String[] args) {
		
		Quadrato q1 = new Quadrato();
		
		int lato = q1.setLato(10);
		
		System.out.println("Il lato del quadrato è: "+ lato);
		System.out.println("Il perimetro è: " + q1.perimetro(lato));
		System.out.println("Il perimetro è: " + q1.area(lato));

	}

}
