package aula3.aprendendoClasses;

public class Conta {

	// Definindo Atributos
	String titular;
	int numConta;
	double saldo;
	
	// Getters e Setters titular
	public void setTitular(String titular) {
		this.titular = titular; // Estamos atribuindo o valor da variavel titular passada quando o metodo é
								// Chamado, ao atributo titular da classe Conta				
	}
	
	public String getTitular() {
		return titular;
	}
	
	// Getters e Setters numConta
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	
	public int getNumConta() {
		return numConta;
	}
	
	//Getters e Setters saldo
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double getSaldo(){
		return saldo;
	}
	
	// Getters devolvem um valor por que essa é justamente a função deles, pegar o tal valor.
	// Setters são void pois eles só tem a função de alterar algo dentro da clase, e não devolver algo.
	public static void main(String[] args) {
		
		// Criando um objeto da classe Conta
		Conta conta1 = new Conta();
		
		// Alterando diretamente os atributos
		conta1.titular = "Pedro";
		conta1.numConta = 123;
		conta1.saldo = 50.0;
		
		// Utilizando setters para definir valores
		Conta conta2 = new Conta();
		conta2.setTitular("Luane");
		conta2.setNumConta(231);
		conta2.setSaldo(1250.10);
		
		// Printando atraves dos getters
		System.out.println("Titular " + conta2.getTitular());
		System.out.println("Numero da Conta " + conta2.getNumConta());
		System.out.println("Saldo " + conta2.getClass());
		
	}
	
}
