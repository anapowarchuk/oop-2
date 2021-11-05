package atividade1;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JMenuItem;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

public class ProntuarioMedico extends JFrame {

	private JPanel contentPane;
	private JTabbedPane tabbedPane;
	private JTextField fieldNome;
	private JTextField fieldCpf;
	private JTextField fieldTemperatura;
	private JTextField textPressao;
	private JTextField fieldDataDeNasc;
	private JTextField textField;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProntuarioMedico frame = new ProntuarioMedico();
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
	public ProntuarioMedico() {
		setTitle("Prontu\u00E1rio M\u00E9dico");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 567, 495);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenuItem mntmSair = new JMenuItem("Sair");
		mntmSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			System.exit(0);
			}
		});
		menuBar.add(mntmSair);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		tabbedPane.setTabPlacement(tabbedPane.BOTTOM);

		JPanel panelDadosPessoais = new JPanel();
		panelDadosPessoais.setBackground(new Color(255, 255, 204));
		tabbedPane.addTab("Dados Pessoais", null, panelDadosPessoais, null);
		panelDadosPessoais.setLayout(new MigLayout("", "[grow][][grow][grow][grow][grow][grow]", "[][][][][][][][][][][][][][][]"));
		
		JLabel lblDadosPessoais = new JLabel("DADOS PESSOAIS");
		lblDadosPessoais.setFont(new Font("Segoe UI", Font.BOLD, 22));
		panelDadosPessoais.add(lblDadosPessoais, "cell 3 0,alignx center");
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		panelDadosPessoais.add(lblNome, "cell 2 2,alignx trailing");
		
		fieldNome = new JTextField();
		panelDadosPessoais.add(fieldNome, "cell 3 2,growx");
		fieldNome.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		panelDadosPessoais.add(lblCpf, "cell 2 3,alignx trailing");
		
		fieldCpf = new JTextField();
		panelDadosPessoais.add(fieldCpf, "cell 3 3,growx");
		fieldCpf.setColumns(10);
		
		JLabel lblDataDeNascimento = new JLabel("Data de Nascimento");
		lblDataDeNascimento.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		panelDadosPessoais.add(lblDataDeNascimento, "cell 2 4,alignx trailing");
		
		fieldDataDeNasc = new JTextField();
		panelDadosPessoais.add(fieldDataDeNasc, "cell 3 4,alignx left");
		fieldDataDeNasc.setColumns(10);
		
		JLabel lblPresso = new JLabel("Press\u00E3o");
		lblPresso.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		panelDadosPessoais.add(lblPresso, "cell 2 5,alignx right");
		
		textPressao = new JTextField();
		panelDadosPessoais.add(textPressao, "cell 3 5,alignx left");
		textPressao.setColumns(10);
		
		JLabel lblTemperatura = new JLabel("Temperatura");
		lblTemperatura.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		panelDadosPessoais.add(lblTemperatura, "cell 2 6,alignx right");
		
		fieldTemperatura = new JTextField();
		panelDadosPessoais.add(fieldTemperatura, "cell 3 6,alignx left");
		fieldTemperatura.setColumns(10);
		
		JLabel lblLaudoMdico = new JLabel("LAUDO M\u00C9DICO");
		lblLaudoMdico.setFont(new Font("Segoe UI", Font.BOLD, 17));
		panelDadosPessoais.add(lblLaudoMdico, "cell 3 8,alignx center");
		
		textField = new JTextField();
		panelDadosPessoais.add(textField, "cell 2 9 3 11,grow");
		textField.setColumns(10);

		JPanel panelAnamnese = new JPanel();
		panelAnamnese.setBackground(new Color(204, 255, 204));
		tabbedPane.addTab("Anamnese", null, panelAnamnese, null);

		JPanel panelExames = new JPanel();
		panelExames.setBackground(new Color(204, 255, 255));
		tabbedPane.addTab("Exames", null, panelExames, null);

		JPanel panelTratamento = new JPanel();
		panelTratamento.setBackground(new Color(204, 204, 255));
		tabbedPane.addTab("Tratamento", null, panelTratamento, null);
		setResizable(false);
	}

}
