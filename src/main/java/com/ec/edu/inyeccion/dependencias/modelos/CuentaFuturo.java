package com.ec.edu.inyeccion.dependencias.modelos;

public class CuentaFuturo implements ICuenta {

	@Override
    public void calcularDescuento(String numero) {
        System.out.println("Nuevo metodo");
    }

    @Override
    public void calcularBeneficio() {
        System.out.println("Nuevo beneficio");
    }
    
}
