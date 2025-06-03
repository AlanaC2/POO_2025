package PracticoII;

public class Libro extends Publicacion{

	private String isbn;
	private String editorial;
	private int numPaginas;
	
	public Libro(String titulo, String fechaPublicacion, String autor, String isbn, String editorial, int numPaginas) {
		super(titulo, fechaPublicacion, autor);
		this.isbn = isbn;
		this.editorial = editorial;
		this.numPaginas = numPaginas;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

	@Override
	public String toString() {
		return "\nTitulo: " + getTitulo() + "\nFecha de Publicación: " + getFechaPublicacion() + "\nAutor: " + getAutor() +"\nISBN: " + isbn + 
				"\nEditorial: " + editorial + "\nNumero de Paginas: " + numPaginas;
	}
	
	
}
