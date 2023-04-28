package aula7;

import java.util.Scanner;

public class lacos {

	public static void main(String[] args) {
		System.out.println("Teste aula 7");
		Scanner cc = new Scanner(System.in);
		
		System.out.println("Digite um Numero");
		int numero = cc.nextInt();
		
		switch(numero){
		
		case 1:
		case 2:
			System.out.println("Digitou 1 ou 2");
			break;
		default:
			System.out.println();
		}
		
		
		
		
	}
	
}
