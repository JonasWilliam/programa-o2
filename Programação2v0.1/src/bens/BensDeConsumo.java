package bens;

import java.util.Date;

import extras.Data;
import extras.Setor;

public class BensDeConsumo extends Bens implements RepositorioBens {

	private int quantidade;
	private Data dataValidade;
	private Bens[] bensDeConsumo;
	private int indice;
	private final static int TAMANHO = 100;

//construtor
	public BensDeConsumo(int codigo, String nome, Setor setorLocacao,int quantidade,Data dataValidade) {
		super(codigo, nome, setorLocacao);
		this.quantidade = quantidade;
		this.dataValidade = dataValidade;

	}
//construtor

	// metodos

	public void reabastecer(int quantidade) {
		System.out.println("antes:" + getQuantidade());
		this.quantidade = this.quantidade + quantidade;
		System.out.println("atual:" + getQuantidade());
	}

	public void solicitarBemDeConsumo(int quantidade) {
		System.out.println("quantidade atual" + getQuantidade());
		this.quantidade = this.quantidade - quantidade;
		System.out.println("Depois de retirar:" + getQuantidade());
	}
	

	@Override
	public void adicionar(Bens bem) {
		this.bensDeConsumo[indice] = bem;
		this.indice = this.indice + 1;

	}

	@Override
	public void alterar(Bens bem) {
		this.dataValidade = ((BensDeConsumo) bem).getDataValidade();

	}

	@Override
	public void excluir(int codigo) {
		for (int i = 0; i <= bensDeConsumo.length; i++) {
			if (bensDeConsumo[i].getCodigo() == codigo) {
				bensDeConsumo[i] = null;
			}
		}
	}

	@Override
	public void movimentarBem(Bens bem,Setor setor) {
		this.setSetorLocacao(setor);

	}

	public void RepositorioBensDeConsumoArray() {
		this.bensDeConsumo = new Bens[TAMANHO];
		this.indice = 0;
	}
	// Fim dos metodos
	

	// gets e sets
	public int getQuantidade() {
		return quantidade;
	}


	public Data getDataValidade() {
		return dataValidade;
	}

	@Override
	public void listar() {
		// TODO Auto-generated method stub
		
	}

	// gets e sets
}

