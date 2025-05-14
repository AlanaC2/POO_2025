package Ejercicio;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		
		Auto auto1 = new Auto(null, null, null, 0, 0);
		
		System.out.println("Ingrese Matricula: ");
		auto1.setMatricula(lector.next());
		System.out.println("Ingrese Marca: ");
		auto1.setMarca(lector.next());
		System.out.println("Ingrese Modelo: ");
		auto1.setModelo(lector.next());
		System.out.println("Ingrese Precio: ");
		auto1.setPrecio(lector.nextDouble());
		System.out.println("Ingrese año de fabricación: ");
		auto1.setAñoFab(lector.nextInt());
		
		System.out.println(auto1);
	}
	

}
