package atividade2_JDialog;

import javax.swing.JDialog;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JDialogDemo {

	private JanelaPrincipal jan;

	public JDialogDemo(JanelaPrincipal j) {
		this.jan = j;
		JDialog diag = new JDialog (jan, false);
		diag.setTitle("Dire\u00E7\u00E3o");
		//componete pai: jan
		diag.setBounds(100, 100, 300, 150);
		diag.getContentPane().setLayout(null);
		
		JButton btnUp = new JButton("UP");
		btnUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jan.getLblDireoMensagem().setText("UP");
			}
		});
		btnUp.setBounds(26, 30, 89, 23);
		diag.getContentPane().add(btnUp);
		
		JButton btnDown = new JButton("Down");
		btnDown.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jan.getLblDireoMensagem().setText("DOWN");
			}
		});
		btnDown.setBounds(129, 30, 89, 23);
		diag.getContentPane().add(btnDown);
		
		JLabel lblPressioneUmBoto = new JLabel("Pressione um bot\u00E3o");
		lblPressioneUmBoto.setBounds(80, 75, 94, 14);
		diag.getContentPane().add(lblPressioneUmBoto);
		
		diag.setVisible(true);
	}
}
