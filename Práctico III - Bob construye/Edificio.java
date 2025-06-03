package PracticoIII;

public class Edificio {

	private String direccion;
	private double precio;
	private int numHabitaciones;
	private int numPisos;
	
	public Edificio(String direccion, double precio, int numHabitaciones, int numPisos) {
		super();
		this.direccion = direccion;
		this.precio = precio;
		this.numHabitaciones = numHabitaciones;
		this.numPisos = numPisos;
	}
	
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getNumHabitaciones() {
		return numHabitaciones;
	}
	public void setNumHabitaciones(int numHabitaciones) {
		this.numHabitaciones = numHabitaciones;
	}
	public int getNumPisos() {
		return numPisos;
	}
	public void setNumPisos(int numPisos) {
		this.numPisos = numPisos;
	}
	
	
}
