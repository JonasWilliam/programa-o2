package dados;

import extras.Setor;
import negocio.GestorDeSetor;

public interface RepositorioSetor {

	public void adicionar(Setor setor);
	public Setor[] listar();
	public void excluir(int codigo);
	public void alterarSetor(Setor s,int codigo,String nome,GestorDeSetor gestor);
	public void alterarSetor(Setor s,int codigo);
	public void alterarSetor(Setor s,GestorDeSetor gestor);
	
}
