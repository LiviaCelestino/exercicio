/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Ana Lívia Celestino - 123110323
 */

import java.util.Scanner;

public class PassouOuNao {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	float  nota1 = sc.nextFloat();
	float nota2 = sc.nextFloat();
	float media = (nota1 + nota2)/2;
	if(media >= 7) {
		System.out.println("pass: True");
		} 
	else {
		System.out.println("pass: False!");
		}
	}
}
