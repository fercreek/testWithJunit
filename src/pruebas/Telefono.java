package pruebas;

public class Telefono extends Telefonika{
	private int numeroTelefono;
	private float saldoTelefono;
	
	Telefono(String nombre, int cuenta, float saldoTotal, int numTel, float salTel){
		super(nombre, cuenta, saldoTotal);
		this.numeroTelefono = numTel;
		this.saldoTelefono = salTel;
	}
	
	public String regresaDatos(){
		System.out.println("Numero telefonico: " + getNumeroTelefono() + 
				"\nSaldo de telefono: " + getSaldoTelefono());
		return "";
	}
	
	public int getNumeroTelefono() {
		return numeroTelefono;
	}

	public void setNumeroTelefono(int numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}

	public float getSaldoTelefono() {
		return saldoTelefono;
	}

	public void setSaldoTelefono(float saldoTelefono) {
		this.saldoTelefono = saldoTelefono;
	}
	
}


