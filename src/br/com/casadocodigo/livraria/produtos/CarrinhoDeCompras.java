package br.com.casadocodigo.livraria.produtos;

public class CarrinhoDeCompras {
	
	private double total;
	private Produto[] produtos = new Produto[10];
	private int contador = 0;
	
	public void adiciona(Produto produto) {
		this.produtos[contador] = produto;
		System.out.println("Adicionando: " + produto);
		contador++;
		this.total += produto.getValor();
	}
	
	public double getTotal() {
		return total;
	}
	
	public Produto[] getProdutos() {
		return produtos;
	}
}
