package aula2.scanner;

// Sempre importar o Scanner
import java.util.Scanner;

public class EntradaPeloTeclado {
	public static void main(String[] args){
		// "sca" ctrl espa�o
		Scanner input = new Scanner(System.in); // Existem outros parametros de Scanner
		System.out.println("Digite seu nome: ");
		
		String nome = input.nextLine(); // next = s� o proximo input | nextLine = at� o pr�ximo enter
		System.out.println("Ol�, " + nome);
		input.close();
	} 
}
