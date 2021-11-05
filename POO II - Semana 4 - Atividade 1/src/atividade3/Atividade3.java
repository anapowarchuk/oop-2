package atividade3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.ImageIcon;

public class Atividade3 extends JFrame {

	private JPanel contentPane;
	private JMenuItem menuItemAbrir;
	private JMenuItem menuItemSalvar;
	private JMenuItem menuItemSair;
	private JTextField textField_1;
	public static Atividade3 frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new Atividade3();
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
	public Atividade3() {
		getContentPane().setLayout(null);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnArquivo = new JMenu("Arquivo");
		menuBar.add(mnArquivo);

		menuItemAbrir = new JMenuItem("Abrir");
		menuItemAbrir.setIcon(new ImageIcon(Atividade3.class.getResource("/figuras/open.png")));
		mnArquivo.add(menuItemAbrir);

		menuItemSalvar = new JMenuItem("Salvar");
		menuItemSalvar.setIcon(new ImageIcon(Atividade3.class.getResource("/figuras/save.png")));
		menuItemSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JFileChooser jf = new JFileChooser();
				jf.setSelectedFile(new File("ufcspa.text"));
				int opt = jf.showSaveDialog(frame);
				if (opt == JFileChooser.APPROVE_OPTION) {

				}
				Salvar();
			}
		});
		mnArquivo.add(menuItemSalvar);

		JMenuItem menuItemSair = new JMenuItem("Sair");
		menuItemSair.setIcon(new ImageIcon(Atividade3.class.getResource("/figuras/exit.png")));
		menuItemSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sair();
			}
		});
		mnArquivo.add(menuItemSair);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		textField_1 = new JTextField();
		textField_1.setBounds(10, 11, 414, 218);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
	}

	public void Salvar() {
		FileWriter fw;
		try {
			fw = new FileWriter("ufcspa.text");
			BufferedWriter bw = new BufferedWriter(fw);

			bw.write(textField_1.toString());
			bw.flush();

			fw.close();
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void Sair() {
		System.exit(0);
	}

}
