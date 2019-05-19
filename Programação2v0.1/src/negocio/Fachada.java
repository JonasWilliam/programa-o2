package negocio;

import extras.Setor;

public class Fachada {

	
	private ControleBens bens;
	private static Fachada instance;
	private ControleSetor setores;
	private ControleFuncionarios funcionarios;
	
	public Fachada() {
		bens = new ControleBens();
		setores = new ControleSetor();
		funcionarios = new ControleFuncionarios();
	}
	
	
	public static Fachada getInstance(){
		if (Fachada.instance == null){
			Fachada.instance = new Fachada();
		}
		return Fachada.instance;
	}
	
	//Bens
	public void cadastrarBens(Bens bem) {
		bens.cadastrar(bem);
	}
	
	public void removerBens(int numero) {
		bens.remover(numero);
	}
	
	public Bens procurarBens(int numero) {
		return bens.procurar(numero);
	}
	public void listarBens() {
		bens.listar();
	}
	//Bens
	
	//Funcionarios
	

	public void adicionarFuncionarios(FuncionarioAbstrato funcionario) {
		funcionarios.adicionar(funcionario);
	}

	public FuncionarioAbstrato[] listarFuncionarios() {
		return funcionarios.listar();
	}

	public void alterarFuncionarioCompleto(FuncionarioAbstrato a, String endereco, String senha) {
		funcionarios.alterarCompleto(a, endereco, senha);
	}

	public void alterarFuncionarioSenha(String senha, FuncionarioAbstrato a) {
		funcionarios.alterarSenha(senha, a);
	}

	public void alterarEnderecoFuncionario(String endereco, FuncionarioAbstrato a) {
		funcionarios.alterar(endereco, a);
	}
	public void removerFuncionario(String cpf) {
		funcionarios.remover(cpf);
	}
	//Funcionarios
	
	
	//Setores
	
	public void adicionarSetor(Setor setor) {
		setores.adicionar(setor);
	}
	public Setor[] listarSetor() {
		return setores.listar();
	}
	public void excluirSetor(int codigo) {
		setores.excluir(codigo);
	}
	public void alterarSetorCompleto(Setor s,int codigo,String nome,GestorDeSetor gestor) {
		setores.alterarCompletoSetor(s, codigo, nome, gestor);
	}
	public void alterarCodigoSetor(Setor s,int codigo) {
		setores.alterarCodigoSetor(s, codigo);
	}
	public void alterarGestorSetor(Setor s,GestorDeSetor gestor) {
		setores.alterarGestorSetor(s, gestor);
	}
	
	//Setores
}




