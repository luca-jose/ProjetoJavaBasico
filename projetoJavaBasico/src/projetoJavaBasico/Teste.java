package projetoJavaBasico;

public class Teste {

	public static void main(String[] args) {
		
		// C
		RepositorioPessoaArray repPessoa = new RepositorioPessoaArray(4);
		Curso curso1 = new Curso("Analise e desenvolvimento de sistemas ","abc-123" );
		Curso curso2 = new Curso("Estética e Cosmética ", "xyz-789");
		Aluno aluno1 = new Aluno("Cecilia Coutinho ", "800.444.555-88",19, curso1);
		Aluno aluno2 = new Aluno("Lucas José da Silva", "900.555.444-99", 22, curso2);
		Professor prof1 = new Professor("Arlindo Gomes", "700.111.222-33", 55, 3500);
		Professor prof2 = new Professor("José Alexandre", "700.222.333-44", 65, 4500);
		
		// Inserir Contas
		repPessoa.inserir(aluno1);
		repPessoa.inserir(aluno2);
		repPessoa.inserir(prof1);
		repPessoa.inserir(prof2);
	
		// Procurar Pessoa
		Pessoa procurada = repPessoa.procurar("700.111.222-33");
		if (procurada == null){
			System.out.println("Usuário não existe!");
		}
		else {	
			System.out.println(prof1.toString());
		}
		
		procurada = repPessoa.procurar("700.444.333-70");
		if (procurada == null) {
			System.out.println("Usuário não existe!");
		}
		else {
			System.out.println(aluno1.toString());	
		}
		
		//Remover
		Pessoa removida = repPessoa.procurar("700.222.333-44");
		if(removida == null) {
			System.out.println("Usuário não encontrado!");
		}
		
		else {
			repPessoa.remover("700.444.333-77");
			System.out.println("Usuário removido!");
			
		
		}
	}
}