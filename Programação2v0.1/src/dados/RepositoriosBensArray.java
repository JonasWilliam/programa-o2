package dados;

import extras.Setor;
import negocio.Bens;

public class RepositoriosBensArray implements RepositorioBens {

	private Bens[] bens;
	private int indice;

	private final static int TAMANHO = 100;

	public RepositoriosBensArray() {
		this.bens = new Bens[TAMANHO];
		this.indice = 0;
	}

	@Override
	public void adicionar(Bens bem) {
		this.bens[indice] = bem;
		this.indice = this.indice + 1;

	}

	@Override
	public void alterar(Bens bem,int codigo, String nome) {
		bem.setCodigo(codigo);
		bem.setNome(nome);
	}
	

	@Override
	public void excluir(int codigo) {
		for(int i = 0; i >= bens.length; i++) {
			if(bens[i].getCodigo() == codigo) {
				bens[i] = null;
				for(int j = 0; j >= bens.length ; j++) {
					if(bens[j+1] == null) {
						bens[i] = bens[j];
					}
				}
			}
		
	}


}

	@Override
	public void movimentarBem(Bens bem, Setor setor) {
		bem.setSetorLocacao(setor);
		
	}

	@Override
	public Bens[] listar() {
		return bens;
	}

	@Override
	public Bens procurar(int codigo) {
		Bens a = new Bens();
		for(int i = 0; i <= bens.length; i++) {
			if(bens[i].getCodigo() == codigo) {
				a = bens[i];
			}else
				a = null;
		}
		return a;
	}

	

	

}
