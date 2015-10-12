

public class Cable extends Telefonika{
	private float saldoCable;
	private boolean cancelado = false;
	
	Cable(String nom, int cuenta, float sal, float saldoCable){
		super(nom, cuenta, sal);
		this.saldoCable = saldoCable;
	}
	
	public float getSaldoCable() {
		return saldoCable;
	}
	

	public void setSaldoCable(float saldoCable) {
		if(saldoCable < 0){
			this.saldoCable = 0;
		}else{
			this.saldoCable = saldoCable;
		}
	}

	public boolean isCancelado() {
		return cancelado;
	}

	public void setCancelado(boolean cancelado) {
		this.cancelado = cancelado;
	}
	
	public void cancelarCable() {
		this.saldoCable = 0;
		this.cancelado = true;
	}
	
	public String regresaDatos(){
		return "Saldo de Cable: " + getSaldoCable();
	}
	
	public void pagarCable(float pago){
		this.saldoCable -= pago;
	}
}
