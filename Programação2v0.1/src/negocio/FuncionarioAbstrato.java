package negocio;

public abstract class FuncionarioAbstrato {

	private String nome;
	private String endereco;
	private String cpf;
	private String usuario;
	private String senha;


	public FuncionarioAbstrato(String nome, String endereco, String cpf,String usuario, String senha) {
		this.nome = nome;
		this.endereco = endereco;
		this.cpf = cpf;
		this.usuario = usuario;
		this.senha = senha;
		
	}
	
	public FuncionarioAbstrato(String nome,String endereco,String cpf,int matricula) {
		this.nome = nome;
		this.endereco = endereco;
		this.cpf = cpf;
		
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	
	

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
