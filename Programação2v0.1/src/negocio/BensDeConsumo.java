package negocio;

import extras.Data;
import extras.Setor;

public class BensDeConsumo extends Bens{

	private int quantidade;
	private Data dataValidade;

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
	
	public void alterar(BensDeConsumo bem) {
		this.dataValidade = bem.getDataValidade();

	}
	


	// Fim dos metodos
	

	// gets e sets
	public int getQuantidade() {
		return quantidade;
	}


	public Data getDataValidade() {
		return dataValidade;
	}


	
		
	}

	// gets e sets

