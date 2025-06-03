package PracticoIV;

public class ObraArte {

	private String nombre;
	private String autor;
	private String añoCreacion;
	
	public ObraArte(String nombre, String autor, String añoCreacion) {
		super();
		this.nombre = nombre;
		this.autor = autor;
		this.añoCreacion = añoCreacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getAñoCreacion() {
		return añoCreacion;
	}

	public void setAñoCreacion(String añoCreacion) {
		this.añoCreacion = añoCreacion;
	}
	
	
}
