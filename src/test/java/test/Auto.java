package test;

public class Auto {
	String modelo;
	int precio;
	String marca;
	Motor motor;
	int registro;
	public static int cantidadCreados;
	Asiento [] asientos;
	
	int cantidadAsientos() {
		int cantAsientos = 0;
		for (int i = 0; i < asientos.length; ++i ) {
			
			if (asientos[i] != null) {
				
				cantAsientos++;
				
			}
		}
		return cantAsientos;
		
	}
	
	String verificarIntegridad() {
		int autoRegistro = this.registro;
		String original = "Auto original";
		String pirata = "Las piezas no son originales";
		if (motor.registro != autoRegistro) {
			
			return pirata;
		
		}
		for (int i = 0; i < asientos.length; ++i ) {
			
			if (asientos[i].registro != autoRegistro) {
				
				return pirata;
		
			}
		}
		return original;
	}
}
