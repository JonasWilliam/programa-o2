package extras;

import funcionarios.GestorDeSetor;

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
	
	
	public void exibirDetalhesSetor() {
		System.out.println("Nome do setor: " + getNome());
		System.out.println("código do setor: " + getCodigo());
		
	}
	
	public void listarSetores() { /*aqui vai ser uma lista?*/
		
	}
	public void removerSetor(Setor s) {
		
	}
	public void alterarSetor(Setor s,int codigo,String nome,GestorDeSetor gestor) {
		this.setCodigo(codigo);
		this.setGestor(gestor);
		this.setNome(nome);
		
	}
	
	public void alterarSetor(Setor s,String nome) {
		this.setNome(nome);
		
	}
	
	public void alterarSetor(Setor s,GestorDeSetor gestor) {
		this.setGestor(gestor);
		
	}
	public void alterarSetor(Setor s,int codigo) {
		this.setCodigo(codigo);
		
	}
	
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
