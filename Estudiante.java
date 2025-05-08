package E_1;

import java.util.Scanner;

public class Estudiante extends Persona{

	String grado;
	double promedio;
	
	public Estudiante (String n, String a, int c, String f, int t, String grado, double promedio) {
		super(n, a, c, f, t);
		this.grado = grado;
		this.promedio = promedio;
	}
	
	@Override
	public String toString() {
		
		return "nombre:" + nombre + "apellido:" + apellido + "ci:" + ci + "fechaNac:" + fechaNac + "telefono:" + telefono + "grado" + grado + "promedio" + promedio;
	}
	
	
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		
		System.out.println("ingrese el nombre:");
		String nombre = lector.next();
		System.out.println("ingrese el apellido");
		String apellido = lector.next();
		System.out.println("ingresen su ci");
		int ci = lector. nextInt();
		System.out.println("ingrese su fecha de nacimiento");
		String fechaNac = lector.next();
		System.out.println("numero telefonico");
		int telefono = lector.nextInt();
		System.out.println("ingrese su grado");
		String grado = lector.next();
		System.out.println("ingrese sus promedio");
		double promedio = lector.nextDouble();
		
		
		Estudiante C2 = new Estudiante (nombre, apellido, ci, fechaNac, telefono, grado, promedio);
		System.out.println(C2);
	
}
}
