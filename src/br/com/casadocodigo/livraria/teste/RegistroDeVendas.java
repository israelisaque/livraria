package br.com.casadocodigo.livraria.teste;

import br.com.casadocodigo.livraria.Autor;
import br.com.casadocodigo.livraria.produtos.CarrinhoDeCompras;
import br.com.casadocodigo.livraria.produtos.Ebook;
import br.com.casadocodigo.livraria.produtos.LivroFisico;
import br.com.casadocodigo.livraria.produtos.Produto;

public class RegistroDeVendas {
	
	public static void main(String[] args) {
		
		Autor autor = new Autor();
		autor.setNome("Mauricio Aniche");
		
		LivroFisico fisico = new LivroFisico(autor);
		fisico.setNome("Test-Driven Development");
		fisico.setValor(59.90);
		
		if (fisico.aplicaDescontode10Porcento()) {
			System.out.println("Valor agora � " + fisico.getValor());
		}
		
		Ebook ebook = new Ebook(autor);
		ebook.setNome("Test-Driven Development");
		ebook.setValor(29.90);
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adiciona(fisico);
		carrinho.adiciona(ebook);
		
		System.out.println("Total " + carrinho.getTotal());

		Produto[] produtos = carrinho.getProdutos();
		
		for (int i = 0; i <= produtos.length; i++) {
			try {
				Produto produto = produtos[i];
				if (produto != null) {
					System.out.println(produto.getValor());
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("deu exception no indice: " + i);
			} catch (NullPointerException e) {
				System.out.println("A array n�o foi instanciado!");
			} finally {
				System.out.println("Execu��o independente se der exception ou n�o");
			}
		}
		
		System.out.println("Fui executado!");				
		
		
//		for (Produto produto : produtos) {
//			if (produto != null) {
//				System.out.println(produto.getValor());				
//			}
//		}
		
	}
}
