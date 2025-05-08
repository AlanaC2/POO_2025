package E_1;

import java.util.Scanner;

public class Triangulo extends Figura_Geometrica{

	String tipo;
	double base;
	double altura;

	
	public Triangulo(double a, double p, String tipo, double base, double altura) {
		super(a, p);
		this.tipo = tipo;
		this.base = base;
		this.altura = altura;
		
	}
	@Override
	public String toString() {
		return "\nArea: " + area + "\nPerimetro: " + perimetro + "\nTipo: " + tipo + "\nBase: " + base + "\nAltura: " + altura;
	}
public static void main(String[] args) {
	Scanner lector = new Scanner(System.in);
	
	
	System.out.println("Ingrese el area: ");
	double area = lector.nextDouble();
	System.out.println("Ingrese el perimetro: ");
	double per = lector.nextDouble();
	System.out.println("Ingrese el tipo: ");
	String tipo = lector.next();
	System.out.println("Ingrese la base : ");
	double base = lector.nextDouble();
	System.out.println("Ingrese la altura: ");
	double alt = lector.nextDouble();
	
	Triangulo t1 = new Triangulo(area, per, tipo, base, alt);
	
	System.out.println(t1);
}
	
}
