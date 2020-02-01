package estoque;

public class usaEstoque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estoque estoque1 = new Estoque("Impressora Jato de Tinta", 13, 6);
		Estoque estoque2 = new Estoque("Monitor LCD 17 Polegadas", 11, 13);
		Estoque estoque3 = new Estoque("Mouse Óptico", 6, 2);
		
		estoque1.darBaixa(5);
		estoque2.repor(7);
		estoque3.darBaixa(4);

		System.out.println(estoque1.mostra());
		
		if(estoque1.precisaRepor() == true) {
			System.out.println("Atenção, estoque 1 precisa de reposição!");
		}else {
			System.out.println("Estoque 1 está na quantidade mínima requerida");
		}
		
		System.out.println(estoque2.mostra());
		
		if(estoque2.precisaRepor() == true) {
			System.out.println("Atenção, estoque 2 precisa de reposição!");
		}else {
			System.out.println("Estoque 2 está na quantidade mínima requerida");
		}
		
		System.out.println(estoque3.mostra());
		
		if(estoque3.precisaRepor() == true) {
			System.out.println("Atenção, estoque 3 precisa de reposição!");
		}else {
			System.out.println("Estoque 3 está na quantidade mínima requerida");
		}
	}

}
