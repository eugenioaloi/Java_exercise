package esercizio5;

import java.util.ArrayList;
import java.util.List;

public class EsercizioChatGPT4 {
	public static void main(String[] args) {
		
		//solo numeri pari
		List<Integer> numeri = new ArrayList<>(List.of(0,1,2,3,4));
		List<Integer> numeriPari = new ArrayList<>();
		
		for(int n:numeri) {
			if(n%2==0) {
				numeriPari.add(n);
			}
		}
		
		System.out.println(numeriPari);
		
	}

}
