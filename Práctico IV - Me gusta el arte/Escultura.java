package PracticoIV;

public class Escultura extends ObraArte{

	private String material;
	private int altura;
	private int peso;
	private String tecnica;
	
	public Escultura(String nombre, String autor, String añoCreacion, String material, int altura, int peso,
			String tecnica) {
		super(nombre, autor, añoCreacion);
		this.material = material;
		this.altura = altura;
		this.peso = peso;
		this.tecnica = tecnica;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public String getTecnica() {
		return tecnica;
	}

	public void setTecnica(String tecnica) {
		this.tecnica = tecnica;
	}

	@Override
	public String toString() {
		return "\nNombre: "+ getNombre() + "\nAutor: " + getAutor() + "\nAño de Creación: " + getAñoCreacion() + 
				"\nMaterial: " + material + "\nAltura: " + altura + "\nPeso" + peso + "\nTecnica" + tecnica ;
	}
	
	
}
