package funcionarios;

import extras.Setor;

public class GestorDeSetor extends Funcionarios {

	public GestorDeSetor(int matricula, String usuario, String senha, int nivelPermissao, String nome, String endereco,
			int cpf) {
		super(matricula, usuario, senha, nivelPermissao, nome, endereco, cpf);
		
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
