package extras;

public class Data {

	private int dia;
	private int mes;
	private int ano;
	private Hora hora;
	
	// construtores 
	
	Data(int dia,int mes,int ano,Hora hora){
		
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		this.hora = hora;
	}

	
	// fim dos construtores
	
	
	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public Hora getHora() {
		return hora;
	}

	public void setHora(Hora hora) {
		this.hora = hora;
	}
	
	
}
