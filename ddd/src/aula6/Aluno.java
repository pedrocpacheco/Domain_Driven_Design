package aula6;

public class Aluno {

	private int matricula;
	private String nome;
	private String curso;
	private String modalidade;
	private boolean status = true;
	private float mediaGeral;

	// Construtor Default
	public Aluno(){
		
	}
	
	// Construtor Especifico
	public Aluno(int matricula, String nome, String curso, String modalidade) {
		this.matricula = matricula;
		this.nome = nome;
		this.curso = curso;
		this.modalidade = modalidade;
	}

	// Metodos Operacionais
	public float calcMedia(float nota1, float nota2, float nota3) {
		float media = (nota1 + nota2 + nota3) / 3;
		return this.mediaGeral = media;
	}

	// Getters e Setters
	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getModalidade() {
		return modalidade;
	}

	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public float getMediaGeral() {
		return mediaGeral;
	}

	public void setMediaGeral(float mediaGeral) {
		this.mediaGeral = mediaGeral;
	}

}
