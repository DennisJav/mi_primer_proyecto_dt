package com.ec.edu.inyeccion.dependencias.extendida;



public class EstudianteAdministrativo extends Estudiante{
	private String Nlff;

	public void pagarServipagos(String Nombre) {
		
		System.out.println(Nombre+" El estudiante hace el pago");
		System.out.println(Nombre + " El estudiante presenta el pago");
		System.out.println("Tarjeta");
	
	}
	
	public String getNlff() {
		return Nlff;
	}

	public void setNlff(String nlff) {
		Nlff = nlff;
	}
	
	
}
