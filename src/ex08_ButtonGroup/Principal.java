package ex08_ButtonGroup;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//JFrame
		JFrame formulario = new JFrame("Usando ButtonGroup");
		formulario.setSize(500, 300);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		
		//JRadioButton
		JRadioButton turnoMatutino = new JRadioButton("Matutino");
		turnoMatutino.setBounds(10, 10, 100, 20);
		turnoMatutino.setActionCommand("Matutino");
		
		JRadioButton turnoVespertino = new JRadioButton("Vespertino");
		turnoVespertino.setBounds(110, 10, 100, 20);
		turnoVespertino.setActionCommand("Vespertino");
		
		JRadioButton turnoNoturno = new JRadioButton("Noturno");
		turnoNoturno.setBounds(210, 10, 100, 20);
		turnoNoturno.setActionCommand("Noturno");
		
		//ButtonGroup
		ButtonGroup turnos = new ButtonGroup();
		turnos.add(turnoNoturno);
		turnos.add(turnoVespertino);
		turnos.add(turnoMatutino);
		
		//JButton
		JButton botao = new JButton("Verificar turno");
		botao.setBounds(50, 50, 200, 20);
		
		//A��o
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				try{
				JOptionPane.showMessageDialog(null, turnos.getSelection().getActionCommand());
				}catch(Exception erro){
					JOptionPane.showMessageDialog(null, "Selecionar turno");
				}
			}
		});
		
		//Adicionar componentes
		formulario.add(turnoNoturno);
		formulario.add(turnoVespertino);
		formulario.add(turnoMatutino);
		formulario.add(botao);
		
		//Exibir formul�rio e seus componentes
		formulario.setVisible(true);
	}

}
