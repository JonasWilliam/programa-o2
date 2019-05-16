package dados;

import extras.Setor;
import negocio.Bens;

public interface RepositorioBens {

	public void adicionar(Bens bem);
	public void alterar(Bens bem,int codigo,String nome);
	public void excluir(int codigo);
	public void movimentarBem(Bens bem,Setor setor);
	public Bens[] listar();
	public Bens procurar(int codigo);
}
