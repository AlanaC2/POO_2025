package PracticoIII;

import java.util.Scanner;

import PracticoI.Alimento;

public class Main {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		
		Casa c1 = new Casa(null, 0, 0, 0, 0, null, false);
		
		System.out.println("CASA");
		System.out.print("Ingrese la dirección: ");
		c1.setDireccion(lector.next());
		System.out.print("Ingrese el precio: ");
		c1.setPrecio(lector.nextDouble());
		System.out.print("Ingrese el numero de habitaciones: ");
		c1.setNumHabitaciones(lector.nextInt());
		System.out.print("Ingrese la cantidad de pisos: ");
		c1.setNumPisos(lector.nextInt());
		System.out.print("Ingrese el tamaño del terreno: ");
		c1.settTerreno(lector.nextDouble());
		System.out.print("Ingrese el material: ");
		c1.setMaterial(lector.next());
		System.out.print("Ingrese si tienen patio true/false: ");
		c1.setPatio(lector.nextBoolean());
		
		Apartamento a1 = new Apartamento(null, 0, 0, 0, 0, 0, null);
		
		System.out.println("\nAPARTAMENTO");
		System.out.print("Ingrese la dirección: ");
		a1.setDireccion(lector.next());
		System.out.print("Ingrese el precio: ");
		a1.setPrecio(lector.nextDouble());
		System.out.print("Ingrese el numero de habitaciones: ");
		a1.setNumHabitaciones(lector.nextInt());
		System.out.print("Ingrese la cantidad de pisos: ");
		a1.setNumPisos(lector.nextInt());
		System.out.print("Ingrese el numero de piso: ");
		a1.setnPiso(lector.nextInt());
		System.out.print("Ingrese el numero de apartamento: ");
		a1.setNumApartamento(lector.nextInt());
		System.out.print("Ingrese las amenidades: ");
		a1.setAmenidades(lector.next());
		
		System.out.println("\n-----------------------------------------------------------");

		System.out.println("\nEdificio - Casa " + c1);
		System.out.println("\nEdificio - Apartamento" + a1);
	}

}
