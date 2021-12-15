package jorge.sanchez.tarea;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext app = new ClassPathXmlApplicationContext("com/uce/edu/archivo/beans.xml");

		Paciente paciente = (Paciente) app.getBean("pacientet");
		System.out.println(paciente.getNombre() + " " + paciente.getApellido() + " " + paciente.getEdad());

		Profesor profesor = (Profesor) app.getBean("profesort");
		System.out.println(profesor.getNombre() + " " + profesor.getApellido() + " " + profesor.getProfesion() + " "
				+ profesor.getUniversidad());

	}

}
