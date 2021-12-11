package com.ec.edu.inyeccion.dependencias.modelos;

import java.util.Scanner;

public class MainFramework {

	public static void main(String[] args) {
		// TODO Esbozo de m�todo generado autom�ticamente

		Scanner scannerint = new Scanner(System.in);
		
		System.out.println("Ingrese el tipo: ");
		int tipo = scannerint.nextInt();
		
		 ICuenta cuenta = null;
	        if (tipo == 1) {
	            cuenta = new CuentaCorriente();
	        }else if(tipo == 2) {
	            cuenta = new CuentaAhorros();
	        }else if(tipo == 3) {
	            cuenta = new CuentaFuturo();
	        }

	        GestorCuenta gestor = new GestorCuenta(cuenta);
	        gestor.registrarCuentaHabiente();
	
		
	}

}
