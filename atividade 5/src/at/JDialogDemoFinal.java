package at;

import javax.swing.JDialog;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JDialogFinal extends JDialog {

	private JanelaPrincipal jan;
	private JLabel labelRespostasCertas;
	private JLabel labelRespostasErradas;

	public JDialogFinal(JanelaPrincipal j) {
		// TODO Auto-generated constructor stub
		this.jan = j;
		setTitle("Resultado Final");
		setBounds(100, 100, 380, 245);
		getContentPane().setLayout(null);

		labelRespostasCertas = new JLabel("Respostas Corretas: ");
		labelRespostasCertas.setFont(new Font("Tahoma", Font.PLAIN, 25));
		labelRespostasCertas.setBounds(10, 35, 321, 31);
		getContentPane().add(labelRespostasCertas);

		labelRespostasErradas = new JLabel("Respostas Erradas: ");
		labelRespostasErradas.setFont(new Font("Tahoma", Font.PLAIN, 25));
		labelRespostasErradas.setBounds(10, 77, 321, 31);
		getContentPane().add(labelRespostasErradas);

		JButton buttonSair = new JButton("Sair");
		buttonSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}

		});
		buttonSair.setBounds(260, 170, 94, 25);
		getContentPane().add(buttonSair);
	}

	public JLabel getLabelRespostasCertas() {
		return labelRespostasCertas;
	}

	public void setLabelRespostasCertas(JLabel labelRespostasCertas) {
		this.labelRespostasCertas = labelRespostasCertas;
	}

	public JLabel getLabelRespostasErradas() {
		return labelRespostasErradas;
	}

	public void setLabelRespostasErradas(JLabel labelRespostasErradas) {
		this.labelRespostasErradas = labelRespostasErradas;
	}

}