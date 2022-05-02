package produto;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.BeforeEach;

public class ProdutoTest {

	Produto livro;
	
	@Before
	public void inicializa() {
		livro = new Produto("Introdução ao Teste de Software", 100.00);
	}
	
	@Test
	public void testCriaProduto() {
		Assertions.assertAll("livro",
				() -> assertEquals("Introdução ao Teste de Software", livro.getNome()),
				() -> assertTrue(100.00 == livro.getPreco())
				);
		
	}
	
	@Test
	public void testProdutoIguais() {
		Produto livro2 = new Produto("Introdução ao Teste de Software", 90.00);		
		assertSame(livro,livro2);
	}
	
	
}
