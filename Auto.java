package E_1;

import java.util.Scanner;

public class Auto extends Vehiculo {

	String capacidad;

	public Auto(String marca, String modelo, int añoFabricacion, double vMaxima, String color, String capacidad) {
		super(marca, modelo, añoFabricacion, vMaxima, color);
		this.capacidad = capacidad;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\nMarca: "+marca+"\nModelo: "+modelo+"\nAño de Fabricacion: "+añoFabricacion+"\nVelocidad Maxima: "+vMaxima+"\nColor: "+color+"\nCapacidad: "+capacidad;
	}
	public static void main(String[] args) {
Scanner lector = new Scanner(System.in);
	
	
	System.out.println("Ingrese la marca: ");
	String marca = lector.next();
	System.out.println("Ingrese el modelo: ");
	String modelo = lector.next();
	System.out.println("Ingrese el año en que se fabrico: ");
	int añoFabricacion = lector.nextInt();
	System.out.println("Ingrese la velocidad limite: ");
	double vMaxima = lector.nextDouble();
	System.out.println("Ingrese el color: ");
	String color = lector.next();
	System.out.println("Ingrese la capacidad: ");
	String capacidad = lector.next();
	
	Vehiculo A = new Auto(marca, modelo, añoFabricacion, vMaxima, color, capacidad);
	
	System.out.println(A);
	}
}
