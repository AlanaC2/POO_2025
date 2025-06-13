package ABMLII;

import java.util.Scanner;

import ABMLI.Alimento;
import ABMLI.Ropa;
import PracticoI.Electronica;

public class Main {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		
		int opcion;
		ArtCientifico[] aC = new ArtCientifico[10];
		Libro[] lib = new Libro[10];
		Revista[] rev = new Revista[10];



		do {
			System.out.println("BIENVENIDO");
			System.out.println("Ingrese el tipo de publicación: ");
			System.out.println("1- Artículo Científico");
			System.out.println("2- Libro");
			System.out.println("3- Revista");
			System.out.println("4- Salir");
			System.out.print("Ingrese su opción: ");
			opcion = lector.nextInt();
			
			switch (opcion) {
			//switch Principal
			case 1:
				do {
					System.out.println("\nIngresa opcion deseada:");
					System.out.println("1- Ingresar un Articulo");
					System.out.println("2- Mostrar Lista de Artículos");
					System.out.println("3- Eliminar Artículo");
					System.out.println("4- Modificar Artículo");
					System.out.println("5- Salir");
					opcion = lector.nextInt();
					
					//Switch Articulo

					switch (opcion) {
					case 1:
						altaArticulo(aC, lector);

						break;
					
					case 2: 
						listarArticulo(aC);

						break;
						
					case 3: 
						bajaArticulo(aC, lector);

						break;
						
					case 4: 
						modificarArticulo(aC, lector);

						break;
						
					case 5: 
						System.out.println("\n--------------------------------------");
						System.out.println("Regresado al menu principal");
						System.out.println("--------------------------------------\n");						
						break;

					default:
						System.out.println("\n--------------------------------------");
						System.out.println("Opción incorrecta");
						System.out.println("--------------------------------------\n");						
						break;
					}
				} while (opcion != 5);
				
				break;
			
			case 2:
				
				do {
					System.out.println("\nIngresa opcion deseada:");
					System.out.println("1- Ingresar un Libro");
					System.out.println("2- Mostrar Lista de libros");
					System.out.println("3- Eliminar Libro");
					System.out.println("4- Modificar Libro");
					System.out.println("5- Salir");
					opcion = lector.nextInt();
					
					//Switch Libro

					switch (opcion) {
					case 1:
						altaLibro(lib, lector);

						break;
					
					case 2: 
						listarLibro(lib);

						break;
						
					case 3: 
						bajaLibro(lib, lector);

						break;
						
					case 4: 
						modificarLibro(lib, lector);

						break;
						
					case 5: 
						System.out.println("\n--------------------------------------");
						System.out.println("Regresado al menu principal");
						System.out.println("--------------------------------------\n");												
						break;

					default:
						System.out.println("\n--------------------------------------");
						System.out.println("Opción incorrecta");
						System.out.println("--------------------------------------\n");						
						break;
					}
				} while (opcion != 5);
				break;
				
			case 3: 
				do {
					System.out.println("\nIngresa opcion deseada:");
					System.out.println("1- Ingresar una Revista");
					System.out.println("2- Mostrar Lista de Revista");
					System.out.println("3- Eliminar Revista");
					System.out.println("4- Modificar Revista");
					System.out.println("5- Salir");
					opcion = lector.nextInt();
					
					//Switch revista

					switch (opcion) {
					case 1:
						altaRevista(rev, lector);

						break;
					
					case 2: 
						listarRevista(rev);

						break;
						
					case 3: 
						bajaRevista(rev, lector);

						break;
						
					case 4: 
						modificarRevista(rev, lector);

						break;
						
					case 5: 
						System.out.println("\n--------------------------------------");
						System.out.println("Regresado al menu principal");
						System.out.println("--------------------------------------\n");						
						break;

					default:
						System.out.println("\n--------------------------------------");
						System.out.println("Opción incorrecta");
						System.out.println("--------------------------------------\n");						
						break;
					}
				} while (opcion != 5);
				break;
				
			case 4:
				System.out.println("FIN");
				break;
			

			default:
				System.out.println("\n--------------------------------------");
				System.out.println("Opción incorrecta");
				System.out.println("--------------------------------------\n");						
				break;
			}

		} while (opcion != 4);
	
	}
	
		
		
		//Articulo Cientifico
			public static void altaArticulo(ArtCientifico[] aC, Scanner lector) {

				System.out.println("ARTÍCULO CIENÍFICO");
				System.out.print("Ingrese el titulo: ");
				String titulo = lector.next();
				System.out.print("Ingrese el Autor: ");
				String autor = lector.next();
				System.out.print("Ingrese el numero de paginas: ");
				int numP = lector.nextInt();
				System.out.print("Ingrese el area de investigación: ");
				String areaI = lector.next();
				

				for (int i = 0; i < aC.length; i++) {
					if (aC[i] == null) {
						aC[i] = new ArtCientifico(titulo, autor, numP, areaI);
						break;
					}
				}

			}

			public static void listarArticulo(ArtCientifico[] aC) {

				for (int i = 0; i < aC.length; i++) {
					if (aC[i] != null) {
						System.out.println("Producto N° " + i + aC[i].toString());

					} else {
						System.out.println("Pos N°" + i + " es null");
					}

				}

			}
			public static void bajaArticulo(ArtCientifico[] aC, Scanner lector) {
				
				System.out.print("Ingrese el autor de la publicacion: ");
				String aut = lector.next();

				for (int i = 0; i < aC.length; i++) {
					if (aC[i] != null && aut.equals(aC[i].getTitulo())) {
						aC[i] = null;
						System.out.println("→Borrado exitosamente");
					}
				}
			}
			
			private static void modificarArticulo(ArtCientifico[] aC, Scanner lector) {
				
				System.out.print("Ingrese el autor de la publicacion: ");
				String aut = lector.next();


				for (int i = 0; i < aC.length; i++) {
					if (aC[i] != null && aut.equals(aC[i].getTitulo())) {
						
						System.out.print("Ingrese el nuevo titulo: ");
						String tit = lector.next();
						aC[i].setTitulo(tit);;
						System.out.println("→Cambiado exitosamente");
						break;
						
					}
				}
			}
			
			//Libro
			public static void altaLibro(Libro[] lib, Scanner lector) {
				System.out.println("LIBRO");
				System.out.print("Ingrese el titulo: ");
				String titulo = lector.next();
				System.out.print("Ingrese el Autor: ");
				String autor = lector.next();
				System.out.print("Ingrese el ISBN: ");
				String isbn = lector.next();
				System.out.print("Ingrese el numero de paginas: ");
				int numPaginas = lector.nextInt();
				
				
				

				for (int i = 0; i < lib.length; i++) {
					if (lib[i] == null) {
						lib[i] = new Libro(titulo, autor, isbn, numPaginas);
						break;
					}
				}

			}

			public static void listarLibro(Libro[] lib) {

				for (int i = 0; i < lib.length; i++) {
					if (lib[i] != null) {
						System.out.println("Producto N° " + i + lib[i].toString());

					} else {
						System.out.println("Pos N°" + i + " es null");
					}

				}

			}
			public static void bajaLibro(Libro[] lib, Scanner lector) {
				
				System.out.print("Ingrese el autor de la publicacion: ");
				String aut = lector.next();

				for (int i = 0; i < lib.length; i++) {
					if (lib[i] != null && aut.equals(lib[i].getTitulo())) {
						lib[i] = null;
						System.out.println("→Borrado exitosamente");
					}
				}
			}
			
			private static void modificarLibro(Libro[] lib, Scanner lector) {
				
				System.out.print("Ingrese el autor de la publicacion: ");
				String aut = lector.next();


				for (int i = 0; i < lib.length; i++) {
					if (lib[i] != null && aut.equals(lib[i].getTitulo())) {
						
						System.out.print("Ingrese el nuevo titulo: ");
						String tit = lector.next();
						lib[i].setTitulo(tit);;
						System.out.println("→Cambiado exitosamente");
						break;
						
					}
				}
			}
			
			//revista
			public static void altaRevista(Revista[] rev, Scanner lector) {

				System.out.println("REVISTA");
				System.out.print("Ingrese el titulo: ");
				String titulo = lector.next();
				System.out.print("Ingrese el Autor: ");
				String autor = lector.next();
				System.out.print("Ingrese la editorial: ");
				String editorial = lector.next();
				System.out.print("Ingrese el pais de origen: ");
				String pais = lector.next();
				
				

				for (int i = 0; i < rev.length; i++) {
					if (rev[i] == null) {
						rev[i] = new Revista(titulo, autor, editorial, pais);
						break;
					}
				}

			}

			public static void listarRevista(Revista[] rev) {

				for (int i = 0; i < rev.length; i++) {
					if (rev[i] != null) {
						System.out.println("Producto N° " + i + rev[i].toString());

					} else {
						System.out.println("Pos N°" + i + " es null");
					}

				}

			}
			public static void bajaRevista(Revista[] rev, Scanner lector) {
				
				System.out.print("Ingrese el autor de la publicacion: ");
				String aut = lector.next();

				for (int i = 0; i < rev.length; i++) {
					if (rev[i] != null && aut.equals(rev[i].getTitulo())) {
						rev[i] = null;
						System.out.println("→Borrado exitosamente");
					}
				}
			}
			
			private static void modificarRevista(Revista[] rev, Scanner lector) {
				
				System.out.print("Ingrese el autor de la publicacion: ");
				String aut = lector.next();


				for (int i = 0; i < rev.length; i++) {
					if (rev[i] != null && aut.equals(rev[i].getTitulo())) {
						
						System.out.print("Ingrese el nuevo titulo: ");
						String tit = lector.next();
						rev[i].setTitulo(tit);;
						System.out.println("→Cambiado exitosamente");
						break;
						
					}
				}
			}
	}



