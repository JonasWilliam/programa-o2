package extras;

import negocio.GestorDeSetor;

public class Setor {

	private int codigo;
	private String nome;
	private GestorDeSetor gestor;
	
	
	// Construtores
	
	public Setor(int codigo,String nome,GestorDeSetor gestor){
		this.codigo = codigo;
		this.nome = nome;
		this.gestor = gestor;
	}
	// fim dos construtores
	
	
	
	//Metodos
	
	
	
	
	// fim dos Metodos
	
	
	
	//gets e sets
	
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
	public GestorDeSetor getGestor() {
		return gestor;
	}
	public void setGestor(GestorDeSetor gestor) {
		this.gestor = gestor;
	}
	
	// fim dos gets e sets
	
}
