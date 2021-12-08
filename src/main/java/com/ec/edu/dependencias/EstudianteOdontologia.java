package com.ec.edu.dependencias;

public class EstudianteOdontologia extends Estudiante {
	
	
	private String CiudadRural;
	
	public void pagarServipagos(String Nombre) {
		
		System.out.println(Nombre+" El estudiante hace el pago");
		System.out.println(Nombre + " El estudiante presenta el pago");
		System.out.println("Paypal");
	
	}
	

	public String getCiudadRural() {
		return CiudadRural;
	}

	public void setCiudadRural(String ciudadRural) {
		CiudadRural = ciudadRural;
	}
	
	
	
	
}
