package PracticoII;

public class Revista extends Publicacion{
	
	private String issn;
	private int numEdicion;
	private String editorial;
	private String pais;
	
	public Revista(String titulo, String fechaPublicacion, String autor, String issn, int numEdicion, String editorial,
			String pais) {
		super(titulo, fechaPublicacion, autor);
		this.issn = issn;
		this.numEdicion = numEdicion;
		this.editorial = editorial;
		this.pais = pais;
	}

	public String getIssn() {
		return issn;
	}

	public void setIssn(String issn) {
		this.issn = issn;
	}

	public int getNumEdicion() {
		return numEdicion;
	}

	public void setNumEdicion(int numEdicion) {
		this.numEdicion = numEdicion;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	@Override
	public String toString() {
		return "\nTitulo: " + getTitulo() + "\nFecha de Publicación: " + getFechaPublicacion() + "\nAutor: " + getAutor() +
				"\nISSN: " + issn + "\nNumero de edición: " + numEdicion + "\nEditorial: " + editorial + "\nPais: " + pais;
	}
	
	

}
