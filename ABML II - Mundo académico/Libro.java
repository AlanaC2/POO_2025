package ABMLII;

public class Libro extends Publicacion{

	private String isbn;
	private int numPaginas;
	
	public Libro(String titulo, String autor, String isbn, int numPaginas) {
		super(titulo, autor);
		this.isbn = isbn;
		this.numPaginas = numPaginas;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	
	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

	@Override
	public String toString() {
		return "\nTITULO: " + getTitulo() + "\nAUTOR: " + getAutor() +"\nISBN: " + isbn + 
				 "\nNUMERO DE PAGINAS: " + numPaginas + '\n';
	}
	
	
}
