package ABMLIII;

public class Edificio {

	private String direccion;
	private double precio;
	
	
	public Edificio(String direccion, double precio) {
		super();
		this.direccion = direccion;
		this.precio = precio;
		
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
	
	
}
