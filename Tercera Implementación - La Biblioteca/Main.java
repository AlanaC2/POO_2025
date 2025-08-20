package RegistroLibro;

public class Main {

	Libro[] libros = new Libro[10]; 

	public static void main(String[] args) {

		Presentacion v1 = new Presentacion();
		v1.setVisible(true);
		
	}

	public boolean registrarLibro( String isbn, String titulo, String autor) {
		
		boolean resultado = false;
        for (int i = 0; i < libros.length; i++) {
            if (libros[i] == null) {
                libros[i] = new Libro(isbn, titulo, autor);
                resultado = true;
                
                break;
            }
        }
        return resultado;
    }
	
	public void listarLibros() {

	    System.out.println("\nLISTA DE LIBROS");
	    for (int i = 0; i < libros.length; i++) {
	        if (libros[i] != null) {
	        	System.out.println("\nLibro " + (i +1) + ":");
	            System.out.println("ISBN: " + libros[i].getIsbn() +" Título: " + libros[i].getTitulo() + 
	                               " Autor: " + libros[i].getAutor());
	        }
	    }
	}
    
}
