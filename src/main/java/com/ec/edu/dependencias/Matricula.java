package com.ec.edu.dependencias;

public class Matricula {

	private String semestre;
	private int anio;
	private Estudiante estudiante;
	
	
	public String matricula(String nombre, String apellido, String calle, String numero, int tipo) {
		
		if(tipo == 1) {
			this.estudiante = new Estudiante();
		}else if(tipo == 2) {
			this.estudiante = new EstudianteAdministrativo();
		}else if(tipo == 3) {
			this.estudiante = new EstudianteArquitectura();
		}else {
			this.estudiante = new EstudianteOdontologia();
		}
		
		
		this.estudiante.setNombre(nombre);
		this.estudiante.setApellido(apellido);
		
		Direccion direccion = new Direccion();
		direccion.setCallePrincipal(calle);
		direccion.setNumeracion(numero);
		
		this.estudiante.setDireccion(direccion);
			
		System.out.println(this.estudiante);
		
		
		this.estudiante.pagarServipagos(nombre);
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
