package com.ec.edu.dependencias;

import java.util.Scanner;

public class MainUCE {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el nombre");
		String nombre=scanner.nextLine();
		
		System.out.println("Ingrese Apellido: ");
		String apellido = scanner.nextLine();
		
		System.out.println("Ingrese Calle: ");
		String calle=scanner.nextLine();
		
		System.out.println("Ingrese numeracion: ");
		String numeracion = scanner.nextLine();
		
		
		Matricula matricula = new Matricula();
		matricula.setAnio(2015);
		matricula.setSemestre("Sexto");
		
		String mensaje = matricula.matricula(nombre, apellido, calle, numeracion);
		System.out.println(mensaje);
		
		
	}

}
