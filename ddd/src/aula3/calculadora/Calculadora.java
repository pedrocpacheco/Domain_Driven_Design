package aula3.calculadora;

public class Calculadora {
	
	private double number1;
	private double number2;
	public double result;
	
	// Getters e Setters
	public double getNumber1(){
		return this.number1;
	}
	
	public void setNumber1(double number1){
		this.number1 = number1;
	}
	
	public double getNumber2(){
		return this.number2;
	}
	
	public void setNumber2(double number2){
		this.number2 = number2;
	}
	
	public double getResult(){
		return this.result;
	}
	
	
	// Metodos Gerais
	public double add(double number1, double number2){
		return this.result = number1 + number2;
	}
	
	public double sub(double number1, double number2){
		return this.result = number1 - number2;
	}
	
	public double mult(double number1, double number2){
		return this.result = number1 * number2;
	}
	
	public double div(double number1, double number2){
		return this.result = number1 / number2;
	}

}
