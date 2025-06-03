package PracticoIV;

public class Pintura extends ObraArte{

	private String tPintura;
	private String superficie;
	private String tecnica;
	
	public Pintura(String nombre, String autor, String añoCreacion, String tPintura, String superficie, String tecnica) {
		super(nombre, autor, añoCreacion);
		this.tPintura = tPintura;
		this.superficie = superficie;
		this.tecnica = tecnica;
	}

	public String gettPintura() {
		return tPintura;
	}

	public void settPintura(String tPintura) {
		this.tPintura = tPintura;
	}

	public String getSuperficie() {
		return superficie;
	}

	public void setSuperficie(String lugar) {
		this.superficie = lugar;
	}

	public String getTecnica() {
		return tecnica;
	}

	public void setTecnica(String tecnica) {
		this.tecnica = tecnica;
	}

	@Override
	public String toString() {
		return "\nNombre: "+ getNombre() + "\nAutor: " + getAutor() + "\nAño de Creación: " + getAñoCreacion() +
				"\nTipo de Pintura: " + tPintura + "\nSuperficie: " + superficie + "\nTecnica: " + tecnica;
	}
	
	
}
