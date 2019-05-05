package funcionarios;

import extras.Setor;

public class GestorDeSetor extends FuncionarioAbstrato {
		
	private Setor setorDeLotacao;
	

	

	public GestorDeSetor(String nome, String endereco, String cpf, int matricula, String usuario, String senha,
			int nivelPermissao) {
		super(nome, endereco, cpf, matricula, usuario, senha, nivelPermissao);
		
	}



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
