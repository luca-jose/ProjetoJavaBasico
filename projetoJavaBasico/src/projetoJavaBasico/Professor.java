package projetoJavaBasico;

public class Professor extends Pessoa {

	private double salario;
	
	public Professor() {
		super();
	}

	public Professor(String nome, String cpf, int idade, double salario) {
		super(nome, cpf, idade);
		this.salario = salario;
		
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String toString() {
		return super.toString() + "| Sal�rio: " + salario;
		}
			
}