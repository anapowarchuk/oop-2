package atividade6;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;

public class JFileChooserDemo extends JFrame {

	private JPanel contentPane;
	public static JFileChooserDemo frame;
	private JLabel label;
	private JMenuItem mntmSelecao;
	private JMenuItem mntmEncerramento;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu menuArquivo = new JMenu("Arquivo");
		menuBar.add(menuArquivo);

		mntmSelecao = new JMenuItem("Sele\u00E7\u00E3o do Arquivo");
		mntmSelecao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser jf = new JFileChooser();

				int opt = jf.showOpenDialog(frame);

				if (opt == JFileChooser.APPROVE_OPTION) {
					label.setIcon(new ImageIcon(jf.getSelectedFile().getAbsolutePath()));
				}

			}
		});
		menuArquivo.setIcon(new ImageIcon(JFileChooserDemo.class.getResource("/figuras/open.png")));
		menuArquivo.add(mntmSelecao);

		JMenuItem mntmEncerramento = new JMenuItem("Encerramento do Arquivo");
		mntmEncerramento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		menuArquivo.add(mntmEncerramento);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		label = new JLabel("");
		label.setBounds(10, 0, 414, 229);
		contentPane.add(label);
	}
}
