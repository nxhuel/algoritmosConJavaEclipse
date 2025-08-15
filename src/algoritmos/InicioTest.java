package algoritmos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class InicioTest {

	@DisplayName("Metodo para probar si 31 es primo o no")
	@Test
	void testPrimeNumbers() {
		assertTrue(Inicio.PrimeNumbers(31));
	}
	
	@DisplayName("Metodo para probar si 360 es primo o no")
	@Test
	void testNoPrimeNumbers() {
		assertFalse(Inicio.PrimeNumbers(360));
	}

}
