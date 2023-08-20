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
		int regisAuto = this.registro;
		
		for (int i = 0; i < asientos.length; ++i ) 
		{
			if (asientos[i].registro != regisAuto) 
			{
				return "Las piezas no son originales";
			}
		}
		if (motor.registro != regisAuto)
		{
			return "Las piezas no son originales";
			
		}
		else 
		{
			return "Auto original";
		}
	}
}
