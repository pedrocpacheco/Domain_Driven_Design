package aula4.calculadora;

import java.util.Scanner;

public class TesteCalculadora {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Criando objeto
		Calculadora calculadora = new Calculadora();
		
		// Definindo Atributos com Set
		System.out.println("Digite n1");
		calculadora.setNumber1(sc.nextInt());
		
		System.out.println("Digite n2");
		calculadora.setNumber2(sc.nextInt());
		
		// Mostrando valores dos atributos com Get
		System.out.println("Mostrando Valores com os Getters");
		System.out.println(calculadora.getNumber1());
		System.out.println(calculadora.getNumber2());
		sc.close();
		
		
		// Fazendo as opera��es matematicas
		System.out.println("Opera��es Matematicas");
		System.out.println("Soma");
		System.out.println(calculadora.add(calculadora.getNumber1(), calculadora.getNumber2()));
		
		System.out.println("Subtra��o");
		System.out.println(calculadora.sub(calculadora.getNumber1(), calculadora.getNumber2()));
		
		System.out.println("Multiplica��o");
		System.out.println(calculadora.mult(calculadora.getNumber1(), calculadora.getNumber2()));
		
		System.out.println("Divis�o");
		System.out.println(calculadora.div(calculadora.getNumber1(), calculadora.getNumber2()));
		
	}
}
