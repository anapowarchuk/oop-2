package atividade3_JFileChooser;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JFileChooserDemo extends JFrame {

	private JPanel contentPane;
	public static JFileChooserDemo frame;
	private JLabel labelCaminhoAbsoluto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 frame = new JFileChooserDemo();
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
	public JFileChooserDemo() {
		setTitle("JFileChooser Demo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAbrirCaixaDe = new JButton("Abrir Caixa de Di\u00E1logo");
		btnAbrirCaixaDe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser jf= new JFileChooser();
				int opt = jf.showOpenDialog(frame);
				
				if (opt==JFileChooser.APPROVE_OPTION) {
					labelCaminhoAbsoluto.setText(jf.getSelectedFile().getAbsolutePath());
				}
			}
		});
		btnAbrirCaixaDe.setBounds(37, 55, 166, 23);
		contentPane.add(btnAbrirCaixaDe);
		
		JLabel lblCaminhoAbsolutoDo = new JLabel("Caminho Absoluto do Arquivo");
		lblCaminhoAbsolutoDo.setBounds(85, 114, 219, 14);
		contentPane.add(lblCaminhoAbsolutoDo);
		
		labelCaminhoAbsoluto = new JLabel("");
		labelCaminhoAbsoluto.setBounds(109, 163, 178, 14);
		contentPane.add(labelCaminhoAbsoluto);
	}

	public JLabel getLabelCaminhoAbsoluto() {
		return labelCaminhoAbsoluto;
	}

	public void setLabelCaminhoAbsoluto(JLabel labelCaminhoAbsoluto) {
		this.labelCaminhoAbsoluto = labelCaminhoAbsoluto;
	}	

	
}
