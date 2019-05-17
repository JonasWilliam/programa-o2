package negocio;

import extras.Setor;

public class GestorDeSetor extends FuncionarioAbstrato {
		
	public GestorDeSetor(String nome, String endereco, String cpf, String usuario, String senha) {
		super(nome, endereco, cpf, usuario, senha);
		
	}

	private Setor setorDeLotacao;
	

	



	//gets e sets
	
	public Setor getSetorDeLotacao() {
		return setorDeLotacao;
	}

	public void setSetorDeLotacao(Setor setorDeLotacao) {
		this.setorDeLotacao = setorDeLotacao;
	}
	
	// Metodos

	public void alterarFuncionario() {

	}

	public void listarFuncionario() {

	}
	
}
