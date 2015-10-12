

import static org.junit.Assert.*;

import org.junit.Test;

public class TelefonikaTest {
	Telefonika tel = new Telefonika("Fer", 10, (float) 10.0);
	
	@Test
	public void testNombre() {
		String val = tel.getNombreCliente();
		
		assertEquals("Fer", val);	
	}
	

	@Test
	public void testNumCuenta() {
		int numTest = tel.getNumCuenta();
	
		assertTrue("Numero de cuenta mayor a 0", numTest != 0 && numTest > 0);

	}
}
