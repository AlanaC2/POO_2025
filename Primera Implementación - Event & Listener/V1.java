package Ejercicios;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class V1 extends JFrame{
	
	public V1() {
		this.setTitle("Agregar Persona");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 300);
        this.setLocationRelativeTo(null); 
        
        JPanel p1 = new JPanel(new GridLayout(2,2,10,10));
        
        JLabel lblNom = new JLabel("Nombre");
        JLabel lblApe = new JLabel("Apellido");
        
        JTextField txf1 = new JTextField();
        JTextField txf2 = new JTextField();
        
        JPanel pBtn = new JPanel(new FlowLayout());
        JButton btn1 = new JButton("Mostrar"); 
        pBtn.add(btn1);
        
        
        p1.add(lblNom);
        p1.add(txf1);
        p1.add(lblApe);
        p1.add(txf2);
        
        this.add(p1, BorderLayout.CENTER);
        this.add(pBtn, BorderLayout.SOUTH);
        
        btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String nom = txf1.getText();
				String ape = txf2.getText();
				
				System.out.println("Nombre: " + nom + " " + ape);				
			}
		});
    }

}
