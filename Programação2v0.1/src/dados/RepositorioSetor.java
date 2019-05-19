package dados;

import extras.Setor;
import negocio.GestorDeSetor;

public interface RepositorioSetor {

	public void adicionar(Setor setor);
	public Setor[] listar();
	public void excluir(int codigo);
	public void alterarCompletoSetor(Setor s,int codigo,String nome,GestorDeSetor gestor);
	public void alterarCodigoSetor(Setor s,int codigo);
	public void alterarGestorSetor(Setor s,GestorDeSetor gestor);
	
}
