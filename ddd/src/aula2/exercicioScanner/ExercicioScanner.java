package aula2.exercicioScanner;

import java.util.Scanner;

public class ExercicioScanner {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a sua primeiro: ");
		int nota1 = input.nextInt();
		
		System.out.println("Digite a sua segunda nota:");
		int nota2 = input.nextInt();
		
		System.out.println("Digite a sua terceira nota:");
		int nota3 = input.nextInt();
		input.close();
		
		double media = (nota1 + nota2 + nota3) / 3;
		System.out.println(media);
		
	}
}
