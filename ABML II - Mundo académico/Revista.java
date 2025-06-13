package ABMLII;

public class Revista extends Publicacion{
	
	private String editorial;
	private String pais;
	
	public Revista(String titulo, String autor, String editorial,
			String pais) {
		super(titulo, autor);
		
		this.editorial = editorial;
		this.pais = pais;
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
		return "\nTITULO: " + getTitulo() + "\nAUTOR: " + getAutor() +
				 "\nEDITORIAL: " + editorial + "\nPAIS: " + pais + '\n';
	}
	
	

}
