package ABMLII;

public class ArtCientifico extends Publicacion{
	
	private int numPaginas;
	private String areaInvestigacion;
	
	

	public ArtCientifico(String titulo, String autor, int numPaginas, String areaInvestigacion) {
		super(titulo, autor);
		this.numPaginas = numPaginas;
		this.areaInvestigacion = areaInvestigacion;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

	public String getAreaInvestigacion() {
		return areaInvestigacion;
	}

	public void setAreaInvestigacion(String areaInvestigacion) {
		this.areaInvestigacion = areaInvestigacion;
	}


	@Override
	public String toString() {
		return "\nTITULO: " + getTitulo()+ "\nAUTOR: " + getAutor() + "\nNUMERO DE PAGINAS: " + numPaginas + "\nAREA DE INVESTIGACIÓN: " 
	+ areaInvestigacion + '\n';
	}
	
	

}
