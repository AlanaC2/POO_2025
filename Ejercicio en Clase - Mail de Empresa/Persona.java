package SW_GestionyClientes;

public class Persona{

	private String nombre;
	private String apellido;
	private String FechaNac;
	private int ci;
	
	public Persona(String nombre, String apellido, String fechaNac, int ci) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		FechaNac = fechaNac;
		this.ci = ci;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getFechaNac() {
		return FechaNac;
	}

	public void setFechaNac(String fechaNac) {
		FechaNac = fechaNac;
	}

	public int getCi() {
		return ci;
	}

	public void setCi(int ci) {
		this.ci = ci;
	}
	
		
}
