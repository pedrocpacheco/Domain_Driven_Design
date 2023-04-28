package aula2.scanner;

// Sempre importar o Scanner
import java.util.Scanner;

public class EntradaPeloTeclado {
	public static void main(String[] args){
		// "sca" ctrl espaço
		Scanner input = new Scanner(System.in); // Existem outros parametros de Scanner
		System.out.println("Digite seu nome: ");
		
		String nome = input.nextLine(); // next = só o proximo input | nextLine = até o próximo enter
		System.out.println("Olá, " + nome);
		input.close();
	} 
}
