package RegistroLibro;

import java.awt.*;

import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Presentacion extends JFrame{
	
	Main logica = new Main();
	
	public Presentacion() {

		this.setTitle("Registrar Libro");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 400);
		this.setLocationRelativeTo(null);

		JPanel p = new JPanel(new BorderLayout(50, 15));
		p.setBorder(new EmptyBorder(20, 30, 20, 30));

		JLabel lblC = new JLabel("Registrar Libro", JLabel.LEFT);
		lblC.setFont(new Font("Arial", Font.BOLD, 20));
		p.add(lblC, BorderLayout.NORTH);



		JPanel p1 = new JPanel(new GridLayout(6, 1, 5, 10));

		JLabel lblISBN = new JLabel("ISBN");
		JTextField txf1 = new JTextField();
		JLabel lblTitulo = new JLabel("Título");
		JTextField txf2 = new JTextField();
		JLabel lblAutor = new JLabel("Autor");
		JTextField txf3 = new JTextField();

		p1.add(lblISBN);
		p1.add(txf1);
		p1.add(lblTitulo);
		p1.add(txf2);
		p1.add(lblAutor);
		p1.add(txf3);

		p.add(p1, BorderLayout.CENTER);

		JPanel p2 = new JPanel();
		p2.setLayout(new GridLayout(5,1,10,10));

		JButton btnRegistrar = new JButton("Registrar Libro");
		JButton btnListar = new JButton("Listar Libros");
		JLabel lblMsj = new JLabel();
		
		
		p2.add(btnRegistrar);
		p2.add(btnListar);
		p2.add(lblMsj);

		p.add(p2, BorderLayout.EAST);

		this.add(p);

		
		btnRegistrar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String isbn = txf1.getText();
				String tit = txf2.getText();
				String autor = txf3.getText();
				
				if(logica.registrarLibro(isbn, tit, autor)) {
					lblMsj.setText("Registrado Exitosamente");
					txf1.setText("");
					txf2.setText("");
					txf3.setText("");
				} 
			}
		});
		
		btnListar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
		        logica.listarLibros(); 
			}
		});
	}
}
