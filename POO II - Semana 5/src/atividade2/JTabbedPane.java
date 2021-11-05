package atividade2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;

public class JTabbedPane extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JTabbedPane frame = new JTabbedPane();
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
	public JTabbedPane() {
		setTitle("JTabbedPane Demo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		javax.swing.JTabbedPane tabbedPane = new javax.swing.JTabbedPane(javax.swing.JTabbedPane.TOP); //onde fica as abas -bottom, top..
		contentPane.add(tabbedPane, BorderLayout.CENTER); 
		
		JPanel panel = new JPanel();
		panel.setToolTipText("1");
		tabbedPane.addTab("Guia 1", new ImageIcon(JTabbedPane.class.getResource("/figuras/ok1.png")), panel, null);
		panel.setLayout(new MigLayout("", "[]", "[]"));
		
		JLabel lblNome = new JLabel("Nome");
		panel.add(lblNome, "flowx,cell 0 0");
		
		textField = new JTextField();
		panel.add(textField, "cell 0 0,growx");
		textField.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Guia 2", new ImageIcon(JTabbedPane.class.getResource("/figuras/clean.png")), panel_1, null);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JButton btnNewButton = new JButton("Clicar");
		panel_1.add(btnNewButton, BorderLayout.CENTER);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.PINK);
		tabbedPane.addTab("Guia 3", null, panel_2, null);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Guia 4", null, panel_3, null);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Guia 5", null, panel_4, null);
	}

}
