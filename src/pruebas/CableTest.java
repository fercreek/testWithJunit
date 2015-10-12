import static org.junit.Assert.*;

import org.junit.Test;

public class CableTest {
	Cable cab = new Cable("Diego", 1000, 5000, 6000);

	@Test
	public void cancelarCableTest() {
		cab.cancelarCable();
		assertEquals(0.0, cab.getSaldoCable(), 0);
		assertTrue(cab.isCancelado());
	}
	
	@Test
	public void regresaDatosTest() {
		String test = "Saldo de Cable: " + cab.getSaldoCable();
		assertTrue(cab.regresaDatos().equals(test));
	}

	@Test
	public void setCanceladoTest() {
		cab.setCancelado(true);
		assertTrue(cab.isCancelado());
		cab.setCancelado(false);
		assertFalse(cab.isCancelado());
	}


	@Test
	public void setSaldoCableTest() {
		assertEquals(6000, cab.getSaldoCable(), 0);
		cab.setSaldoCable(1000);
		assertEquals(1000, cab.getSaldoCable(), 0);
		cab.setSaldoCable(-1000);
		assertEquals(0, cab.getSaldoCable(), 0);
	}

	@Test
	public void pagarCableTest(){
		float saldoActual = cab.getSaldoCable();
		float pago = 50;
		cab.pagarCable(pago);
		assertEquals(saldoActual - pago, cab.getSaldoCable(), 0);

	}
}
