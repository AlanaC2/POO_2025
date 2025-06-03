package PracticoI;

public class Ropa extends Producto{

	private String talla;
	private String color;
	
	public Ropa(String nombre, double precio, String talla, String color) {
		super(nombre, precio);
		this.talla = talla;
		this.color = color;
	}
	
	public String getTalla() {
		return talla;
	}
	public void setTalla(String talla) {
		this.talla = talla;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "\nNombre: " + getNombre() + "\nPrecio: " + getPrecio() + "\nTalla: " + talla + "\nColor: " + color;
	}
	
	
	
}
