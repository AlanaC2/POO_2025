package E_1;
import java.util.Scanner;
public class Moto extends Vehiculo{
	
	String tipo;

	public Moto(String marca, String modelo, int añoFabricacion, double vMaxima, String color, String tipo) {
		super(marca, modelo, añoFabricacion, vMaxima, color);
		this.tipo = tipo;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\nMarca: "+marca+"\nModelo: "+modelo+"\nAño de Fabricacion: "+añoFabricacion+"\nVelocidad maxima: "+vMaxima+"\nColor: "+color+"\nTipo: "+tipo;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese la marca: ");
		String marca = sc.next();
		System.out.println("Ingrese el modelo: ");
		String modelo = sc.next();
		System.out.println("Ingrese el año en que se fabrico: ");
		int añoFabricacion = sc.nextInt();
		System.out.println("Ingrese la velocidad limite: ");
		double vMaxima = sc.nextDouble();
		System.out.println("Ingrese el color: ");
		String color = sc.next();
		System.out.println("Ingrese el tipo: ");
        String tipo = sc.next();
        
		Vehiculo M = new Moto(marca, modelo, añoFabricacion, vMaxima, color, tipo);
		
		System.out.println(M);
		}
}
