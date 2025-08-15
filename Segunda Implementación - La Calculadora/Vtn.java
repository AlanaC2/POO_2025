package Calculadora;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Vtn extends JFrame{

	public Vtn() {
		this.setTitle("Calculadora");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 250);
        this.setLocationRelativeTo(null);
        this.setLayout(new GridLayout(3,1));
        
        JPanel p1 = new JPanel(new GridLayout(2, 2, 5, 5));
        
        JLabel lblN1 = new JLabel("Número 1");
        JLabel lblN2 = new JLabel("Número 2");
        
        JTextField txf1 = new JTextField();
        JTextField txf2 = new JTextField();
        
        JPanel p2 = new JPanel();
        
        JLabel lblResultado = new JLabel("El Resultado es: ");
        
        JPanel p3 = new JPanel();
        
        JButton btnSuma = new JButton("+");
        JButton btnResta = new JButton("-");
        JButton btnMult = new JButton("x");
        JButton btnDiv = new JButton("/");
        
        this.add(p1);
        this.add(p2);
        this.add(p3);
        
        p1.add(lblN1);
        p1.add(txf1);
        p1.add(lblN2);
        p1.add(txf2);
        
        p2.add(lblResultado);
        
        p3.add(btnSuma);
        p3.add(btnResta);
        p3.add(btnMult);
        p3.add(btnDiv);

        btnSuma.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

		    float n1 = Float.parseFloat(txf1.getText());
		    float n2 = Float.parseFloat(txf2.getText());
		    
			lblResultado.setText("El resultado es: " + (n1+n2)); 


			}
		});
        
       btnResta.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
		    float n1 = Float.parseFloat(txf1.getText());
			float n2 = Float.parseFloat(txf2.getText());
			    
			lblResultado.setText("El resultado es: " + (n1-n2)); 			
		}
	});
       
       
       btnMult.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			 float n1 = Float.parseFloat(txf1.getText());
			 float n2 = Float.parseFloat(txf2.getText());
			    
			lblResultado.setText("El resultado es: " + (n1*n2)); 			
		}
	});
       
       
       btnDiv.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			 float n1 = Float.parseFloat(txf1.getText());
			 float n2 = Float.parseFloat(txf2.getText());
			    
				lblResultado.setText("El resultado es: " + (n1/n2)); 			
		}
	});

	}
}
