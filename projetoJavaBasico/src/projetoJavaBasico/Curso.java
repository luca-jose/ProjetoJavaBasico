package projetoJavaBasico;

public class Curso {
	
	String codigo;
	String nome;
	
	public Curso() {
		
	}
	public Curso(String codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
