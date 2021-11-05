package atividade5;

import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JRadioButton;


public class JDialogDemo3 extends JDialog {

	private JanelaPrincipal jan;
	private JLabel labelPergunta;
	private JRadioButton alternativa1;
	private JRadioButton alternativa2;
	private JRadioButton alternativa3;
	private JRadioButton alternativa4;
	private JRadioButton alternativa5;
	private JButton buttonVerifica;

	public JDialogDemo3(JanelaPrincipal j) {
		this.jan = j;
		setTitle("Question\u00E1rio");
		setBounds(100, 100, 500, 300);
		getContentPane().setLayout(null);

		labelPergunta = new JLabel("");
		labelPergunta.setBounds(7, 7, 375, 20);
		labelPergunta.setFont(new Font("Dialog", Font.BOLD, 15));
		getContentPane().add(labelPergunta);

		alternativa1 = new JRadioButton("");
		alternativa1.setBounds(7, 42, 386, 23);
		getContentPane().add(alternativa1);

		alternativa2 = new JRadioButton("");
		alternativa2.setBounds(7, 80, 386, 23);
		getContentPane().add(alternativa2);

		alternativa3 = new JRadioButton("");
		alternativa3.setBounds(7, 117, 386, 23);
		getContentPane().add(alternativa3);

		alternativa4 = new JRadioButton("");
		alternativa4.setBounds(7, 155, 375, 23);
		getContentPane().add(alternativa4);

		alternativa5 = new JRadioButton("");
		alternativa5.setBounds(7, 193, 386, 23);
		getContentPane().add(alternativa5);

		ButtonGroup bg = new ButtonGroup();
		bg.add(alternativa1);
		bg.add(alternativa2);
		bg.add(alternativa3);
		bg.add(alternativa4);
		bg.add(alternativa5);

		buttonVerifica = new JButton("Verificar resposta");
		buttonVerifica.setBounds(293, 227, 181, 23);
		getContentPane().add(buttonVerifica);

	}

	public JLabel getLabelPergunta() {
		return labelPergunta;
	}

	public void setLabelPergunta(JLabel labelPergunta) {
		this.labelPergunta = labelPergunta;
	}

	public JButton getButtonVerifica() {
		return buttonVerifica;
	}

	public void setButtonVerifica(JButton buttonVerifica) {
		this.buttonVerifica = buttonVerifica;
	}

	public JRadioButton getAlternativa1() {
		return alternativa1;
	}

	public void setAlternativa1(JRadioButton alternativa1) {
		this.alternativa1 = alternativa1;
	}

	public JRadioButton getAlternativa2() {
		return alternativa2;
	}

	public void setAlternativa2(JRadioButton alternativa2) {
		this.alternativa2 = alternativa2;
	}

	public JRadioButton getAlternativa3() {
		return alternativa3;
	}

	public void setAlternativa3(JRadioButton alternativa3) {
		this.alternativa3 = alternativa3;
	}

	public JRadioButton getAlternativa4() {
		return alternativa4;
	}

	public void setAlternativa4(JRadioButton alternativa4) {
		this.alternativa4 = alternativa4;
	}

	public JRadioButton getAlternativa5() {
		return alternativa5;
	}

	public void setAlternativa5(JRadioButton alternativa5) {
		this.alternativa5 = alternativa5;
	}

}
