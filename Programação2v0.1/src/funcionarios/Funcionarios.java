package funcionarios;

public class Funcionarios extends FuncionarioAbstratato{


	private int matricula;
	private String usuario;
	private String senha;
	private int nivelPermissao;
	
	//construtor
	
	public Funcionarios(int matricula,String usuario,String senha,int nivelPermissao,String nome, String endereco, int cpf) {
		super(nome, endereco, cpf);
		this.matricula = matricula;
		this.usuario = usuario;
		this.senha = senha;
		this.nivelPermissao = nivelPermissao;
	}



	// gets e sets

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
