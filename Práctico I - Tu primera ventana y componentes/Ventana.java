package PracticoI;

import java.awt.FlowLayout;

import javax.swing.*;

public class Ventana extends JFrame{
	
	public Ventana() {
		this.setLayout(new FlowLayout());
		this.setTitle("Ventana y Componentes");
		this.setSize(600, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		JLabel lbn1 = new JLabel("Bienvenido a mi programa");
		JLabel lbn2 = new JLabel("Nombre: ");
		JTextField txf = new JTextField(10);
		JButton btn = new JButton("Aceptar");
		
		this.add(lbn1);
		this.add(lbn2);
		this.add(txf);
		this.add(btn);

	}

}
