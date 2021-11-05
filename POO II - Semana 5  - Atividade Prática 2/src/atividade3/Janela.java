package atividade3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import atividade1.ProntuarioMedico;
import atividade2.JSplit;
import net.miginfocom.swing.MigLayout;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Janela extends JFrame {

	private JPanel contentPane;
	private JDesktopPane desktopPane;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela frame = new Janela();
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
	public Janela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 1000);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menuAdicionar = new JMenu("Adicionar");
		menuBar.add(menuAdicionar);
		
		JMenuItem mntmJTabbedPaneDemo = new JMenuItem("JTabbedPaneDemo");
		mntmJTabbedPaneDemo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ProntuarioMedico prontMed = new ProntuarioMedico();
				JInternalFrame ji =  new JInternalFrame("Prontuario Médico",true);
				ji.setBounds(100, 100, 575, 593);
				ji.setVisible(true);
				ji.setContentPane(prontMed.getTabbedPane());
				ji.setMenuBar(prontMed.getJMenuBar());
				
				desktopPane.add(ji);
				ji.setMaximizable(true);
				ji.setClosable(true);
}
		});
		menuAdicionar.add(mntmJTabbedPaneDemo);
		
		JMenuItem mntmJsplitdemo = new JMenuItem("JSplitDemo");
		mntmJsplitdemo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JSplit jSplit = new JSplit();
				JInternalFrame ji =  new JInternalFrame("JSplitPane",true);
				ji.setBounds(100, 100, 420, 310);
				ji.setVisible(true);
				ji.setContentPane(jSplit.getContentPane());
				desktopPane.add(ji);
				ji.setMaximizable(true);
				ji.setClosable(true);
				
			}
		});
		menuAdicionar.add(mntmJsplitdemo);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		desktopPane = new JDesktopPane();
		contentPane.add(desktopPane, BorderLayout.CENTER);
		setLocationRelativeTo(null);
	}

}
