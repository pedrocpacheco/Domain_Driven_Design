package aula6;

public class TesteAluno {

	public static void main(String[] args) {
		
		// Utilizando Construtor Padrão (sem parametros)
		Aluno a1 = new Aluno();
		System.out.println("Aluno 1, atributos:");
		
		// Printando atributos de um obj. criado com const. padrao
		System.out.println("Matricula: " + a1.getMatricula());
		System.out.println("Nome: " + a1.getNome());
		System.out.println("Curso: " + a1.getCurso());
		System.out.println("Status: " + a1.isStatus());
		System.out.println("Média: " + a1.getMediaGeral());
		System.out.println("(Atributos Vazios pois construtor é vazio)");
		
		System.out.println("----------------");
		
		// Utilizando Construtor com 2 parametros
		Aluno a2 = new Aluno(90, "Pedro", "ADS", "Presencial");
		System.out.println("Aluno 2, atributos: ");
		
		// Printando atributos de um obj. criado com const. com parametros
		System.out.println("Matricula: " + a2.getMatricula());
		System.out.println("Nome: " + a2.getNome());
		System.out.println("Curso: " + a2.getCurso());
		System.out.println("Status: " + a2.isStatus());
		System.out.println("Média: " + a2.getMediaGeral());
		System.out.println("(Atributos inicializados pelo Construtor tem valor)");
		
		// Calculando media dos alunos
		a1.calcMedia(9, 9, 8);
		a2.calcMedia(10, 10, 10);
		
		// Printando media
		System.out.println(a1.getMediaGeral());
		System.out.println(a2.getMediaGeral());
		
	}
	
}
