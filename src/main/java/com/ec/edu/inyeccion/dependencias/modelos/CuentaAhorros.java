package com.ec.edu.inyeccion.dependencias.modelos;


public class CuentaAhorros implements ICuenta {

	private String numeroAhorro;
	private int monto;
	
	@Override
	public void calcularDescuento(String numero) {
		// TODO Esbozo de método generado automáticamente
		
	}

	@Override
	public void calcularBeneficio() {
		// TODO Esbozo de método generado automáticamente
		
	}
	

	public String getNumeroAhorro() {
		return numeroAhorro;
	}

	public void setNumeroAhorro(String numeroAhorro) {
		this.numeroAhorro = numeroAhorro;
	}

	public int getMonto() {
		return monto;
	}

	public void setMonto(int monto) {
		this.monto = monto;
	}

	



	
}
