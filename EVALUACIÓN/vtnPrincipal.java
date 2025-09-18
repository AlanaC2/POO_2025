package evaluacion;

import java.awt.BorderLayout;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class vtnPrincipal extends JFrame {

	Logica gestor = new Logica();

	public vtnPrincipal() {

		this.setTitle("Ventana");
		this.setSize(600, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);

		JButton btnListar = new JButton("Listar Productos");
		String[] filas = { "ID", "Producto", "Precio" };

		DefaultTableModel modelo = new DefaultTableModel(null, filas);

		JTable tabla = new JTable(modelo);

		JScrollPane scr = new JScrollPane(tabla);

		this.add(btnListar, BorderLayout.NORTH);
		this.add(scr, BorderLayout.CENTER);

		btnListar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				gestor.listarProducto(modelo);
			}
		});

	}

}
