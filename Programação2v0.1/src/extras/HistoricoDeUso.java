package extras;

import negocio.Bens;
import negocio.FuncionarioAbstrato;


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
