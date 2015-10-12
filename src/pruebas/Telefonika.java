

public class Telefonika {
	private String nombreCliente;
	private int numCuenta;
	private float saldoTotal;
	
	public Telefonika() {
		this.nombreCliente = "Fernando";
		this.numCuenta= 1000;
		this.saldoTotal = (float) 10.5;
	}
	
	public Telefonika(String nombre, int cuenta, float saldoTotal) {
		this.nombreCliente = nombre;
		this.numCuenta= cuenta;
		this.saldoTotal = saldoTotal;
	}
	
	public String regresaDatos(){
		System.out.println("Nombre del cliente: " + this.nombreCliente + 
						 "\nNumero de cuenta: " + this.numCuenta + 
						 "\nSaldo total: " + this.saldoTotal);
		return "";
	}

	public float getSaldoTotal() {
		return saldoTotal;
	}

	public void setSaldoTotal(float saldoTotal) {
		this.saldoTotal = saldoTotal;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public int getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(int numCuenta) {
		this.numCuenta = numCuenta;
	}
	
}

