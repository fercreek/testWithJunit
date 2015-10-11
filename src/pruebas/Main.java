package pruebas;

public class Main {
	public static void main(String[] args){
		System.out.println("Telefonika");
		Telefonika tel = new Telefonika("Fer", 10, (float) 10.0);
		tel.regresaDatos();
		
		System.out.println("Telefono");
		Telefono telefono = new Telefono("Fernando", 100, (float) 0.0, 17655605, (float)1300.0);
		telefono.regresaDatos();
		
	}	
}

