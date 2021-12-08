package com.ec.edu.inyeccion.dependencias.extendida;

import java.util.Scanner;


public class MainFramework {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente


		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el nombre");
		String nombre=scanner.nextLine();
		
		System.out.println("Ingrese Apellido: ");
		String apellido = scanner.nextLine();
		
		System.out.println("Ingrese Calle: ");
		String calle=scanner.nextLine();
		
		System.out.println("Ingrese numeracion: ");
		String numeracion = scanner.nextLine();
		
		Scanner scannerint = new Scanner(System.in);
		
		System.out.println("Ingrese el tipo: ");
		int tipo = scannerint.nextInt();
		
		Estudiante estudiante;
		
		if(tipo == 1) {
			estudiante = new Estudiante();
		}else if (tipo == 2){
			estudiante = new estudianteOdontologia();
		}else if(tipo == 3) {
			estudiante = new estudianteArquitectura();
		}else{
			estudiante = new EstudianteAdministrativo();
		}
		
		//aqui se da el control al mainFramework
		Matricula matricula =  new Matricula(estudiante, new Direccion());
		//
		
		matricula.setAnio(2015);
		matricula.setSemestre("Sexto");
		
		String mensaje = matricula.matricula(nombre, apellido, calle, numeracion);
		System.out.println(mensaje);
		
		
		
		
		
	}

}
