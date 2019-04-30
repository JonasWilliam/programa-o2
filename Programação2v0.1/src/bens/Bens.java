package bens;

import java.util.ArrayList;

import extras.Setor;

public class Bens {

	private int codigo;
	private String nome;
	private Setor setorLocacao;
	ArrayList<Bens>lista = new ArrayList<Bens>();

	
	// metodos

	public Bens(int codigo, String nome, Setor setorLocacao) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.setorLocacao = setorLocacao;
		
	}

	public void cadastrarNovo(Bens bem) {
		lista.add(bem);
	}

	public void movimentarBem(Setor novoSetor) {
		this.setorLocacao = novoSetor;
	}

	public void descartarBem(Setor setor) {
		lista.remove(setor);
	}

	public void atualizarBem() {

	}
	
	
	
	// gets e sets
		public int getCodigo() {
			return codigo;
		}

		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public Setor getSetorLocacao() {
			return setorLocacao;
		}

		public void setSetorLocacao(Setor setorLocacao) {
			this.setorLocacao = setorLocacao;
		}


}
