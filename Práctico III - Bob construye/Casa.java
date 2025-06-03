package PracticoIII;

public class Casa extends Edificio{

	private double tTerreno;
	private String material;
	private boolean patio;
	
	public Casa(String direccion, double precio, int numHabitaciones, int numPisos, double tTerreno, String material,
			boolean patio) {
		super(direccion, precio, numHabitaciones, numPisos);
		this.tTerreno = tTerreno;
		this.material = material;
		this.patio = patio;
	}

	public double gettTerreno() {
		return tTerreno;
	}

	public void settTerreno(double tTerreno) {
		this.tTerreno = tTerreno;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public boolean isPatio() {
		return patio;
	}

	public void setPatio(boolean patio) {
		this.patio = patio;
	}

	@Override
	public String toString() {
		return "\nDirección: " + getDireccion() + "\nPrecio" + getPrecio() + "\nNumero de Habitaciones: " + getNumHabitaciones()
				+ "\nCantidad de pisos: " + getNumPisos() +"\nTamaño del Terreno: " + tTerreno + "\nMaterial: " + material + "\nPatio: " + patio;
	}
	
	
}
