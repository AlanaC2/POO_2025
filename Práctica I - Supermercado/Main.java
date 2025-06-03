package PracticoI;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
	
		Electronica e1 = new Electronica(null, 0, 0);
		
		System.out.println("PRODUCTO DE ELECTRONICA");
		System.out.print("Ingrese Nombre: ");
		e1.setNombre(lector.next());
		System.out.print("Ingrese precio: ");
		e1.setPrecio(lector.nextDouble());
		System.out.print("Ingrese años de garantia: ");
		e1.setaGarantia(lector.nextInt());
				
		Ropa r1 = new Ropa(null, 0, null, null);
		
		System.out.println("\nPRODUCTO DE ROPA");
		System.out.print("Ingrese Nombre: ");
		r1.setNombre(lector.next());
		System.out.print("Ingrese precio: ");
		r1.setPrecio(lector.nextDouble());
		System.out.print("Ingrese talla: ");
		r1.setTalla(lector.next());
		System.out.print("Ingrese color: ");
		r1.setColor(lector.next());
		

		Alimento a1 = new Alimento(null, 0, null, null);
		
		System.out.println("\nPRODUCTO DE ALIMENTO");
		System.out.print("Ingrese Nombre: ");
		a1.setNombre(lector.next());
		System.out.print("Ingrese precio: ");
		a1.setPrecio(lector.nextDouble());
		System.out.print("Ingrese Fecha de Vencimiento: ");
		a1.setFechaVencimiento(lector.next());
		System.out.print("Ingrese lugar de creación: ");
		a1.setLugarC(lector.next());
		
		System.out.println("\n-----------------------------------------------------------");

		System.out.println("\nProducto 1 - Electronica " + e1);
		System.out.println("\nProducto 1 - Ropa" + r1);
		System.out.println("\nProducto 1 - Alimento" + a1);

	}

}
