package pruebas;

public class Cable extends Telefonika{
	private float saldoCable;
	
	Cable(String nom, int cuenta, float sal){
		super(nom, cuenta, sal);
	}
	
	public float getSaldoCable() {
		return saldoCable;
	}
	
	public void setSaldoCable(float saldoCable) {
		this.saldoCable = saldoCable;
	}
	
}
