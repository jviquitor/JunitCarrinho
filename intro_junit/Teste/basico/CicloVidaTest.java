package basico;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
/*import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;*/

public class CicloVidaTest {
	
	@BeforeClass
	public static void inicializaTodos() {
		System.out.println("@BeforeAll");
	}
	
	@Before
	public void inicializaAntesDeCada() {
		System.out.println("@BeforeEach");
	}
	
	@Test
	public void test1() {
		System.out.println("@test1");
	}
	
	@Test
	public void test2() {
		System.out.println("@test2");
	}
	
	@Test
	public void test3() {
		System.out.println("@test3");
	}
	
	@AfterClass
	public static void finalizaTodos() {
		System.out.println("@AfterAll");
	}
	
	@After
	public void finalizaAntesDeCada() {
		System.out.println("@AfterEach");
	}

}