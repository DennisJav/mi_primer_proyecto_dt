package com.ec.inyeccion.dependencias.framework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext app = new ClassPathXmlApplicationContext("com/uce/edu/archivo/beans.xml");
		Cuenta miCuenta = (Cuenta) app.getBean("cuenta");
		System.out.println(miCuenta.getNumero());
		System.out.println(miCuenta.getSaldo());

//		Codigo Acoplado
//  	
//		Cuenta miCuentaPrueba=new Cuenta();
//		miCuentaPrueba.setNumero("25");
//		miCuentaPrueba.setSaldo(156);
//		
//		Cuenta miCuentaPrueba2=new Cuenta("1234",156);
//		

		Cuenta miCuenta1 = (Cuenta) app.getBean("cuenta1");
		System.out.println(miCuenta1.getNumero());
		System.out.println(miCuenta1.getSaldo());
		
		
//		IoC por constructor
		Estudiante estud =  (Estudiante)app.getBean("estudiante");
		int edadtotal = estud.getEdad()+10;
		System.out.println(estud.getNombre()+" "+estud.getApellido()+" "+edadtotal);
		
		
	
	
	}
}
