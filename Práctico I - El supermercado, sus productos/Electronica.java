package PracticoI;

public class Electronica extends Producto{

	private int aGarantia;

	
	public Electronica(String nombre, double precio, int aGarantia) {
		super(nombre, precio);
		this.aGarantia = aGarantia;
	}

	public int getaGarantia() {
		return aGarantia;
	}

	public void setaGarantia(int aGarantia) {
		this.aGarantia = aGarantia;
	}

	@Override
	public String toString() {
		return "\nNombre: " + getNombre() + "\nPrecio: " + getPrecio() + "\nAños de Garantia: " + aGarantia;
	}

	
	
	
}
