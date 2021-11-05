package atividade1;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

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
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;

public class ProntuarioMedico extends JFrame {

	private JPanel contentPane;
	private JTabbedPane tabbedPane;
	private JTextField fieldNome;
	private JTextField fieldCpf;
	private JTextField fieldTemperatura;
	private JTextField textPressao;
	private JTextField fieldDataDeNasc;
	private JTextField fieldDataExame;
	private JTextField fieldTipodeTratamento;
	private JMenuBar menuBar;
	private JMenuItem mntmSair;
	private JTextArea textArea;
	private JRadioButton rdbtnSim;
	private JRadioButton rdbtnNo;
	private ButtonGroup grupo;

	
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
		setBounds(100, 100, 575, 593);

		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mntmSair = new JMenuItem("Sair");
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
				panelDadosPessoais.setLayout(new MigLayout("", "[][][][grow][][][]", "[][][][][][][][][][grow][grow][grow][grow][][][]"));
				
				JLabel lblDadosPessoais = new JLabel("DADOS PESSOAIS");
				lblDadosPessoais.setFont(new Font("Segoe UI", Font.BOLD, 22));
				panelDadosPessoais.add(lblDadosPessoais, "cell 1 0 7 0,alignx center");
				
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
				panelDadosPessoais.add(lblLaudoMdico, "cell 3 8,alignx left");
				
				JScrollPane scrollPane = new JScrollPane();
				panelDadosPessoais.add(scrollPane, "cell 2 9 3 5,grow");
				
				textArea = new JTextArea();
				scrollPane.setViewportView(textArea);
				
				JButton btnSalvar = new JButton("SALVAR");
				btnSalvar.setIcon(new ImageIcon(ProntuarioMedico.class.getResource("/figuras/ok1.png")));
				panelDadosPessoais.add(btnSalvar, "cell 0 15 7 0,alignx center");

		JPanel panelAnamnese = new JPanel();
		panelAnamnese.setBackground(new Color(204, 255, 204));
		tabbedPane.addTab("Anamnese", null, panelAnamnese, null);
		panelAnamnese.setLayout(new MigLayout("", "[grow]", "[][grow][]"));
		
		JLabel lblAnotaesMdicas = new JLabel("ANAMNESE");
		lblAnotaesMdicas.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		panelAnamnese.add(lblAnotaesMdicas, "cell 0 0,alignx center");
		
		JScrollPane scrollPane_1 = new JScrollPane();
		panelAnamnese.add(scrollPane_1, "cell 0 1,grow");
		
		JTextArea textArea_1 = new JTextArea();
		scrollPane_1.setViewportView(textArea_1);
		
		JButton btnSalvar_1 = new JButton("SALVAR");
		btnSalvar_1.setIcon(new ImageIcon(ProntuarioMedico.class.getResource("/figuras/ok1.png")));
		panelAnamnese.add(btnSalvar_1, "cell 0 2,alignx center");
		
				JPanel panelExames = new JPanel();
				panelExames.setBackground(new Color(204, 255, 255));
				tabbedPane.addTab("Exames", null, panelExames, null);
				panelExames.setLayout(new MigLayout("", "[][grow][grow][]", "[][][][][][grow][][][]"));
				
				JLabel lblNewLabel = new JLabel("EXAMES");
				lblNewLabel.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
				panelExames.add(lblNewLabel, "cell 1 0 4 0,alignx center");
				
				JLabel lblTipoDeExame = new JLabel("Tipo de Exame");
				lblTipoDeExame.setFont(new Font("Segoe UI", Font.PLAIN, 15));
				panelExames.add(lblTipoDeExame, "cell 1 2,alignx trailing");
				
