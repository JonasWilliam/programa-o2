package dados;


import negocio.FuncionarioAbstrato;

public class RepositoriosFuncionariosArray implements RepositorioFuncionario {

	private FuncionarioAbstrato[] funcionarios;
	private int indice;
	private final static int TAMANHO = 100;
	

	@Override
	public void adicionar(FuncionarioAbstrato funcionario) {
		this.funcionarios[indice] = funcionario;
		this.indice = this.indice + 1;

	}

	public void RepositorioFuncionariosArray() {
		this.funcionarios = new FuncionarioAbstrato[TAMANHO];
		this.indice = 0;
	}

	@Override
	public void remover(String cpf) {
		for (int i = 0; i <= funcionarios.length; i++) {
			if (funcionarios[i].getCpf().equals(cpf)) {
				funcionarios[i] = null;

				for(int j =0; j<= funcionarios.length ; j++) {

					if(funcionarios[j] != null && funcionarios[j+1] == null) {
						funcionarios[i] = funcionarios[j];
					}
				}
			}
		}
	}

	


	@Override
	public FuncionarioAbstrato[] listar() {
		
		return funcionarios;
	}

	@Override
	public void alterarCompleto(FuncionarioAbstrato a,String endereco, String senha) {
		a.setEndereco(endereco);
		a.setSenha(senha);
	}

	@Override
	public void alterarSenha(String senha,FuncionarioAbstrato a) {
		a.setSenha(senha);
		
	}

	@Override
	public void alterar(String endereco,FuncionarioAbstrato a) {
		a.setEndereco(endereco);
		
	}



	

	
}
