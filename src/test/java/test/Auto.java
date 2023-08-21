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
	
	String verificarIntegridad() 
	{
		if (this.registro == this.motor.registro) {
			for (int i = 0; i < asientos.length; i ++ ) {
				if (asientos[i] != null) {
					if (asientos[i].registro != this.registro) {
						return "Las piezas no son originales";
						
					}
					else {
						return "Auto original";
					}
				}
			}
		}
		return "Las piezas no son originales";
	}
}