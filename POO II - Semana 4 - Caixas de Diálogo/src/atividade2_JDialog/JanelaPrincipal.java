package atividade2_JDialog;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JanelaPrincipal extends JFrame {

	private JPanel contentPane;
	private JLabel lblDireoMensagem;
	private static JanelaPrincipal frame;

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
		setTitle("JDialog Demo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 428, 302);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblDireoMensagem = new JLabel("Dire\u00E7\u00E3o Mensagem");
		lblDireoMensagem.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblDireoMensagem.setBounds(41, 32, 261, 31);
		contentPane.add(lblDireoMensagem);
		
		JButton btnMostrarDilogo = new JButton("Mostrar Di\u00E1logo");
		btnMostrarDilogo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
		//AQUIIIII!!!!!!!		
				
				JDialogDemo jd = new JDialogDemo (frame);
			}
		});
		btnMostrarDilogo.setBounds(26, 95, 125, 23);
		contentPane.add(btnMostrarDilogo);
		
		JButton btnRedefinirDilogo = new JButton("Redefinir Di\u00E1logo");
		btnRedefinirDilogo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRedefinirDilogo.setBounds(161, 95, 167, 23);
		contentPane.add(btnRedefinirDilogo);
	}

	public JLabel getLblDireoMensagem() {
		return lblDireoMensagem;
	}

	public void setLblDireoMensagem(JLabel lblDireoMensagem) {
		this.lblDireoMensagem = lblDireoMensagem;
	}
	
	
	
}
