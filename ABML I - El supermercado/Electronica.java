package ABMLI;

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
		return "\nNOMBRE: " + getNombre() + "\nPRECIO: " + getPrecio() + "\nAÑOS DE GARANTÍA: " + aGarantia + '\n';
	}

	
	
	
}
