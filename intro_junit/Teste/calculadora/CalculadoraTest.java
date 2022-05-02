package calculadora;

import static org.junit.jupiter.api.Assertions.assertThrows;

//import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
	
	private Calculadora calc;
	
	@BeforeEach
	public void inicializa() {
		calc = new Calculadora();
	
	}
	
	@DisplayName("Teste da soma de dois números")
	@Test
	public void testSomaDoisNumeros() {
		Calculadora calc = new Calculadora();
		int soma = calc.soma(4,  5);
		
		Assertions.assertEquals(9, soma);
	}
	
	@Test
	public void testDivisaoDoisNumeros() {
		int divisao = calc.divisao(8,  4);
		Assertions.assertTrue(divisao == 2);
	}
	
	@Test
	public void testDivisaoPorZero() {
		try {
			int divisao = calc.divisao(8, 0);
			Assertions.fail("exceção não lançada");
		}catch(ArithmeticException e) {
			Assertions.assertEquals("/ by zero", e.getMessage());
		}
	}
	
	@Test
	public void testDivisaoPorZeroComAssertThrows() {
		assertThrows(ArithmeticException.class,
				() -> calc.divisao(8, 0));
	}
}
