package PracticoII;

public class ArtCientifico extends Publicacion{
	
	private String doi;
	private int numPaginas;
	private String areaInvestigacion;
	private String institucionA;
	
	public ArtCientifico(String titulo, String fechaPublicacion, String autor, String doi, int numPaginas,
			String areaInvestigacion, String institucionA) {
		super(titulo, fechaPublicacion, autor);
		this.doi = doi;
		this.numPaginas = numPaginas;
		this.areaInvestigacion = areaInvestigacion;
		this.institucionA = institucionA;
	}

	public String getDoi() {
		return doi;
	}

	public void setDoi(String doi) {
		this.doi = doi;
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

	public String getInstitucionA() {
		return institucionA;
	}

	public void setInstitucionA(String institucionA) {
		this.institucionA = institucionA;
	}

	@Override
	public String toString() {
		return "\nTitulo: " + getTitulo() + "\nFecha de Publicación: " + getFechaPublicacion() + "\nAutor: " + getAutor() + 
				"\nDOI: " + doi + "\nNumero de Paginas: " + numPaginas + "\nArea de investigación: " + areaInvestigacion
				+ "\nInstituacion Afiliada: " + institucionA ;
	}
	
	

}
