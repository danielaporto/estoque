package estoque;

public class usaEstoque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estoque estoque1 = new Estoque("Impressora Jato de Tinta", 13, 6);
		Estoque estoque2 = new Estoque("Monitor LCD 17 Polegadas", 11, 13);
		Estoque estoque3 = new Estoque("Mouse �ptico", 6, 2);
		
		estoque1.darBaixa(5);
		estoque2.repor(7);
		estoque3.darBaixa(4);

		System.out.println(estoque1.mostra());
		
		if(estoque1.precisaRepor() == true) {
			System.out.println("Aten��o, estoque 1 precisa de reposi��o!");
		}else {
			System.out.println("Estoque 1 est� na quantidade m�nima requerida");
		}
		
		System.out.println(estoque2.mostra());
		
		if(estoque2.precisaRepor() == true) {
			System.out.println("Aten��o, estoque 2 precisa de reposi��o!");
		}else {
			System.out.println("Estoque 2 est� na quantidade m�nima requerida");
		}
		
		System.out.println(estoque3.mostra());
		
		if(estoque3.precisaRepor() == true) {
			System.out.println("Aten��o, estoque 3 precisa de reposi��o!");
		}else {
			System.out.println("Estoque 3 est� na quantidade m�nima requerida");
		}
	}

}
