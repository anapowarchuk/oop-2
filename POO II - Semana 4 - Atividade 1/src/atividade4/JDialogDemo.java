package atividade4;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class JDialogDemo {

		
	private JanelaPrincipal jan;
	
	public JDialogDemo(JanelaPrincipal j) {
		this.jan= j;
		JDialog diag = new JDialog(jan);
		diag.setBounds(100, 100, 300, 150);
		
		
		if (j.getRadioButton100().isSelected()) {
			JOptionPane.showMessageDialog(null, "Alternativa correta");	
		}
		else {
			JOptionPane.showMessageDialog(null, "Alternativa errada!");
		}
		
	}
	
}
