package bens;

import java.util.Date;

import extras.Setor;

public class BensDeConsumo extends Bens {

	private int quantidade;
	private Date dataVailidade;

//construtor
	public BensDeConsumo(int codigo, String nome, Setor setorLocacao) {
		super(codigo, nome, setorLocacao);

	}
//construtor

	// metodos

	public void reabastecer(int quantidade) {
		System.out.println("antes:"+getQuantidade());
		this.quantidade = this.quantidade + quantidade;
		System.out.println("atual:"+getQuantidade());
	}

	public void solicitarBemDeConsumo(int quantidade) {
		System.out.println("quantidade atual" + getQuantidade());
		this.quantidade = this.quantidade - quantidade;
		System.out.println("Depois de retirar:" + getQuantidade());
	}
	// Fim dos metodos

	// gets e sets
	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Date getDataVailidade() {
		return dataVailidade;
	}

	public void setDataVailidade(Date dataVailidade) {
		this.dataVailidade = dataVailidade;
	}
	// Fim dos gets e sets
}
