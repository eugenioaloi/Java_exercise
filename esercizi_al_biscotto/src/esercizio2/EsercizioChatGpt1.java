package esercizio2;

public class EsercizioChatGpt1 {
	public static void main(String[] args) {
		
		//scrivere un metodo in grado di restituire una stringa all'incontrario
		
		String s = "Hello biscuit";
		
		//String sInv ="tiucsib olleH";
		String sInvertita = "";
		
		for (int i = s.length()-1; i >=0; i--) {
			sInvertita += s.charAt(i);
		}
		
		System.out.println(sInvertita);
	}
}
