package PracticoIV;

public class Fotografia extends ObraArte{

	private String formato;
	private String resolucion;
	private String lugar;
	
	public Fotografia(String nombre, String autor, String añoCreacion, String formato, String resolucion,
			String lugar) {
		super(nombre, autor, añoCreacion);
		this.formato = formato;
		this.resolucion = resolucion;
		this.lugar = lugar;
	}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

	public String getResolucion() {
		return resolucion;
	}

	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	@Override
	public String toString() {
		return "\nNombre: " + getNombre() + "\nAutor: " + getAutor() + "\nAño de Creación: " + getAñoCreacion() + 
				"\nFormato: " + formato + "\nResolución: " + resolucion + "\nLugar" + lugar;
	}
	
	
}
