package ex05_JComboBox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		//Instanciar JFrame
				JFrame formulario = new JFrame();
				formulario.setVisible(true);
				formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				formulario.setSize(500, 300);
				formulario.setLocationRelativeTo(null);
				formulario.setTitle("Utilizando JComboBox");
				formulario.setLayout(null);
				
				//JComboBox
				JComboBox<String> combo = new JComboBox<>();
				combo.setBounds(10, 10, 270, 30);
				combo.addItem("ITEM 01");
				combo.addItem("ITEM 02");
				combo.addItem("ITEM 03");
				
				//A��o combo
				combo.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						
						JOptionPane.showMessageDialog(null, combo.getSelectedItem());
						
					}
				});
				
				//Adicionar ao JFrame
				formulario.add(combo);
				
				//Exibir os componentes
				formulario.setVisible(true);

	}

}
