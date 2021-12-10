package com.ec.edu.sistema.apertura.banco;

public class CuentaPoliza extends DatosCuenta {
	
	private String fechaVigencia;

	public void tipocuenta() {
		System.out.println("Cuenta Poliza");
	}
	
	
	public String getFechaVigencia() {
		return fechaVigencia;
	}

	public void setFechaVigencia(String fechaVigencia) {
		this.fechaVigencia = fechaVigencia;
	}
	
	
	
}
