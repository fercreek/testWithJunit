
public class Telefono extends Telefonika {
	private boolean cancelado = false;
	private int numeroTelefono;
	private float saldoTelefono;

	Telefono(String nombre, int cuenta, float saldoTotal, int numTel, float salTel) {
		super(nombre, cuenta, saldoTotal);
		this.numeroTelefono = numTel;
		this.saldoTelefono = salTel;
	}

	public void cancelarTelefono() {
		this.numeroTelefono = 0;
		this.saldoTelefono = 0;
		this.cancelado = true;
	}
	
	public int getNumeroTelefono() {
		return numeroTelefono;
	}

	public float getSaldoTelefono() {
		return saldoTelefono;
	}

	public boolean isCancelado() {
		return cancelado;
	}

	public String regresaDatos() {
		return "Numero telefonico: " + getNumeroTelefono() + "\nSaldo de telefono: " + getSaldoTelefono();
	}

	public void setCancelado(boolean cancelado) {
		this.cancelado = cancelado;
	}

	public void setNumeroTelefono(int numeroTelefono) {
		if (numeroTelefono < 0){
			this.numeroTelefono = 0;
		}else {
			this.numeroTelefono = numeroTelefono;
		}
	}

	public void setSaldoTelefono(float saldoTelefono) {
		if (saldoTelefono < 0){
			this.saldoTelefono = 0;
		}else{
			this.saldoTelefono = saldoTelefono;

		}
	}
	
	public void pagarTelefono(float pago){
		this.saldoTelefono -= pago;
	}
	
}
