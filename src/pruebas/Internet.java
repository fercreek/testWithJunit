

public class Internet extends Telefonika{
	private String planInternet;
	private float saldoInternet;
	private boolean cancelado = false;

	
	Internet(String nom, int cu, String plan, float sal, float saldoInternet){
		super(nom, cu, sal);
		this.setPlanInternet(plan);
		this.saldoInternet = saldoInternet;
	}

	public String regresaDatos(){
		return "Plan de internet: " + getPlanInternet() + 
				"\nSaldo de internet: " + getSaldoInternet();
	}
	
	public String getPlanInternet() {
		return planInternet;
	}

	public void setPlanInternet(String planInternet) {
		this.planInternet = planInternet;
	}

	public float getSaldoInternet() {
		return saldoInternet;
	}

	public void setSaldoInternet(float saldoInternet) {
		if(saldoInternet < 0){
			this.saldoInternet = 0;
		}else {
			this.saldoInternet = saldoInternet;
		}
	}
	
	public void cancelarInternet() {
		this.planInternet = "";
		this.saldoInternet = 0;
		this.setCancelado(true);
	}

	public boolean isCancelado() {
		return cancelado;
	}

	public void setCancelado(boolean cancelado) {
		this.cancelado = cancelado;
	}
	
	public void pagarInternet(float pago){
		this.saldoInternet -= pago;
	}
}
