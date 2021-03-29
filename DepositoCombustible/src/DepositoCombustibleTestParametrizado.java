import static org.junit.Assert.*;

import org.junit.Test;

public class DepositoCombustibleTestParametrizado {
	
	DepositoCombustible diesel = new DepositoCombustible(100, 50.5);

	@Test
	public void testFill() {
		diesel.fill(7);
		assertEquals(57.5, diesel.getDepositoNivel(), 0);
	}
	
	@Test
	public void testFillNegativo() {
		diesel.fill(-51.5);
		assertEquals(-1, diesel.getDepositoNivel(), 0);
	}

	@Test
	public void testConsumir() {
		diesel.consumir(25);
		assertEquals(25.5, diesel.getDepositoNivel(),0);
	}
	
	@Test
	public void testConsumirNegativo() {
		diesel.consumir(-25);
		assertEquals(75.5, diesel.getDepositoNivel(),0);
	}

}
