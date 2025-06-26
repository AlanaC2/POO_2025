package SW_GestionyClientes;

public class Alterno extends Persona implements Mail{
	private int aExperiencia;

	public Alterno(String nombre, String apellido, String fechaNac, int ci, int aExperiencia) {
		super(nombre, apellido, fechaNac, ci);
		this.aExperiencia = aExperiencia;
	}

	public int getaExperiencia() {
		return aExperiencia;
	}

	public void setaExperiencia(int aExperiencia) {
		this.aExperiencia = aExperiencia;
	}

	@Override
	public void enviar(int op) {
		if (op == 2 ) {
			System.out.println("Enviar mensaje");
		} else {
			System.out.println("No es posible enviar este mensaje");
		
		}					
	}
}
