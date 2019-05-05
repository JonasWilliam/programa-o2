package bens;

import extras.Setor;

public interface RepositorioBens {

	public void adicionar(Bens bem);
	public void alterar(Bens bem);
	public void excluir(int codigo);
	public void movimentarBem(Bens bem,Setor setor);
	public void listar();
	
}
