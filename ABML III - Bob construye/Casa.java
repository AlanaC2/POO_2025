package ABMLIII;

public class Casa extends Edificio{

	private double tTerreno;
	private String material;
	
	
	public Casa(String direccion, double precio, double tTerreno, String material) {
		super(direccion, precio);
		this.tTerreno = tTerreno;
		this.material = material;
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



	@Override
	public String toString() {
		return "\nDIRECCIÓN: " + getDireccion() + "\nPRECIO: " + getPrecio()+"\nTAMAÑO DEL TERRENO: " + tTerreno + "\nMATERIAL: " 
	+ material + '\n';
	}
	
	
}
