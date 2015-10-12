import static org.junit.Assert.*;

import org.junit.Test;

public class TelefonoTest {
	Telefono tel = new Telefono("Diego", 100, 500, 81580526, 100);
	
	@Test
	public void cancelarTelefonoTest() {
		tel.cancelarTelefono();
		assertEquals(0.0, tel.getSaldoTelefono(), 0);
		assertEquals(0, tel.getNumeroTelefono());
		assertTrue(tel.isCancelado());
	}
	
	@Test
	public void regresaDatosTest() {
		String test = "Numero telefonico: " + tel.getNumeroTelefono() + "\nSaldo de telefono: " + tel.getSaldoTelefono();
		assertTrue(tel.regresaDatos().equals(test));
	}

	@Test
	public void setCanceladoTest() {
		tel.setCancelado(true);
		assertTrue(tel.isCancelado());
		tel.setCancelado(false);
		assertFalse(tel.isCancelado());
	}

	@Test
	public void setNumeroTelefonoTest() {
		tel.setNumeroTelefono(81282937);
		assertEquals(81282937, tel.getNumeroTelefono());
		tel.setNumeroTelefono(-81282937);
		assertEquals(0, tel.getNumeroTelefono());
	}

	@Test
	public void setSaldoTelefonoTest() {
		assertEquals(100, tel.getSaldoTelefono(), 0);
		tel.setSaldoTelefono(1000);
		assertEquals(1000, tel.getSaldoTelefono(), 0);
		tel.setSaldoTelefono(-1000);
		assertEquals(0, tel.getSaldoTelefono(), 0);
	}
	
	@Test
	public void pagarTelefonoTest(){
		float saldoActual = tel.getSaldoTelefono();
		float pago = 50;
		tel.pagarTelefono(pago);
		assertEquals(saldoActual - pago, tel.getSaldoTelefono(), 0);

	}
}
