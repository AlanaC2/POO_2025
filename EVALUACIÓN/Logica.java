package evaluacion;

import javax.swing.table.DefaultTableModel;

public class Logica {

	MySQL bd = new MySQL();
	
	public static void main(String[] args) {
		vtnPrincipal v1 = new vtnPrincipal();
		v1.setVisible(true);
	}
	
	public void listarProducto (DefaultTableModel modelo) {
		bd.listarProductos(modelo);
	}
}
