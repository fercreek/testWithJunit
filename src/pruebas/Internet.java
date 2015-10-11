package pruebas;

public class Internet extends Telefonika{
	private String planInternet;
	private float saldoInternet;
	
	String plan[] = {"basico", "intermedio", "avanzado"};
	
	Internet(String nom, int cu, String plan, float sal){
		super(nom, cu, sal);
		this.setPlanInternet(plan);
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
		this.saldoInternet = saldoInternet;
	}
}
