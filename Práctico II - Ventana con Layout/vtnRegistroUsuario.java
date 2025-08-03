package RegistroUsuario;

import java.awt.*;
import javax.swing.*;

public class vtnRegistroUsuario extends JFrame{
 
	public vtnRegistroUsuario(){
		
		 this.setTitle("Registrar Usuario"); 
	     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     this.setSize(400, 450);
	     this.setLocationRelativeTo(null);  
	     this.setLayout(new GridLayout(1, 1));

	     JPanel p1 = new JPanel(new GridLayout(6, 2, 5, 5));
	     
	     JLabel lblNom = new JLabel("Nombre");
	     JTextField txfNom = new JTextField();
	        
	     JLabel lblApe = new JLabel("Apellido");
	     JTextField txfApe = new JTextField();
	        
	     JLabel lblCed = new JLabel("Cédula");
	     JTextField txfCed = new JTextField();
	        
	     JLabel lblEdad = new JLabel("Edad");
	     JTextField txtEdad = new JTextField();
	        
	     JLabel lblRol = new JLabel("Rol");
	     JComboBox cbRol = new JComboBox();
	     
	     JButton btn1 = new JButton("Registrar");

	     this.add(p1);
	     
	     p1.add(lblNom);
	     p1.add(txfNom);
	     p1.add(lblApe);
	     p1.add(txfApe);
	     p1.add(lblCed);
	     p1.add(txfCed);
	     p1.add(lblEdad);
	     p1.add(txtEdad);
	     p1.add(lblRol);
	     p1.add(cbRol);
	     p1.add(btn1);

	     this.setVisible(true);
	}
}
