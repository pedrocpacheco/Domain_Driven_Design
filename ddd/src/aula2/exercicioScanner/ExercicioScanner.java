package aula2.exercicioScanner;

import java.util.Scanner;

public class ExercicioScanner {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a sua primeira nota: ");
		float nota1 = input.nextInt();
		
		System.out.println("Digite a sua segunda nota:");
		float nota2 = input.nextInt();
		
		System.out.println("Digite a sua terceira nota:");
		float nota3 = input.nextInt();
		input.close();
		
		float media = (nota1 + nota2 + nota3) / 3;
		System.out.println(media);
		
		// melhor usar o float, pois o valor não será tão grande.
		
	}
}
