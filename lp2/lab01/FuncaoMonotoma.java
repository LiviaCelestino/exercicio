/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Ana Lívia Celestino - 123110323
 */

import java.util.Scanner;

public class FuncaoMonotoma {
 	
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	int valor1 = sc.nextInt();
	int valor2 = sc.nextInt();
	int valor3 = sc.nextInt();
	int valor4 = sc.nextInt();
	
	if(valor1 > valor2 && valor1 ! valor2) { 
		if(valor2 > valor3) {
			if(valor3 > valor4) {
				System.out.println("POSSIVELMENTE ESTRITAMENTE DECRESCENTE");
			}
		}
	}
	else if(valor1 < valor2) {
		if(valor2 < valor3) {
			if(valor3 < valor4) {
				System.out.println("POSSIVELMENTE ESTRITAMENTE CRESCENTE");
			}
		}
	}
	else {
		System.out.println("FUNCAO NAO ESTRITAMENTE CRESC/DECR");
	}
	}
}
