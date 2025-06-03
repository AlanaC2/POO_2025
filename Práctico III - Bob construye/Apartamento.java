package PracticoIII;

public class Apartamento extends Edificio{

	private int nPiso;
	private int numApartamento;
	private String amenidades;
	
	
	public Apartamento(String direccion, double precio, int numHabitaciones, int numPisos, int nPiso,
			int numApartamento, String amenidades) {
		super(direccion, precio, numHabitaciones, numPisos);
		this.nPiso = nPiso;
		this.numApartamento = numApartamento;
		this.amenidades = amenidades;
	}


	public int getnPiso() {
		return nPiso;
	}


	public void setnPiso(int nPiso) {
		this.nPiso = nPiso;
	}


	public int getNumApartamento() {
		return numApartamento;
	}


	public void setNumApartamento(int numApartamento) {
		this.numApartamento = numApartamento;
	}


	public String getAmenidades() {
		return amenidades;
	}


	public void setAmenidades(String amenidades) {
		this.amenidades = amenidades;
	}


	@Override
	public String toString() {
		return "\nDirección: " + getDireccion() + "\nPrecio" + getPrecio() + "\nNumero de Habitaciones: " + getNumHabitaciones()
		+ "\nCantidad de pisos: " + getNumPisos() + "\nNumero de Piso: " + nPiso + "\nNumero de Apartamento: " + 
				numApartamento + "\nAmenidades: " + amenidades;
	}

	
	
}
