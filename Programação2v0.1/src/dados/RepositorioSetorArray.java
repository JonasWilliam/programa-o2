package dados;

import extras.Setor;
import negocio.GestorDeSetor;

public class RepositorioSetorArray implements RepositorioSetor {

	private Setor[] setor;
	private int indice;
	private final static int TAMANHO = 100;

	@Override
	public void adicionar(Setor setor1) {
		this.setor[indice] = setor1;
		this.indice = this.indice + 1;

	}

	public void RepositorioFuncionariosArray() {
		this.setor = new Setor[TAMANHO];
		this.indice = 0;
	}

	@Override
	public Setor[] listar() {

		return setor;
	}

	

	@Override
	public void excluir(int codigo) {

		for (int i = 0; i <= setor.length; i++) {
			if (setor[i].getCodigo() == codigo) {
				setor[i] = null;

				for (int j = 0; j <= setor.length; j++) {

					if (setor[j] != null && setor[j + 1] == null) {
						setor[i] = setor[j];
					}
				}
			}
		}
	}

	@Override
	public void alterarCompletoSetor(Setor s, int codigo, String nome, GestorDeSetor gestor) {
		s.setCodigo(codigo);
		s.setGestor(gestor);
		s.setNome(nome);
		
	}

	@Override
	public void alterarCodigoSetor(Setor s, int codigo) {
		s.setCodigo(codigo);
		
	}

	@Override
	public void alterarGestorSetor(Setor s, GestorDeSetor gestor) {
		s.setGestor(gestor);
		
	}

	

}
