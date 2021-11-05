package atividade4;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JanelaPrincipal extends JFrame {

	private JPanel contentPane;
	private JRadioButton radioButton10000;
	private JRadioButton radioButton1000;
	private JRadioButton radioButton100;
	private JRadioButton radioButton20;
	private JRadioButton radioButton10;
	private JButton buttonOk;
	private JLabel labelPergunta;
	public static JanelaPrincipal frame;
	public ButtonGroup grupo;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new JanelaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JanelaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		labelPergunta = new JLabel("Quanto \u00E9 10 x 10 ?");
		labelPergunta.setFont(new Font("Tahoma", Font.BOLD, 25));
		labelPergunta.setBounds(82, 11, 244, 61);
		contentPane.add(labelPergunta);
		
		radioButton10 = new JRadioButton("10");
		radioButton10.setBounds(82, 79, 109, 23);
		contentPane.add(radioButton10);
		
		radioButton20 = new JRadioButton("20");
		radioButton20.setBounds(82, 105, 109, 23);
		contentPane.add(radioButton20);
		
		radioButton100 = new JRadioButton("100");
		radioButton100.setBounds(82, 131, 109, 23);
		contentPane.add(radioButton100);
		
		radioButton1000 = new JRadioButton("1000");
		radioButton1000.setBounds(82, 157, 109, 23);
		contentPane.add(radioButton1000);
		
		radioButton10000 = new JRadioButton("10000");
		radioButton10000.setBounds(82, 183, 109, 23);
		contentPane.add(radioButton10000);
		
		buttonOk = new JButton("OK");
		buttonOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JDialogDemo  jd = new JDialogDemo (frame);
				radioButton10.setEnabled(false);
				radioButton100.setEnabled(false);
				radioButton1000.setEnabled(false);
				radioButton10000.setEnabled(false);
				radioButton20.setEnabled(false);
			}
		});
		buttonOk.setBounds(154, 213, 89, 23);
		contentPane.add(buttonOk);
		
		grupo =  new ButtonGroup();
		
		grupo.add(radioButton10);
		grupo.add(radioButton100);
		grupo.add(radioButton1000);
		grupo.add(radioButton10000);
		grupo.add(radioButton20);
		
		
		
		setLocationRelativeTo(null);
		setResizable(true);
	
	}

	public JRadioButton getRadioButton10000() {
		return radioButton10000;
	}

	public void setRadioButton10000(JRadioButton radioButton10000) {
		this.radioButton10000 = radioButton10000;
	}

	public JRadioButton getRadioButton1000() {
		return radioButton1000;
	}

	public void setRadioButton1000(JRadioButton radioButton1000) {
		this.radioButton1000 = radioButton1000;
	}

	public JRadioButton getRadioButton100() {
		return radioButton100;
	}

	public void setRadioButton100(JRadioButton radioButton100) {
		this.radioButton100 = radioButton100;
	}

	public JRadioButton getRadioButton20() {
		return radioButton20;
	}

	public void setRadioButton20(JRadioButton radioButton20) {
		this.radioButton20 = radioButton20;
	}

	public JRadioButton getRadioButton10() {
		return radioButton10;
	}

	public void setRadioButton10(JRadioButton radioButton10) {
		this.radioButton10 = radioButton10;
	}

	public JButton getButtonOk() {
		return buttonOk;
	}

	public void setButtonOk(JButton buttonOk) {
		this.buttonOk = buttonOk;
	}

	public JLabel getLabelPergunta() {
		return labelPergunta;
	}

	public void setLabelPergunta(JLabel labelPergunta) {
		this.labelPergunta = labelPergunta;
	}
	
	
}
