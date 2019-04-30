package extras;

public class Hora {

	private int hora;
	private int minuto;
	private int segundo;
	
	
	// construtor
	
	Hora(int hora,int minuto,int segundo){
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
		
	}
	// fim dos construtores
	
	//gets e sets
	
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}
	public int getMinuto() {
		return minuto;
	}
	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}
	public int getSegundo() {
		return segundo;
	}
	public void setSegundo(int segundo) {
		this.segundo = segundo;
	} 
	
	//fim dos gets e sets
	
	
}
