import static org.junit.Assert.*;

import org.junit.Test;

public class InternetTest {
	Internet inter = new Internet("Diego", 100, "Avanzado", 5000, 6000);
	
	@Test
	public void cancelarCableTest() {
		inter.cancelarInternet();
		assertEquals(0.0, inter.getSaldoInternet(), 0);
		assertEquals("", inter.getPlanInternet());
		assertTrue(inter.isCancelado());
	}
	
	@Test
	public void regresaDatosTest() {
		String test = "Plan de internet: " + inter.getPlanInternet() + 
				"\nSaldo de internet: " + inter.getSaldoInternet();
		assertTrue(inter.regresaDatos().equals(test));
	}

	@Test
	public void setCanceladoTest() {
		inter.setCancelado(true);
		assertTrue(inter.isCancelado());
		inter.setCancelado(false);
		assertFalse(inter.isCancelado());
	}


	@Test
	public void setSaldoInternetTest() {
		assertEquals(6000, inter.getSaldoInternet(), 0);
		inter.setSaldoInternet(1000);
		assertEquals(1000, inter.getSaldoInternet(), 0);
		inter.setSaldoInternet(-1000);
		assertEquals(0, inter.getSaldoInternet(), 0);
	}

	@Test
	public void pagarInternetTest(){
		float saldoActual = inter.getSaldoInternet();
		float pago = 50;
		inter.pagarInternet(pago);
		assertEquals(saldoActual - pago, inter.getSaldoInternet(), 0);

	}

}
