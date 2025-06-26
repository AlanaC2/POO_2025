package SW_GestionyClientes;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		
		Encargado en1 = new Encargado("Alana", "Corbo", "20/08/2008", 5678, "Tecnologia");
		Tecnico te1 = new Tecnico("Gianina", "Da Silva", "01/05/2008", 245, "Fisica");
		Alterno al1 = new Alterno("Ramiro", "Sosa", "06/01/2001", 245, 2);
		
		int op;
		
		do {
			System.out.println("\nBienvenido");
			System.out.println("Eliga su rol");
			System.out.println("1- Encargado");
			System.out.println("2- Técnico");
			System.out.println("3- Alterno");
			System.out.println("4- Salir");
			System.out.println("Ingrese su opción: ");
			op = lector.nextInt();
			
			switch (op) {
			case 1:
				
				do {
					System.out.println("\nBienvenido Encargado: ");
					System.out.println("A quien decea enviarlo: ");
					System.out.println("1- Técnico");
					System.out.println("2- Alterno");
					System.out.println("3- Salir");
					System.out.print("Ingrese su opción: ");
					op = lector.nextInt();
					
					switch (op) {
					case 1:
						
						en1.enviar(op);
						System.out.println("Ingrese su mail: ");
						String mail = lector.next();
						
						
						
						break;
						
					case 2:
				
						en1.enviar(op);
						
						break;
						
					case 3:
						System.out.println("Regresando");
						break;
					
					default:
						System.out.println("Opcion incorrecta");
						break;
					}
					

				} while (op !=3);
			
				break;
				
			case 2:
				do {
					System.out.println("\nBienvenido Tecnico: ");
					System.out.println("A quien decea enviarlo: ");
					System.out.println("1- Encargado");
					System.out.println("2- Alterno");
					System.out.println("3- Salir");
					System.out.print("Ingrese su opción: ");
					op = lector.nextInt();
					
					switch (op) {
					case 1:
						
						te1.enviar(op);
						System.out.println("Ingrese su mail: ");
						String mail = lector.next();
						
						
						
						break;
						
					case 2:
				
						te1.enviar(op);
						System.out.println("Ingrese su mail: ");
						String mail2 = lector.next();
						
						break;
						
					case 3:
						System.out.println("Regresando");
						break;
					
					default:
						System.out.println("Opcion incorrecta");
						break;
					}
					

				} while (op !=3);				break;
				
			case 3:
				do {
					System.out.println("\nBienvenido Alterno: ");
					System.out.println("A quien decea enviarlo: ");
					System.out.println("1- Encargado");
					System.out.println("2- Tecnico");
					System.out.println("3- Salir");
					System.out.print("Ingrese su opción: ");
					op = lector.nextInt();
					
					switch (op) {
					case 1:
						
						al1.enviar(op);
						
						
						
						break;
						
					case 2:
				
						al1.enviar(op);
						System.out.println("Ingrese su mail: ");
						String mail = lector.next();
						
						break;
						
					case 3:
						System.out.println("Regresando");
						break;
					
					default:
						System.out.println("Opcion incorrecta");
						break;
					}
					

				} while (op !=3);				break;
				
			case 4:
				System.out.println("FIN");
				break;

			default:
				System.out.println("Opción incorrecta");
				break;
			}
		

		} while (op != 4);

	}

}
