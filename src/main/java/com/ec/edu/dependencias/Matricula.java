package com.ec.edu.dependencias;

public class Matricula {

	private String semestre;
	private int anio;
	private Estudiante estudiante;
	
	public String matricula(String nombre, String apellido, String calle, String numero) {
		this.estudiante = new Estudiante();
		this.estudiante.setNombre(nombre);
		this.estudiante.setApellido(apellido);
		
		Direccion direccion = new Direccion();
		direccion.setCallePrincipal(calle);
		direccion.setNumeracion(numero);
		
		this.estudiante.setDireccion(direccion);
		
		System.out.println(this.estudiante);
		
		return "Estudiante Guardado con Exito";
		
	}
	
	public String getSemestre() {
		return semestre;
	}
	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	
	
	
}
