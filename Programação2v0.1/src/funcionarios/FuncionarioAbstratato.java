package funcionarios;

public abstract class FuncionarioAbstratato {

	private String nome;
	private String endereco;
	private int cpf;

	public FuncionarioAbstratato(String nome, String endereco, int cpf) {
		this.nome = nome;
		this.endereco = endereco;
		this.cpf = cpf;
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

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

}
