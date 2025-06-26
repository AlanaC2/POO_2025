package SW_GestionyClientes;

public class Encargado extends Persona implements Mail{
	private String departamento;

	public Encargado(String nombre, String apellido, String fechaNac, int ci, String departamento) {
		super(nombre, apellido, fechaNac, ci);
		this.departamento = departamento;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	
	@Override
	public void enviar(int op) {
		if (op == 1 ) {
			System.out.println("Enviar mensaje");
		} else {
			System.out.println("No es posible enviar este mensaje");
		
		}			
	}

}
