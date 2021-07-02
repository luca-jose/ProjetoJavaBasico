package projetoJavaBasico;

public class RepositorioPessoaArray {
	
	private Pessoa[] pessoa;
	private int indice;
	
	public RepositorioPessoaArray (int tamanho) {
		indice = 0;
		pessoa = new Pessoa[tamanho];
	}
	
	public void inserir(Pessoa a) {
		pessoa[indice] = a;
		indice = indice + 1;
	}
	
	public Pessoa procurar(String cpf) {
		Pessoa procurado = null;
		for(int i = 0; i < indice; i++) {
			Pessoa aux = this.pessoa[i];
			if(aux.getCpf().equals(cpf))
				procurado = aux;
		}
		return procurado;
	}
	
	public void remover (String cpf) {
		for(int i=0; i < indice; i++) {
			Pessoa aux = this.pessoa[i];
			if(aux.getCpf().equals(cpf)) {
				
				this.pessoa[i] = this.pessoa[indice - 1];
				this.pessoa[indice -1] = null;
				
				indice = indice - 1;
			}

		}
	}
}
