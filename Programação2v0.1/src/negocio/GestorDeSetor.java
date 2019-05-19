package negocio;

import extras.Setor;

public class GestorDeSetor extends FuncionarioAbstrato {
	private Setor setorDeLotacao;

	public GestorDeSetor(String nome, String endereco, String cpf, String usuario, String senha) {
		super(nome, endereco, cpf, usuario, senha);

	}

	// gets e sets

	public Setor getSetorDeLotacao() {
		return setorDeLotacao;
	}

	public void setSetorDeLotacao(Setor setorDeLotacao) {
		this.setorDeLotacao = setorDeLotacao;
	}

}
