import static org.junit.Assert.*;

import org.junit.Test;

public class DepositoCombustibleTest {
	DepositoCombustible diesel = new DepositoCombustible(100, 50.5);
	
	
	@Test
	public void testGetDepositoNivel() {
		assertEquals(50.5, diesel.getDepositoNivel(), 0);
	}

	@Test
	public void testGetDepositoMax() {
		assertEquals(100, diesel.getDepositoMax(), 0);
	}

	@Test
	public void testEstaVacio() {
		assertFalse(diesel.estaVacio());
	}

	@Test
	public void testEstaLleno() {
		assertFalse(diesel.estaLleno());
	}

}
