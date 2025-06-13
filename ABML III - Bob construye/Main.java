package ABMLIII;

import java.util.Scanner;

import ABMLI.Electronica;
import ABMLI.Ropa;
import PracticoI.Alimento;

public class Main {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		int opcion;
		Casa[] casa = new Casa[10];
		Apartamento[] apa = new Apartamento[10];



		do {
			System.out.println("Bienvenido");
			System.out.println("Ingrese el tipo de Edificio: ");
			System.out.println("1- Casa");
			System.out.println("2- Apartamento");
			System.out.println("3- Salir");
			System.out.print("Ingrese su opción: ");
			opcion = lector.nextInt();
			
			switch (opcion) {
			//switch Principal
			case 1:
				do {
					System.out.println("\nIngresa opcion deseada:");
					System.out.println("1- Ingresar una casa");
					System.out.println("2- Mostrar Lista de casas");
					System.out.println("3- Eliminar casa");
					System.out.println("4- Modificar casa");
					System.out.println("5- Salir");
					opcion = lector.nextInt();
					
					//Switch Alimento

					switch (opcion) {
					case 1:
						altaCasa(casa, lector);

						break;
					
					case 2: 
						listarCasa(casa);

						break;
						
					case 3: 
						bajaCasa(casa, lector);

						break;
						
					case 4: 
						modificarCasa(casa, lector);

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
					System.out.println("1- Ingresar un apartamento");
					System.out.println("2- Mostrar Lista de apartamentos");
					System.out.println("3- Eliminar apartamento");
					System.out.println("4- Modificar apartamento");
					System.out.println("5- Salir");
					opcion = lector.nextInt();
					
					//Switch Electronica

					switch (opcion) {
					case 1:
						altaApartamento(apa, lector);

						break;
					
					case 2: 
						listarApartamento(apa);

						break;
						
					case 3: 
						bajaApartamento(apa, lector);

						break;
						
					case 4: 
						modificarApartamento(apa, lector);

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

		} while (opcion != 3);
	
	}
	
	//CASA
		public static void altaCasa(Casa[] casa, Scanner lector) {

			System.out.println("\nCASA");
			System.out.print("Ingrese la dirección: ");
			String dire = lector.next();
			System.out.print("Ingrese el precio: ");
			double precio = lector.nextDouble();
			System.out.print("Ingrese el tamaño del terreno: ");
			double terreno = lector.nextDouble();
			System.out.print("Ingrese el material: ");
			String material = lector.next();

			for (int i = 0; i < casa.length; i++) {
				if (casa[i] == null) {
					casa[i] = new Casa(dire, precio, terreno, material);
					break;
				}
			}

		}

		public static void listarCasa(Casa[] casa) {

			for (int i = 0; i < casa.length; i++) {
				if (casa[i] != null) {
					System.out.println("Producto N° " + i + casa[i].toString());

				} else {
					System.out.println("Pos N°" + i + "es null");
				}

			}

		}
		public static void bajaCasa(Casa[] casa, Scanner lector) {

			System.out.print("Ingrese la dirección del edificio: ");
			String dire = lector.next();

			for (int i = 0; i < casa.length; i++) {
				if (casa[i] != null && dire.equals(casa[i].getDireccion())) {
					casa[i] = null;
					System.out.println("→Borrado exitosamente");
				}
			}
		}
		
		private static void modificarCasa(Casa[] casa, Scanner lector) {
			
			System.out.print("Ingrese la dirección del edificio: ");
			String dire = lector.next();


			for (int i = 0; i < casa.length; i++) {
				if (casa[i] != null && dire.equals(casa[i].getDireccion())) {
					
					System.out.print("Ingrese el nuevo precio: ");
					int nPrecio = lector.nextInt();
					casa[i].setPrecio(nPrecio);
					System.out.println("→Cambiado exitosamente");
					break;
					
				}
			}
		}
		
		//APARTAMENTO
				public static void altaApartamento(Apartamento[] apa, Scanner lector) {

					System.out.println("\nCASA");
					System.out.print("Ingrese la dirección: ");
					String dire = lector.next();
					System.out.print("Ingrese el precio: ");
					double precio = lector.nextDouble();
					System.out.print("Ingrese el numero de piso: ");
					int nP = lector.nextInt();
					System.out.print("Ingrese el numero de apartamento: ");
					int nA = lector.nextInt();

					for (int i = 0; i < apa.length; i++) {
						if (apa[i] == null) {
							apa[i] = new Apartamento(dire, precio, nP, nA);
							break;
						}
					}

				}

				public static void listarApartamento(Apartamento[] apa) {

					for (int i = 0; i < apa.length; i++) {
						if (apa[i] != null) {
							System.out.println("Producto N° " + i + apa[i].toString());

						} else {
							System.out.println("Pos N°" + i + "es null");
						}

					}

				}
				public static void bajaApartamento(Apartamento[] apa, Scanner lector) {

					System.out.print("Ingrese la dirección del edificio: ");
					String dire = lector.next();

					for (int i = 0; i < apa.length; i++) {
						if (apa[i] != null && dire.equals(apa[i].getDireccion())) {
							apa[i] = null;
							System.out.println("→Borrado exitosamente");
						}
					}
				}
				
				private static void modificarApartamento(Apartamento[] apa, Scanner lector) {
					
					System.out.print("Ingrese la dirección del edificio: ");
					String dire = lector.next();


					for (int i = 0; i < apa.length; i++) {
						if (apa[i] != null && dire.equals(apa[i].getDireccion())) {
							
							System.out.print("Ingrese el nuevo precio: ");
							int nPrecio = lector.nextInt();
							apa[i].setPrecio(nPrecio);
							System.out.println("→Cambiado exitosamente");
							break;
							
						}
					}
				}
				
	}


