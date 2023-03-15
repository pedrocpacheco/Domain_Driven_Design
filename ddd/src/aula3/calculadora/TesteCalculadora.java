package aula3.calculadora;

public class TesteCalculadora {

	public static void main(String[] args) {
		
		Calculadora calculadora = new Calculadora();
		
		calculadora.setNumber1(10);
		calculadora.setNumber2(2);
		
		System.out.println("Pegando Valores com os Getters");
		calculadora.getNumber1();
		calculadora.getNumber2();
		
		System.out.println("Soma");
		System.out.println(calculadora.add(10, 5));
		
		System.out.println("Subtração");
		System.out.println(calculadora.sub(2, 1));
		
		System.out.println("Multiplicação");
		System.out.println(calculadora.mult(5, 2));
		
		System.out.println("Divisão");
		System.out.println(calculadora.div(10, 2));
		
	}
}
