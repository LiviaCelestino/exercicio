package javabasico;
import java.util.Scanner;

public class P2Aula3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		palavra = sc.next();
		String maior = palavra;
		String menor = palavra;

		for(int i=0; i < 4; i++) {
			palavra = sc.next();
			if(palavra.length() > maior.length()) {
				maior = palavra;
			
			} else if(palavra.length() < menor.length()) {
				menor = palavra;
			}
		}
		System.out.println(menor);
		System.out.println(maior);
	}
}
