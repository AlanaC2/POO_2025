package PracticoIV;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		
		Pintura p1 = new Pintura(null, null, null, null, null, null);
		
		System.out.println("PINTURA");
		System.out.print("Ingrese el nombre: ");
		p1.setNombre(lector.next());
		System.out.print("Ingrese el autor: ");
		p1.setAutor(lector.next());
		System.out.print("Ingrese el año de creación: ");
		p1.setAñoCreacion(lector.next());
		System.out.print("Ingrese el tipo de pintura: ");
		p1.settPintura(lector.next());
		System.out.print("Ingrese la superficie: ");
		p1.setSuperficie(lector.next());
		System.out.print("Ingrese la tecnica: ");
		p1.setTecnica(lector.next());
		
		Escultura e1 = new Escultura(null, null, null, null, 0, 0, null);
		
		System.out.println("\nESCULTURA");
		System.out.print("Ingrese el nombre: ");
		e1.setNombre(lector.next());
		System.out.print("Ingrese el autor: ");
		e1.setAutor(lector.next());
		System.out.print("Ingrese el año de creación: ");
		e1.setAñoCreacion(lector.next());
		System.out.print("Ingrese el tipo de material: ");
		e1.setMaterial(lector.next());
		System.out.print("Ingrese la altura: ");
		e1.setAltura(lector.nextInt());
		System.out.print("Ingrese el peso: ");
		e1.setPeso(lector.nextInt());
		System.out.print("Ingrese la tecnica: ");
		e1.setTecnica(lector.next());
		
		Fotografia f1 = new Fotografia(null, null, null, null, null, null);
		
		System.out.println("\nFOTOGRAFIA");
		System.out.print("Ingrese el nombre: ");
		f1.setNombre(lector.next());
		System.out.print("Ingrese el autor: ");
		f1.setAutor(lector.next());
		System.out.print("Ingrese el año de creación: ");
		f1.setAñoCreacion(lector.next());
		System.out.print("Ingrese el formato: ");
		f1.setFormato(lector.next());
		System.out.print("Ingrese la resolución: ");
		f1.setResolucion(lector.next());
		System.out.print("Ingrese el lugar de la foto: ");
		f1.setLugar(lector.next());
		
		System.out.println("\n-----------------------------------------------------------");

		System.out.println("\nObra de Arte - Pintura " + p1);
		System.out.println("\nObra de Arte - Escultura" + e1);
		System.out.println("\nObra de Arte - Fotografia" + f1);

	}

}
