package ex03_JTextField;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Instanciar JFrame
				JFrame formulario = new JFrame();
				formulario.setVisible(true);
				formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				formulario.setSize(500, 300);
				formulario.setLocationRelativeTo(null);
				formulario.setTitle("Utilizando JTextField");
				formulario.setLayout(null);
				
				//JLabel
				JLabel rotulo = new JLabel();
				rotulo.setBounds(10, 10, 110, 20);
				rotulo.setText("Informe seu nome");
				
				//JTextField
				JTextField campo = new JTextField();
				campo.setBounds(120, 10, 150, 20);
				
				//Adicionar elementos ao JFrame
				formulario.add(rotulo);
				formulario.add(campo);
				
				//Exibir formulário
				formulario.setVisible(true);
	}

}
