package com.ec.edu.dependencias;

public class EstudianteArquitectura extends Estudiante{
	private String Codigomunicipio;

	public void pagarServipagos(String Nombre) {
		
		System.out.println(Nombre+" El estudiante hace el pago");
		System.out.println(Nombre + " El estudiante presenta el pago");
		System.out.println("Transferencia");
	
	}
	
	
	public String getCodigomunicipio() {
		return Codigomunicipio;
	}

	public void setCodigomunicipio(String codigomunicipio) {
		Codigomunicipio = codigomunicipio;
	}
	
	
	
}
