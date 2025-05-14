package Ejercicio;

public class Auto extends Vehiculo{

	private double precio;
	private int añoFab;
	
	
	public Auto(String matricula, String marca, String modelo, double precio, int añoFab) {
		super(matricula, marca, modelo);
		this.precio = precio;
		this.añoFab = añoFab;
	}
	
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getAñoFab() {
		return añoFab;
	}
	public void setAñoFab(int añoFab) {
		this.añoFab = añoFab;
	}

	@Override
	public String toString() {
		return "Matricula" + getMatricula() + "\nMarca" + getMarca() + "\nModelo" + getModelo() +
				"\nPrecio: " + getPrecio() + "\nAño de Fabricacion: " + getAñoFab();
	}

	
}
