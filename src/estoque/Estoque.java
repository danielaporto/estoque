package estoque;

public class Estoque {
	String nome;
	int qtdAtual;
	int qtdMinima;
	
	Estoque(String n, int qa, int qm){
		this.nome = n;
		this.qtdAtual = qa;
		this.qtdMinima = qm;
	}
	
	void setNome(String nome) {
		this.nome = nome;
	}
	
	void setQtdMinima(int qtdMinima) {
		this.qtdMinima = qtdMinima;
	}
	
	void repor(int qtd) {
		this.qtdAtual += qtd; // Incrementa o valor a variavel qtd
	}
	
	void darBaixa(int qtd) {
		this.qtdAtual -= qtd;
	}
	
	String mostra() {
		return "Nome: " + nome + " Quantidade Mínima: " + qtdMinima + " Quantidade Atual: " + qtdAtual;
	}
	
	boolean precisaRepor() {
		if(this.qtdAtual <= qtdMinima) {
			return true;
		}else {
			return false;
		}
	}

}