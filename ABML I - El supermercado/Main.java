package ABMLI;

import java.util.Scanner;

import For.Estudiante;

public class Main {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		
		int opcion;
		Alimento[] alimento = new Alimento[10];
		Electronica[] ele = new Electronica[10];
		Ropa[] ropa = new Ropa[10];



		do {
			System.out.println("BIENVENIDO");
			System.out.println("Ingrese el tipo de producto: ");
			System.out.println("1- Alimento");
			System.out.println("2- Electronica");
			System.out.println("3- Ropa");
			System.out.println("4- Salir");
			System.out.print("Ingrese su opción: ");
			opcion = lector.nextInt();
			
			switch (opcion) {
			//switch Principal
			case 1:
				do {
					System.out.println("\nIngresa opcion deseada:");
					System.out.println("1- Ingresar un Alimento");
					System.out.println("2- Mostrar Lista de Alimentoos");
					System.out.println("3- Eliminar Alimento");
					System.out.println("4- Modificar Alimento");
					System.out.println("5- Salir");
					opcion = lector.nextInt();
					
					//Switch Alimento

					switch (opcion) {
					case 1:
						altaAlimento(alimento, lector);

						break;
					
					case 2: 
						listarAlimentos(alimento);

						break;
						
					case 3: 
						bajaAlimento(alimento, lector);

						break;
						
					case 4: 
						modificarAlimento(alimento, lector);

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
					System.out.println("1- Ingresar un Producto de electronica");
					System.out.println("2- Mostrar Lista de Electronica");
					System.out.println("3- Eliminar Producto");
					System.out.println("4- Modificar Producto");
					System.out.println("5- Salir");
					opcion = lector.nextInt();
					
					//Switch Electronica

					switch (opcion) {
					case 1:
						altaElectronica(ele, lector);

						break;
					
					case 2: 
						listarElectronica(ele);

						break;
						
					case 3: 
						bajaElectronica(ele, lector);

						break;
						
					case 4: 
						modificarElectronica(ele, lector);

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
					System.out.println("1- Ingresar un Producto de Ropa");
					System.out.println("2- Mostrar Lista de ROpa");
					System.out.println("3- Eliminar Ropa");
					System.out.println("4- Modificar Ropa");
					System.out.println("5- Salir");
					opcion = lector.nextInt();
					
					//Switch Ropa

					switch (opcion) {
					case 1:
						altaRopa(ropa, lector);

						break;
					
					case 2: 
						listarRopa(ropa);

						break;
						
					case 3: 
						bajaRopa(ropa, lector);

						break;
						
					case 4: 
						modificarRopa(ropa, lector);

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
	
	
//Electronica
	public static void altaElectronica(Electronica[] ele, Scanner lector) {

		System.out.println("\nPRODUCTO DE ELECTRONICA");
		System.out.print("Ingrese Nombre: ");
		String nombre = lector.next();
		System.out.print("Ingrese precio: ");
		Double precio = lector.nextDouble();
		System.out.print("Ingrese los años de garantia: ");
		int aGarantia = lector.nextInt();
		

		for (int i = 0; i < ele.length; i++) {
			if (ele[i] == null) {
				ele[i] = new Electronica(nombre, precio, aGarantia);
				break;
			}
		}

	}

	public static void listarElectronica(Electronica[] ele) {

		for (int i = 0; i < ele.length; i++) {
			if (ele[i] != null) {
				System.out.println("Producto N° " + i + ele[i].toString());

			} else {
				System.out.println("Pos N°" + i + "es null");
			}

		}

	}
	public static void bajaElectronica(Electronica[] ele, Scanner lector) {

		System.out.print("Ingrese el nombre del producto: ");
		String nombre = lector.next();

		for (int i = 0; i < ele.length; i++) {
			if (ele[i] != null && nombre.equals(ele[i].getNombre())) {
				ele[i] = null;
				System.out.println("→Borrado exitosamente");
			}
		}
	}
	
	private static void modificarElectronica(Electronica[] ele, Scanner lector) {
		
		System.out.print("Ingrese el nombre del producto: ");
		String nombre = lector.next();


		for (int i = 0; i < ele.length; i++) {
			if (ele[i] != null && nombre.equals(ele[i].getNombre())) {
				
				System.out.print("Ingrese el nuevo precio: ");
				int nPrecio = lector.nextInt();
				ele[i].setPrecio(nPrecio);
				System.out.println("→Cambiado exitosamente");
				break;
				
			}
		}
	}
	
//Alimento
	public static void altaAlimento(Alimento[] alimento, Scanner lector) {

		System.out.println("\nPRODUCTO DE ALIMENTO");
		System.out.print("Ingrese Nombre: ");
		String nombre = lector.next();
		System.out.print("Ingrese precio: ");
		Double precio = lector.nextDouble();
		System.out.print("Ingrese Fecha de Vencimiento: ");
		String feNac = lector.next();
		System.out.print("Ingrese lugar de creación: ");
		String lugarC = lector.next();

		for (int i = 0; i < alimento.length; i++) {
			if (alimento[i] == null) {
				alimento[i] = new Alimento(nombre, precio, feNac, lugarC);
				break;
			}
		}

	}

	public static void listarAlimentos(Alimento[] alimento) {

		for (int i = 0; i < alimento.length; i++) {
			if (alimento[i] != null) {
				System.out.println("Producto N° " + i + alimento[i].toString());

			} else {
				System.out.println("Pos N°" + i + "es null");
			}

		}

	}
	
	public static void bajaAlimento(Alimento[] alimento, Scanner lector) {

		System.out.print("Ingrese el nombre del producto: ");
		String nombre = lector.next();

		for (int i = 0; i < alimento.length; i++) {
			if (alimento[i] != null && nombre.equals(alimento[i].getNombre())) {
				alimento[i] = null;
				System.out.println("→Borrado exitosamente");
			}
		}
	}
	
	private static void modificarAlimento(Alimento[] alimento, Scanner lector) {
		
		System.out.print("Ingrese el nombre del producto: ");
		String nombre = lector.next();


		for (int i = 0; i < alimento.length; i++) {
			if (alimento[i] != null && nombre.equals(alimento[i].getNombre())) {
				
				System.out.print("Ingrese el nuevo precio: ");
				int nPrecio = lector.nextInt();
				alimento[i].setPrecio(nPrecio);
				System.out.println("→Cambiado exitosamente");
				break;
				
			}
		}
	}
	
//Ropa
	public static void altaRopa(Ropa[] ropa, Scanner lector) {

		System.out.println("\nPRODUCTO DE ALIMENTO");
		System.out.print("Ingrese Nombre: ");
		String nombre = lector.next();
		System.out.print("Ingrese precio: ");
		Double precio = lector.nextDouble();
		System.out.print("Ingrese talla: ");
		String talla = lector.next();
		System.out.print("Ingrese color: ");
		String color = lector.next();
		

		for (int i = 0; i < ropa.length; i++) {
			if (ropa[i] == null) {
				ropa[i] = new Ropa(nombre, precio, talla, color);
				break;
			}
		}

	}

	public static void listarRopa(Ropa[] ropa) {

		for (int i = 0; i < ropa.length; i++) {
			if (ropa[i] != null) {
				System.out.println("Producto N° " + i + ropa[i].toString());

			} else {
				System.out.println("Pos N°" + i + "es null");
			}

		}

	}
	
	public static void bajaRopa(Ropa[] ropa, Scanner lector) {

		System.out.print("Ingrese el nombre del producto: ");
		String nombre = lector.next();

		for (int i = 0; i < ropa.length; i++) {
			if (ropa[i] != null && nombre.equals(ropa[i].getNombre())) {
				ropa[i] = null;
				System.out.println("→Borrado exitosamente");
			}
		}
	}
	
	private static void modificarRopa(Ropa[] ropa, Scanner lector) {
		
		System.out.print("Ingrese el nombre del producto: ");
		String nombre = lector.next();


		for (int i = 0; i < ropa.length; i++) {
			if (ropa[i] != null && nombre.equals(ropa[i].getNombre())) {
				
				System.out.print("Ingrese el nuevo precio: ");
				int nPrecio = lector.nextInt();
				ropa[i].setPrecio(nPrecio);
				System.out.println("→Cambiado exitosamente");
				break;
				
			}
		}
	}
}
