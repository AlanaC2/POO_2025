package PracticoI;

public class Alimento extends Producto{

	private String fechaVencimiento;
	private String lugarC;
	
	
	public Alimento(String nombre, double precio, String fechaVencimiento, String lugarC) {
		super(nombre, precio);
		this.fechaVencimiento = fechaVencimiento;
		this.lugarC = lugarC;
	}

	public String getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(String fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public String getLugarC() {
		return lugarC;
	}

	public void setLugarC(String lugarC) {
		this.lugarC = lugarC;
	}

	@Override
	public String toString() {
		return "\nNombre: " + getNombre() + "\nPrecio: " + getPrecio() + "\nFecha de Vencimiento: " + fechaVencimiento + 
				"\nLugar de creación: " + lugarC;
	}
	
	
}
