package ABMLIII;

public class Apartamento extends Edificio{

	private int nPiso;
	private int numApartamento;

	
	public Apartamento(String direccion, double precio, int nPiso, int numApartamento) {
		super(direccion, precio);
		this.nPiso = nPiso;
		this.numApartamento = numApartamento;
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



	@Override
	public String toString() {
		return "\nDIRECCIÓN: " + getDireccion() + "\nPRECIO: " + getPrecio()+ "\nNUMERO DE PISO: " + nPiso + "\nNUMERO DE APARTAMENTO: " + 
				numApartamento +'\n';
	}

	
	
}
