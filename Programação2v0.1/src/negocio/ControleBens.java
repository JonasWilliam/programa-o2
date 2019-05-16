package negocio;

import dados.RepositorioBens;
import dados.RepositoriosBensArray;
import extras.Setor;

public class ControleBens {
	RepositorioBens bens = new RepositoriosBensArray();
	
	public void cadastrar(Bens bem) {
		if(bem.getNome() == null || bem.getSetorLocacao() == null) {
			
		}else
		bens.adicionar(bem);
	}
	public void remover(int codigo) {
		bens.excluir(codigo);
	}
	public Bens[] listar() {
		return bens.listar();
	}
	public void alterar(Bens bem,int codigo,String nome) {
		bens.alterar(bem, codigo, nome);
	}
	public void movimentarBem(Bens bem,Setor setor) {
		if(setor != null) {
			bens.movimentarBem(bem, setor);
		}
		
	}
	public Bens procurar(int codigo) {
		if(codigo < 0) {
			return null;
		}
		return bens.procurar(codigo);
	}
}
