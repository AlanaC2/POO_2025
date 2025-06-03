package PracticoII;

import java.util.Scanner;

import PracticoI.Electronica;

public class Main {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		
		Libro l1 = new Libro(null, null, null, null, null, 0);
		
		System.out.println("LIBRO");
		System.out.print("Ingrese el titulo: ");
		l1.setTitulo(lector.next());
		System.out.print("Ingrese la fecha de publicación: ");
		l1.setFechaPublicacion(lector.next());
		System.out.print("Ingrese el Autor: ");
		l1.setAutor(lector.next());
		System.out.print("Ingrese el ISBN: ");
		l1.setIsbn(lector.next());
		System.out.print("Ingrese la Editorial: ");
		l1.setEditorial(lector.next());
		System.out.print("Ingrese el numero de paginas: ");
		l1.setNumPaginas(lector.nextInt());
		
		Revista r1 = new Revista(null, null, null, null, 0, null, null);
		
		System.out.println("\nREVISTA");
		System.out.print("Ingrese el titulo: ");
		r1.setTitulo(lector.next());
		System.out.print("Ingrese la fecha de publicación: ");
		r1.setFechaPublicacion(lector.next());
		System.out.print("Ingrese el Autor: ");
		r1.setAutor(lector.next());
		System.out.print("Ingrese el ISSN: ");
		r1.setIssn(lector.next());
		System.out.print("Ingrese el numero de edición: ");
		r1.setNumEdicion(lector.nextInt());
		System.out.print("Ingrese la editorial: ");
		r1.setEditorial(lector.next());
		System.out.print("Ingrese el pais de origen: ");
		r1.setPais(lector.next());
		
		ArtCientifico a1 = new ArtCientifico(null, null, null, null, 0, null, null);
		
		System.out.println("\nARTÍCULO CIENTÍFICO");
		System.out.print("Ingrese el titulo: ");
		a1.setTitulo(lector.next());
		System.out.print("Ingrese la fecha de publicación: ");
		a1.setFechaPublicacion(lector.next());
		System.out.print("Ingrese el Autor: ");
		a1.setAutor(lector.next());
		System.out.print("Ingrese el DOI: ");
		a1.setDoi(lector.next());
		System.out.print("Ingrese el numero de paginas: ");
		a1.setNumPaginas(lector.nextInt());
		System.out.print("Ingrese el area de investigación: ");
		a1.setAreaInvestigacion(lector.next());
		System.out.print("Ingrese la institución afiliada: ");
		a1.setInstitucionA(lector.next());
		
		System.out.println("\n1-----------------------------------------------------------");
		System.out.println("\nPublicación - Libro" + l1);
		System.out.println("\nPublicación - Revista 1" + r1);
		System.out.println("\nPublicación - Artículo Científico 1" + a1);
	}

}
