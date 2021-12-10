package com.ec.edu.sistema.apertura.banco;

public class CuentaAhorros extends DatosCuenta {

	private Double porcenDescuento;
	
	public void tipocuenta() {
		System.out.println("Cuenta ahorros");
	}

	public Double getPorcenDescuento() {
		return porcenDescuento;
	}

	public void setPorcenDescuento(Double porcenDescuento) {
		this.porcenDescuento = porcenDescuento;
	}
	
	
	
	
}
