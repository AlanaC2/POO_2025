package PracticoII;

public class Publicacion {

	private String titulo;
	private String fechaPublicacion;
	private String autor;
	
	public Publicacion(String titulo, String fechaPublicacion, String autor) {
		super();
		this.titulo = titulo;
		this.fechaPublicacion = fechaPublicacion;
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getFechaPublicacion() {
		return fechaPublicacion;
	}

	public void setFechaPublicacion(String fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	
	
}
