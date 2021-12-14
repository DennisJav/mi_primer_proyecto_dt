package com.ec.edu.inyeccion.dependencias.modelos;

import java.util.Scanner;

public class MainFramework {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		Scanner scannerint = new Scanner(System.in);

		System.out.println("Ingrese el tipo: ");
		int tipo = scannerint.nextInt();

		ICuenta cuenta = null;
		if (tipo == 1) {
			cuenta = new CuentaCorriente();
		} else if (tipo == 2) {
			cuenta = new CuentaAhorros();
		} else if (tipo == 3) {
			cuenta = new CuentaFuturo();
		} else {
			cuenta = new ICuenta() {

				@Override
				public void calcularDescuento(String numero) {
					System.out.println("Calcular descuento Anonima");

				}

				@Override
				public void calcularBeneficio() {
					System.out.println("Calcular monto Beneficio anonima");

				}

			};
		}

		GestorCuenta gestor = new GestorCuenta(cuenta);
		gestor.registrarCuentaHabiente();

	}

}
