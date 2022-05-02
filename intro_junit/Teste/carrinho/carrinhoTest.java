package carrinho;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;

import produto.Produto;
import produto.ProdutoNaoEncontradoException;

public class carrinhoTest {
	
	Carrinho carrinho = new Carrinho();
	Produto produto;
	
	
	@Before
	public void adicionaProdutos() {		
		produto = new Produto("Senhor dos Aneis", 59.00);
		carrinho.addItem(produto);
		produto = new Produto("Harry Potter", 49.00);
		carrinho.addItem(produto);
		produto = new Produto("As Cronicas de Gelo e Fogo", 69.00);
		carrinho.addItem(produto);
		produto = new Produto("O Hobbit", 69.00);
		carrinho.addItem(produto);	
		System.out.println("Produtos adicionados");
	}
	
	@Test
	public void visualizaCarrinho() {		
		Assertions.assertEquals(246.00, carrinho.getValorTotal());
		Assertions.assertEquals(4, carrinho.getQtdeItems());
	}
	
	@Test
	public void removerItemDoCarrinho() throws ProdutoNaoEncontradoException{
		produto = new Produto("Senhor dos Aneis", 59.00);
		carrinho.removeItem(produto);
		System.out.println("Removido");
		Assertions.assertEquals(187.00, carrinho.getValorTotal());
		Assertions.assertEquals(3, carrinho.getQtdeItems());
	
	}	
	
	@Test
	public void LimparCarrinho() {
		carrinho.esvazia();
		Assertions.assertEquals(00.00, carrinho.getValorTotal());
		Assertions.assertEquals(0, carrinho.getQtdeItems());
		
	}
	

}
