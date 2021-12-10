package com.ec.edu.sistema.apertura.banco;

public class CuentaHabiente {


	private String numCuenta;
	private Double Saldo;
	private Double valorInteres;
	private DatosCuenta cuentas;
	
	
	public CuentaHabiente(DatosCuenta cuentas){
		this.cuentas = cuentas;
	}
	
	public String cuentahabiente(String Nombre, String Apellido, String Cedula) {
		
		this.cuentas.setNombre(Nombre);
		this.cuentas.setApellido(Apellido);
		this.cuentas.setCedula(Cedula);
		
		
		System.out.println(this.cuentas);
		this.cuentas.tipocuenta();
		return "Datos guardados";
		
	}

	
	
	
	public String getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}

	public Double getSaldo() {
		return Saldo;
	}

	public void setSaldo(Double saldo) {
		Saldo = saldo;
	}

	public Double getValorInteres() {
		
		return valorInteres;
	}

	public void setValorInteres(Double valorInteres) {
		
		this.valorInteres = valorInteres;
	}

	public DatosCuenta getCuentas() {
		return cuentas;
	}

	public void setCuentas(DatosCuenta cuentas) {
		this.cuentas = cuentas;
	}

	@Override
	public String toString() {
		return "CuentaHabiente [numCuenta=" + numCuenta + ", Saldo=" + Saldo + ", valorInteres=" + valorInteres
				+ ", \n " + cuentas + "]";
	}
	
	
	
	
	
	
	
	
	
}
