public class TesteConta {
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
