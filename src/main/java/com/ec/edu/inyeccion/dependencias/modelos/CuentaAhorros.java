package com.ec.edu.inyeccion.dependencias.modelos;


public class CuentaAhorros implements ICuenta {

	private String numeroAhorro;
	private int monto;
	
	@Override
	public void calcularDescuento(String numero) {
		// TODO Esbozo de m�todo generado autom�ticamente
		
	}

	@Override
	public void calcularBeneficio() {
		// TODO Esbozo de m�todo generado autom�ticamente
		
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
