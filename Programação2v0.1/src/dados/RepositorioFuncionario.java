package dados;

import negocio.FuncionarioAbstrato;

public interface RepositorioFuncionario {

	public void adicionar(FuncionarioAbstrato a);

	public void remover(String cpf);

	public void alterar(FuncionarioAbstrato a,String endereco, String senha);

	public void alterarSenha(String senha,FuncionarioAbstrato a);

	public void alterar(String endereco,FuncionarioAbstrato a);

	public FuncionarioAbstrato[] listar();
}
