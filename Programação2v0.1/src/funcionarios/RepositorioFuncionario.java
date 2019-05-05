package funcionarios;

public interface RepositorioFuncionario {

	public void adicionar(FuncionarioAbstrato a);

	public void remover(int matricula);

	public void alterar(FuncionarioAbstrato a);

	public void listar();
}
