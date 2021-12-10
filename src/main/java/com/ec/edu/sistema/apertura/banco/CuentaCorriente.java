package com.ec.edu.sistema.apertura.banco;

public class CuentaCorriente extends DatosCuenta{
	
	private Double montoMinimo;
	
	public void tipocuenta() {
		System.out.println("Cuenta corriente");
	}

	public Double getMontoMinimo() {
		return montoMinimo;
	}

	public void setMontoMinimo(Double montoMinimo) {
		this.montoMinimo = montoMinimo;
	}
	
	
	
}
