package bens;



import extras.Data;
import extras.Setor;

public class BensDePatrimonio extends Bens {


	private int numeroIdentidade;
	private String estadoConservacao;
	private Data dataAquisicao;

	
	//CONSTRUTOR
	public BensDePatrimonio(int codigo, String nome, Setor setorLocacao,String estadoConservacao,Data dataAquisicao) {
		super(codigo, nome, setorLocacao);
		this.estadoConservacao = estadoConservacao;
		this.dataAquisicao = dataAquisicao;
	}
	//CONSTRUTOR
	
	
	// MÉTODOS

	public void atualizarEstadoConservacao(String novoEstadoConservacao) {
		this.estadoConservacao = novoEstadoConservacao;
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

	
	//Fim dos gets e sets
	
	

}
