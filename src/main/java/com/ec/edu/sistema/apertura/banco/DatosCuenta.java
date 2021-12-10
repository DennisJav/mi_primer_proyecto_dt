package com.ec.edu.sistema.apertura.banco;

public class DatosCuenta {
	
	protected String Nombre;
	protected String Apellido;
	protected String Cedula;
	
	public void tipocuenta() {
		System.out.println("");
	}
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public String getCedula() {
		return Cedula;
	}
	public void setCedula(String cedula) {
		Cedula = cedula;
	}
	
	
	@Override
	public String toString() {
		return "DatosCuenta [Nombre=" + Nombre + ", Apellido=" + Apellido + ", Cedula=" + Cedula + "]";
	}
	
	
	
	
	
}
