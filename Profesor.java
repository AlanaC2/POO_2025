package E_1;

import java.util.Scanner;

public class Profesor extends Persona {

	double sueldo;
	String materia;
	
	
	public Profesor(String n, String a, int c, String f, int t, double sueldo, String materia) {
		super(n, a, c, f, t);
		this.sueldo = sueldo;
		this.materia = materia;
	}
	
	@Override
	public String toString() {
		
		return "nombre:" + nombre + "apellido:" + apellido + "ci:" + ci + "fechaNac:" + fechaNac + "telefono:" + telefono + "sueldo" + sueldo + "materia" + materia;
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
		System.out.println("ingrese su sueldo");
		double sueldo = lector.nextDouble();
		System.out.println("ingrese sus materias");
		String  materia =lector.next();
		
		
		Profesor C2 = new Profesor (nombre, apellido, ci, fechaNac, telefono, sueldo, materia);
		System.out.println(C2);
		
	}
	
	
}
