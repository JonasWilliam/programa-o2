package bens;

import extras.Data;
import extras.Setor;

public class BensDePatrimonio extends Bens implements RepositorioBens {

	private int numeroIdentidade;
	private String estadoConservacao;
	private Data dataAquisicao;
	private Bens[] bensDePatrimonio;
	private int indice;
	private final static int TAMANHO = 100;

	// CONSTRUTOR
	public BensDePatrimonio(int codigo, String nome, Setor setorLocacao, String estadoConservacao, Data dataAquisicao) {
		super(codigo, nome, setorLocacao);
		this.estadoConservacao = estadoConservacao;
		this.dataAquisicao = dataAquisicao;
	}
	// CONSTRUTOR

	// MÉTODOS

	public void atualizarEstadoConservacao(String novoEstadoConservacao) {
		this.estadoConservacao = novoEstadoConservacao;
	}

	@Override
	public void adicionar(Bens bem) {
		for (int i = 0; i <= bensDePatrimonio.length; i++) {
			if (bensDePatrimonio[i].getCodigo() == bem.getCodigo()) {
				System.out.println(bem.getNome() + " já foi cadastrado em nosso sistema.");
			}else {
				this.bensDePatrimonio[indice] = bem;
				this.indice = this.indice + 1;
				System.out.println(bem.getNome() + " foi cadastrado em nosso sistema.");
			}
			

		}
	}

	@Override
	public void alterar(Bens bem) {
		this.setSetorLocacao(bem.getSetorLocacao());
		this.numeroIdentidade = ((BensDePatrimonio) bem).getNumeroIdentidade();

	}

	@Override
	public void excluir(int codigo) {
		for (int i = 0; i <= bensDePatrimonio.length; i++) {
			if (bensDePatrimonio[i].getCodigo() == codigo) {
				bensDePatrimonio[i] = null;
			}
		}

	}

	@Override
	public void movimentarBem(Bens bem, Setor setor) {
		this.setSetorLocacao(setor);

	}

	public void RepositorioBensDeConsumoArray() {
		this.bensDePatrimonio = new Bens[TAMANHO];
		this.indice = 0;
	}

	@Override
	public void listar() {
		for (int i = 0; i <= bensDePatrimonio.length; i++) {
			System.out.println(bensDePatrimonio[i].getNome());
			System.out.println(bensDePatrimonio[i].getCodigo());
		}

	}

	// MÉTODOS

	// gets e sets

	public int getNumeroIdentidade() {
		return numeroIdentidade;
	}

	public void setNumeroIdentidade(int numeroIdentidade) {
		this.numeroIdentidade = numeroIdentidade;
	}

	public String getEstadoConservacao() {
		return estadoConservacao;
	}

	public void setEstadoConservacao(String estadoConservacao) {
		this.estadoConservacao = estadoConservacao;
	}

	public Data getDataAquisicao() {
		return dataAquisicao;
	}

	public void setDataAquisicao(Data dataAquisicao) {
		this.dataAquisicao = dataAquisicao;
	}

	// Fim dos gets e sets

}
