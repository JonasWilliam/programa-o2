package extras;

import bens.Bens;
import funcionarios.FuncionarioAbstrato;


public class HistoricoDeUso {

	private Bens bem;
	private FuncionarioAbstrato funcionario;
	private Data dataDoOcorrido;
	private Setor setorSolicitante;

	// Construtor
	HistoricoDeUso(Bens bem, FuncionarioAbstrato funcionario, Data dataDoOcorrido, Setor setorSolicitante) {
		this.bem = bem;
		this.dataDoOcorrido = dataDoOcorrido;
		this.funcionario = funcionario;
		this.setorSolicitante = setorSolicitante;
	}
	// Fim do Construtor



	// Metodos

	public void exibirHistorico(HistoricoDeUso h) {
		System.out.println("************************************");
		System.out.println("Historico de Uso:");
		System.out.println("Nome do bem:");
		System.out.println(h.getBem().getNome());
		System.out.println("Nome do funcionário que movimentou e cpf:");
		System.out.println(h.getFuncionario().getNome());
		System.out.println(h.getFuncionario().getCpf());
		System.out.println("no dia:" + h.getDataDoOcorrido().getDia());
		System.out.println("no mes:" + h.getDataDoOcorrido().getMes());
		System.out.println("no ano:" + h.getDataDoOcorrido().getAno());
		System.out.println("no dia:" + h.getSetorSolicitante().getNome());
		System.out.println("************************************");

	}
	
	// gets e sets

	public Bens getBem() {
		return bem;
	}

	public void setBem(Bens bem) {
		this.bem = bem;
	}

	public FuncionarioAbstrato getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(FuncionarioAbstrato funcionario) {
		this.funcionario = funcionario;
	}

	public Data getDataDoOcorrido() {
		return dataDoOcorrido;
	}

	public void setDataDoOcorrido(Data dataDoOcorrido) {
		this.dataDoOcorrido = dataDoOcorrido;
	}

	public Setor getSetorSolicitante() {
		return setorSolicitante;
	}

	public void setSetorSolicitante(Setor setorSolicitante) {
		this.setorSolicitante = setorSolicitante;
	}

	// Fim dos gets e sets
	
	

}
