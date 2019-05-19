package negocio;

import dados.RepositorioSetor;
import dados.RepositorioSetorArray;
import extras.Setor;

public class ControleSetor {

	RepositorioSetor setores = new RepositorioSetorArray();
	
	public void adicionar(Setor setor) {
		setores.adicionar(setor);
	}
	public Setor[] listar() {
		return setores.listar();
	}
	public void excluir(int codigo) {
		setores.excluir(codigo);
	}
	public void alterarCompletoSetor(Setor s,int codigo,String nome,GestorDeSetor gestor) {
		setores.alterarCompletoSetor(s, codigo, nome, gestor);
	}
	public void alterarCodigoSetor(Setor s,int codigo) {
		setores.alterarCodigoSetor(s, codigo);
	}
	public void alterarGestorSetor(Setor s,GestorDeSetor gestor) {
		setores.alterarGestorSetor(s, gestor);
	}
}
