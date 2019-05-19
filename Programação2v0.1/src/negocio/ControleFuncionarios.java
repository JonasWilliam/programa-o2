package negocio;

import dados.RepositorioFuncionario;
import dados.RepositoriosFuncionariosArray;

public class ControleFuncionarios {
	RepositorioFuncionario funcionarios = new RepositoriosFuncionariosArray();

	public void adicionar(FuncionarioAbstrato funcionario) {
		funcionarios.adicionar(funcionario);
	}

	public FuncionarioAbstrato[] listar() {
		return funcionarios.listar();
	}

	public void alterarCompleto(FuncionarioAbstrato a, String endereco, String senha) {
		funcionarios.alterarCompleto(a, endereco, senha);
	}

	public void alterarSenha(String senha, FuncionarioAbstrato a) {
		funcionarios.alterarSenha(senha, a);
	}

	public void alterar(String endereco, FuncionarioAbstrato a) {
		funcionarios.alterar(endereco, a);
	}
	public void remover(String cpf) {
		funcionarios.remover(cpf);
	}
}
