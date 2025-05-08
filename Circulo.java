package E_1;

import java.util.Scanner;

public class Circulo extends Figura_Geometrica{

	double diametro;
	double radio;
	
	public Circulo( double a, double p, double diametro, double radio) {
		super( a, p);
		this.diametro = diametro;
		this.radio = radio;
	}
	
	@Override
	public String toString() {
		return "\nArea: " + area + "\nPerimetro: " + perimetro + "\nDiametro: " + diametro + "\nRadio: " + radio;
	}
public static void main(String[] args) {
	Scanner lector = new Scanner(System.in);
	
	
	System.out.println("Ingrese el area: ");
	double area = lector.nextDouble();
	System.out.println("Ingrese el perimetro: ");
	double per = lector.nextDouble();
	System.out.println("Ingrese el diametro: ");
	double diam = lector.nextDouble();
	System.out.println("Ingrese el radio: ");
	double radio = lector.nextDouble();
	
	Circulo c1 = new Circulo(area, per, diam, radio);
	
	System.out.println(c1);
}
	
}
