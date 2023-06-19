package esercizio_1;

public class EsercizioColloquio {
	public static void main(String[] args) {
		
		 String caos = "a-c-2";
		 String ok = "";
		 
		 char[] chars = caos.toCharArray();//trasformare prima la stringa in un array di char
		 
		 for (int i = 0; i < caos.length(); i++) {//cicla
			 if(chars[i]!='-') {
				 ok+=chars[i];
			 }
		 }
		 
		 System.out.println(ok);
		
		
	}

}
