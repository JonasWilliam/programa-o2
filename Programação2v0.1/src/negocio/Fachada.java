package negocio;

public class Fachada {

	
	private ControleBens bens;
	private static Fachada instance;
	
	public Fachada() {
		bens = new ControleBens();
	}
	
	public static Fachada getInstance(){
		if (Fachada.instance == null){
			Fachada.instance = new Fachada();
		}
		return Fachada.instance;
	}
	
	public void cadastrar(Bens bem) {
		bens.cadastrar(bem);
	}
	
	public void remover(int numero) {
		bens.remover(numero);
	}
	
	public Bens procurar(int numero) {
		return bens.procurar(numero);
	}
	public void listar() {
		bens.listar();
	}
}




