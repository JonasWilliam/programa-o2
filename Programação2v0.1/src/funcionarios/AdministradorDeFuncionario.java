package funcionarios;

import bens.Bens;
import bens.BensDeConsumo;

public class AdministradorDeFuncionario extends FuncionarioAbstrato implements RepositorioFuncionario {

	private FuncionarioAbstrato[] funcionarios;
	private int indice;
	private final static int TAMANHO = 100;

	public AdministradorDeFuncionario(String nome, String endereco, String cpf, int matricula, String usuario,
			String senha, int nivelPermissao) {
		super(nome, endereco, cpf, matricula, usuario, senha, nivelPermissao);
	
	}

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
	public void remover(int matricula) {
		for (int i = 0; i <= funcionarios.length; i++) {
			if (funcionarios[i].getMatricula() == matricula) {
				funcionarios[i] = null;
			}
		}
	}

	@Override
	public void alterar(FuncionarioAbstrato funcionario) {
		for (int i = 0; i <= funcionarios.length; i++) {
			if (funcionarios[i].getMatricula() == funcionario.getMatricula()) {
				funcionarios[i] = funcionario;
			}
		}

	}

	@Override
	public void listar() {
		for (int i = 0; i <= funcionarios.length; i++) {
			System.out.println(funcionarios[i].getNome());
			System.out.println(funcionarios[i].getCpf());
			System.out.println(funcionarios[i].getEndereco());
		}

	}



}
