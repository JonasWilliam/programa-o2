package bens;

import extras.Setor;
import funcionarios.GestorDeSetor;

public class TesteBens {

	public static void main(String[] args) {
		GestorDeSetor gs1 = new GestorDeSetor(123,"jonas00","123",0,"Jonas","rua teste",15555);
		Setor a1 = new Setor(123,"transporte",gs1);
		BensDeConsumo papel = new BensDeConsumo(22,"papel",a1);
		papel.reabastecer(10);
		papel.solicitarBemDeConsumo(5);
	}

}
