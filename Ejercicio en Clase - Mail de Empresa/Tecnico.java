package SW_GestionyClientes;

public class Tecnico extends Persona implements Mail{
	private String especialidad;

	public Tecnico(String nombre, String apellido, String fechaNac, int ci, String especialidad) {
		super(nombre, apellido, fechaNac, ci);
		this.especialidad = especialidad;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

@Override
public void enviar(int op) {
System.out.println("Enviar mensaje");}

}
