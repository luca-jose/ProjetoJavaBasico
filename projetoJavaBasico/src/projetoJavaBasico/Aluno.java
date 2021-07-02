package projetoJavaBasico;

public class Aluno extends Pessoa {
	
	private Curso curso;

	public Aluno() {
		super();
		
	}

	public Aluno(String nome, String cpf, int idade, Curso curso) {
		super(nome, cpf, idade);
		this.curso = curso;
	}
	
	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	public String toString() {
		return super.toString() + "| Curso " + curso;
		}
}