package negocio;

public abstract class FuncionarioAbstrato {

	private String nome;
	private String endereco;
	private String cpf;
	private int matricula;
	private String usuario;
	private String senha;
	private int nivelPermissao;

	public FuncionarioAbstrato(String nome, String endereco, String cpf, int matricula, String usuario, String senha, int nivelPermissao) {
		this.nome = nome;
		this.endereco = endereco;
		this.cpf = cpf;
		this.matricula = matricula;
		this.usuario = usuario;
		this.senha = senha;
		this.nivelPermissao = nivelPermissao;
	}

	public void ImprimirDados() {
		System.out.println("Nome: " + nome + "\nEndereço: " + endereco + "\nCPF: " + cpf);
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

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
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

	public int getNivelPermissao() {
		return nivelPermissao;
	}

	public void setNivelPermissao(int nivelPermissao) {
		this.nivelPermissao = nivelPermissao;
	}
	
}
