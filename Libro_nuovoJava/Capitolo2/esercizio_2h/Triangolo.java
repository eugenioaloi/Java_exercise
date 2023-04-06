package esercizio_2h;

public class Triangolo {
	
	//Per semplicità il triangolo è equilatero	
	public int lato;
	public final int NUMERO_LATI = 3;
	
	//COSTRUZIONE DEL TRIANGOLO DAL LATO
	public void buildTriangolo(int latoTri) {
		this.lato = latoTri;
		System.out.println("Triangolo costruito con lato di: " + latoTri + "cm" );
	}
	
	//BASE
	public int ottBase() {
		int base = lato;
		return base;
	}
	
	//ALTEZZA - è un numero con la virgola = DOUBLE
	public double ottAltezza() {
		//la formula corretta h = (l*rad3)/2 - la radice di 3 è 1.732 circa
		double altezza = (lato*1.732)/2;
		return altezza;
	}
	
	//PERIMETRO = L*3
	public int perimetroTriangolo() {
		int perimetro = lato*NUMERO_LATI;
		return perimetro;
	}

	//AREA = (bxh)/2
	public double areaTriangolo(int b, double h) {
		double area = (b*h)/2;
		return area;
	}
	
	//Metodo stampaDettagli
	public void stampaDettagli(double area, int perimetro) {
		System.out.println("Triangolo con lato: "+ lato + " cm. L'area è di " + area + " cm, mentre il perimetro equivale a " + perimetro + " cm" );
	}
	

}
