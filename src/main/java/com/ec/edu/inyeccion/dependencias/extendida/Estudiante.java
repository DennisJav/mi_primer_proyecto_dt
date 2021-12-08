package com.ec.edu.inyeccion.dependencias.extendida;


public class Estudiante {
	
	protected String nombre;
	protected String apellido;
	protected Direccion direccion;
	
	
	public void pagarServipagos(String Nombre) {
			
		System.out.println(Nombre+" El estudiante hace el pago");
		System.out.println(Nombre + " El estudiante presenta el pago");
		System.out.println("efectvo");
	
	}
	
	//metodos set y get
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + "]";
	}
	
	
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	
	
}
