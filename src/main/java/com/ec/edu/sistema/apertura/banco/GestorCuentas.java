package com.ec.edu.sistema.apertura.banco;

import java.util.Scanner;

public class GestorCuentas {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		double saldo=100.00;
		Scanner scanner= new Scanner(System.in);
		Scanner scanerint=new Scanner(System.in);
		
		//DATOS BASICOS
		System.out.println("Sistema de apertira de cuentas");
		System.out.println("*******************************");
		System.out.println("ingrese su nombre: ");
		String nombre=scanner.nextLine();
		System.out.println("ingrese su apellido: ");
		String apellido=scanner.nextLine();
		System.out.println("Ingrese su cedula: ");
		String cedula=scanner.nextLine();
		
		//Seleccion 
		System.out.println(" ******************************* ");
		System.out.println("Que tipo de cuenta desea aperturar: ");
		System.out.println("1. Cuenta Ahorros");
		System.out.println("2. Cuenta Corriente");
		System.out.println("3. Cuenta Poliza");
		System.out.println("Seleccion: ");
		int tipo=scanerint.nextInt();
		
		DatosCuenta datoscuenta;
		if(tipo==1) {
			datoscuenta = new CuentaAhorros();
		}else if(tipo==2) {
			datoscuenta = new CuentaCorriente();
		}else {
			datoscuenta = new CuentaPoliza();
		}
		
		CuentaHabiente cuentahabiente=new CuentaHabiente(datoscuenta);
		
	
		cuentahabiente.setNumCuenta("222565411");
		cuentahabiente.setSaldo(saldo);
		
		double valorinteres;
		if(tipo==1) {
			valorinteres = saldo * 10/100;
		}else if(tipo == 2) {
			valorinteres = saldo * 8/100;
		}else {
			valorinteres= saldo * 15/100;
		}
		
		
		cuentahabiente.setValorInteres(valorinteres);

		cuentahabiente.cuentahabiente(nombre, apellido, cedula);	
		
		System.out.println(cuentahabiente.toString());
		
	}

}
