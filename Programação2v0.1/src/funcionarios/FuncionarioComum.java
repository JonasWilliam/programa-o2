package funcionarios;

public class FuncionarioComum extends FuncionarioAbstrato{

	public FuncionarioComum(String nome, String endereco, String cpf, int matricula, String usuario, String senha,
			int nivelPermissao) {
		super(nome, endereco, cpf, matricula, usuario, senha, nivelPermissao);
	
	}

	public void alterarDadosLogin(String usuario,String senha) {
		this.setSenha(senha);
		this.setUsuario(usuario);
		
	}
	public void alterarEndereco(String endereco) {
		this.setEndereco(endereco);
	}
}