				JComboBox comboBox = new JComboBox();
				comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "Exame de Sangue", "Raio X", "Tomografia", "Ecografia", "Outro"}));
				panelExames.add(comboBox, "cell 2 2,alignx left");
				
				JLabel lblDataDoExame = new JLabel("Data do Exame");
				lblDataDoExame.setFont(new Font("Segoe UI", Font.PLAIN, 15));
				panelExames.add(lblDataDoExame, "cell 1 3,alignx trailing");
				
				fieldDataExame = new JTextField();
				panelExames.add(fieldDataExame, "cell 2 3,alignx left");
				fieldDataExame.setColumns(10);
				
				JLabel lblLaudo = new JLabel("Laudo M\u00E9dico");
				lblLaudo.setFont(new Font("Segoe UI", Font.PLAIN, 15));
				panelExames.add(lblLaudo, "cell 1 4 2 0,alignx center");
				
				JScrollPane scrollPane_2 = new JScrollPane();
				panelExames.add(scrollPane_2, "cell 1 5 3 3,grow");
				
				JButton btnSalvar_2 = new JButton("Salvar");
				btnSalvar_2.setIcon(new ImageIcon(ProntuarioMedico.class.getResource("/figuras/ok1.png")));
				panelExames.add(btnSalvar_2, "cell 1 8 2 0,alignx center");

		JPanel panelTratamento = new JPanel();
		panelTratamento.setBackground(new Color(204, 204, 255));
		tabbedPane.addTab("Tratamento", null, panelTratamento, null);
		panelTratamento.setLayout(new MigLayout("", "[grow]", "[][][][grow][]"));
		
		JLabel lblTratamento = new JLabel("TRATAMENTO");
		lblTratamento.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		panelTratamento.add(lblTratamento, "cell 0 0,alignx center");
		
		JLabel lblTipoDeTratamento = new JLabel("Tipo de Tratamento");
		lblTipoDeTratamento.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		panelTratamento.add(lblTipoDeTratamento, "flowx,cell 0 1,alignx center");
		
		JLabel lblJFezEsse = new JLabel("J\u00E1 fez esse tratamento antes?");
		lblJFezEsse.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		panelTratamento.add(lblJFezEsse, "flowx,cell 0 2,alignx center");
		
		JScrollPane scrollPane_3 = new JScrollPane();
		panelTratamento.add(scrollPane_3, "cell 0 3,grow");
		
		JTextArea textArea_2 = new JTextArea();
		scrollPane_3.setViewportView(textArea_2);
		
		JButton btnSalvar_3 = new JButton("Salvar");
		btnSalvar_3.setIcon(new ImageIcon(ProntuarioMedico.class.getResource("/figuras/ok1.png")));
		panelTratamento.add(btnSalvar_3, "cell 0 4,alignx center");
		
		fieldTipodeTratamento = new JTextField();
		fieldTipodeTratamento.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		panelTratamento.add(fieldTipodeTratamento, "cell 0 1,alignx center");
		fieldTipodeTratamento.setColumns(10);
		
		rdbtnSim = new JRadioButton("Sim");
		panelTratamento.add(rdbtnSim, "cell 0 2");
		
		rdbtnNo = new JRadioButton("N\u00E3o");
		panelTratamento.add(rdbtnNo, "cell 0 2");
		setResizable(false);
		
		grupo = new ButtonGroup();		
		grupo.add(rdbtnNo);
		grupo.add(rdbtnSim);
	}

	
	public JTabbedPane getTabbedPane() {
		return tabbedPane;
	}

	public void setTabbedPane(JTabbedPane tabbedPane) {
		this.tabbedPane = tabbedPane;
	}

	public JTextField getFieldNome() {
		return fieldNome;
	}

	public void setFieldNome(JTextField fieldNome) {
		this.fieldNome = fieldNome;
	}

	public JTextField getFieldCpf() {
		return fieldCpf;
	}

	public void setFieldCpf(JTextField fieldCpf) {
		this.fieldCpf = fieldCpf;
	}

	public JTextField getFieldTemperatura() {
		return fieldTemperatura;
	}

	public void setFieldTemperatura(JTextField fieldTemperatura) {
		this.fieldTemperatura = fieldTemperatura;
	}

	public JTextField getTextPressao() {
		return textPressao;
	}

	public void setTextPressao(JTextField textPressao) {
		this.textPressao = textPressao;
	}

	public JTextField getFieldDataDeNasc() {
		return fieldDataDeNasc;
	}

	public void setFieldDataDeNasc(JTextField fieldDataDeNasc) {
		this.fieldDataDeNasc = fieldDataDeNasc;
	}

	public JTextField getFieldDataExame() {
		return fieldDataExame;
	}

	public void setFieldDataExame(JTextField fieldDataExame) {
		this.fieldDataExame = fieldDataExame;
	}

	public JTextField getFieldTipodeTratamento() {
		return fieldTipodeTratamento;
	}

	public void setFieldTipodeTratamento(JTextField fieldTipodeTratamento) {
		this.fieldTipodeTratamento = fieldTipodeTratamento;
	}

	public JMenuItem getMntmSair() {
		return mntmSair;
	}

	public void setMntmSair(JMenuItem mntmSair) {
		this.mntmSair = mntmSair;
	}

	public JTextArea getTextArea() {
		return textArea;
	}

	public void setTextArea(JTextArea textArea) {
		this.textArea = textArea;
	}

	public JRadioButton getRdbtnSim() {
		return rdbtnSim;
	}

	public void setRdbtnSim(JRadioButton rdbtnSim) {
		this.rdbtnSim = rdbtnSim;
	}

	public JRadioButton getRdbtnNo() {
		return rdbtnNo;
	}

	public void setRdbtnNo(JRadioButton rdbtnNo) {
		this.rdbtnNo = rdbtnNo;
	}

	public ButtonGroup getGrupo() {
		return grupo;
	}

	public void setGrupo(ButtonGroup grupo) {
		this.grupo = grupo;
	}

	
	
}

