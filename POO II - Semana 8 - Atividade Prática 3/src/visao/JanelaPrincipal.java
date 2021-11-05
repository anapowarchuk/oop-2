package visao;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.TextField;
import java.awt.Window;
import java.text.ParseException;

import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.MatteBorder;
import javax.swing.text.MaskFormatter;

public class JanelaPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField fieldUsuario;
	private JTextField fieldSenha;
	private JTextField fieldNome;
	private JTextField fieldCpf;
	private JTextField fieldEndereco;
	private JMenuItem mntmAutenticar;
	private JMenuItem mntmCadastrar;
	private JMenuItem mntmSair;
	private JButton btnAutenticar;
	private JButton btnLimpar;
	private JButton btnLimpar2;
	private JButton btnGravar;
	private JRadioButton rdbtnMasculino;
	private JRadioButton rdbtnFeminino;
	private ButtonGroup buttonGroup;
	private JComboBox comboBox;
	private JPanel painelCadastro;
	private JPanel painel;
	private JPanel painelLogin;
	private JPanel painelInicial;
	
	public static JanelaPrincipal frame;
	private JLabel labelImagemPessoa;
	
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
		setTitle("Janela Principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 477, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnMenu = new JMenu("Menu");
		menuBar.add(mnMenu);
		
		mntmAutenticar = new JMenuItem("Autenticar");
		mnMenu.add(mntmAutenticar);
		
		mntmCadastrar = new JMenuItem("Cadastrar");
		mnMenu.add(mntmCadastrar);
		
		mntmSair = new JMenuItem("Sair");
		mnMenu.add(mntmSair);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		painel = new JPanel();
		contentPane.add(painel, "name_973024780657700");
		painel.setLayout(new CardLayout(0, 0));
		
		painelInicial = new JPanel();
		painel.add(painelInicial, "name_2196480344700");
		painelInicial.setLayout(null);
		
		JLabel lblOl = new JLabel("Ol\u00E1!");
		lblOl.setFont(new Font("Verdana", Font.BOLD, 20));
		lblOl.setBounds(202, 79, 46, 44);
		painelInicial.add(lblOl);
		
		painelLogin = new JPanel();
		painel.add(painelLogin, "painelL");
		painelLogin.setLayout(new MigLayout("", "[grow][][][][][][][][][][grow]", "[][][][][][][]"));
		
		JLabel labelImagem = new JLabel("");
		labelImagem.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/icons/login.png")));
		painelLogin.add(labelImagem, "cell 1 0 5 5");
		
		JLabel labelTelaLogin = new JLabel("TELA LOGIN");
		labelTelaLogin.setFont(new Font("Tahoma", Font.BOLD, 24));
		painelLogin.add(labelTelaLogin, "cell 7 0 3 1,alignx center");
		
		JLabel labelUsuario = new JLabel("Usu\u00E1rio");
		labelUsuario.setFont(new Font("Tahoma", Font.PLAIN, 12));
		painelLogin.add(labelUsuario, "flowx,cell 7 2,alignx center");
		
		fieldUsuario = new JTextField();
		fieldUsuario.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		painelLogin.add(fieldUsuario, "cell 8 2 2 1,growx");
		fieldUsuario.setColumns(10);
		
		JLabel labelSenha = new JLabel("Senha");
		labelSenha.setFont(new Font("Tahoma", Font.PLAIN, 12));
		painelLogin.add(labelSenha, "flowx,cell 7 3,alignx center");
		
		fieldSenha = new JTextField();
		fieldSenha.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		painelLogin.add(fieldSenha, "cell 8 3 2 1,growx,alignx left");
		fieldSenha.setColumns(10);
		
		btnAutenticar = new JButton("Autenticar");
		painelLogin.add(btnAutenticar, "flowx,cell 7 5 3 1,growx");
		
		btnLimpar = new JButton("Limpar");
		painelLogin.add(btnLimpar, "cell 7 5 2 1,growx");
		
		painelCadastro = new JPanel();
		painel.add(painelCadastro, "painelC");
		painelCadastro.setToolTipText("");
		painelCadastro.setLayout(new MigLayout("", "[][][][][grow]", "[][][grow][][5][][5][][][]"));
		
		labelImagemPessoa = new JLabel("Adicione uma foto aqui");
		labelImagemPessoa.setFont(new Font("Tahoma", Font.PLAIN, 8));
		labelImagemPessoa.setBorder(null);
		painelCadastro.add(labelImagemPessoa, "cell 0 0 2 2,alignx center,aligny bottom");
		
		JLabel labelNome = new JLabel("Nome");
		labelNome.setFont(new Font("Tahoma", Font.PLAIN, 14));
		painelCadastro.add(labelNome, "cell 0 3,alignx left");
		
		JLabel labelSexo = new JLabel("Sexo");
		labelSexo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		painelCadastro.add(labelSexo, "flowx,cell 3 3,alignx right");
		
		JLabel labelCpf = new JLabel("CPF");
		labelCpf.setFont(new Font("Tahoma", Font.PLAIN, 14));
		painelCadastro.add(labelCpf, "cell 0 5,growx");
		
		JLabel labelProfissao = new JLabel("Profiss\u00E3o");
		labelProfissao.setFont(new Font("Tahoma", Font.PLAIN, 14));
		painelCadastro.add(labelProfissao, "cell 3 5,alignx trailing");
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"M\u00E9dico", "Professor"}));
		painelCadastro.add(comboBox, "cell 4 5,growx");
		
		JLabel labelEndereco = new JLabel("Endere\u00E7o");
		labelEndereco.setFont(new Font("Tahoma", Font.PLAIN, 14));
		painelCadastro.add(labelEndereco, "cell 0 7");
		
		btnGravar = new JButton("Gravar");
		btnGravar.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/icons/ok1.png")));
		painelCadastro.add(btnGravar, "cell 1 9");
		
		fieldNome = new JTextField();
		fieldNome.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		painelCadastro.add(fieldNome, "cell 1 3 2 1,growx");
		fieldNome.setColumns(10);
		
		MaskFormatter ftmCPF = null;
		try {
			ftmCPF = new MaskFormatter("###.###.###-##");
			ftmCPF.setValidCharacters("0123456789");
		} catch (ParseException e1) {
			e1.printStackTrace();
		}
		
		fieldCpf = new JFormattedTextField(ftmCPF);;
		fieldCpf.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		fieldCpf.setToolTipText("Apenas Números");
		fieldCpf.setText("   .   .   -       ");
		painelCadastro.add(fieldCpf, "cell 1 5,growx");
		fieldCpf.setColumns(10);
		
		fieldEndereco = new JTextField();
		fieldEndereco.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		painelCadastro.add(fieldEndereco, "cell 1 7 4 1,growx");
		fieldEndereco.setColumns(10);
		
		rdbtnMasculino = new JRadioButton("M");
		painelCadastro.add(rdbtnMasculino, "cell 4 3");
		
		rdbtnFeminino = new JRadioButton("F");
		painelCadastro.add(rdbtnFeminino, "cell 4 3");
		
		buttonGroup =  new ButtonGroup ();
		buttonGroup.add(rdbtnFeminino);
		buttonGroup.add(rdbtnMasculino);
		rdbtnFeminino.setActionCommand("F");
		rdbtnMasculino.setActionCommand("M");
		
		btnLimpar2 = new JButton("Limpar");
		btnLimpar2.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/icons/clean.png")));
		painelCadastro.add(btnLimpar2, "cell 2 9");
		
		JLabel labelCadastroClientes = new JLabel("Cadastro Clientes");
		labelCadastroClientes.setFont(new Font("Tahoma", Font.BOLD, 20));
		painelCadastro.add(labelCadastroClientes, "cell 2 1 5 1,alignx left");
		
		setLocationRelativeTo(null);
		
	}

	public JTextField getFieldUsuario() {
		return fieldUsuario;
	}

	public void setFieldUsuario(JTextField fieldUsuario) {
		this.fieldUsuario = fieldUsuario;
	}

	public JTextField getFieldSenha() {
		return fieldSenha;
	}

	public void setFieldSenha(JTextField fieldSenha) {
		this.fieldSenha = fieldSenha;
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

	public JTextField getFieldEndereco() {
		return fieldEndereco;
	}

	public void setFieldEndereco(JTextField fieldEndereco) {
		this.fieldEndereco = fieldEndereco;
	}

	public JMenuItem getMntmAutenticar() {
		return mntmAutenticar;
	}

	public void setMntmAutenticar(JMenuItem mntmAutenticar) {
		this.mntmAutenticar = mntmAutenticar;
	}

	public JMenuItem getMntmCadastrar() {
		return mntmCadastrar;
	}

	public void setMntmCadastrar(JMenuItem mntmCadastrar) {
		this.mntmCadastrar = mntmCadastrar;
	}

	public JMenuItem getMntmSair() {
		return mntmSair;
	}

	public void setMntmSair(JMenuItem mntmSair) {
		this.mntmSair = mntmSair;
	}

	public JButton getBtnAutenticar() {
		return btnAutenticar;
	}

	public void setBtnAutenticar(JButton btnAutenticar) {
		this.btnAutenticar = btnAutenticar;
	}

	public JButton getBtnLimpar() {
		return btnLimpar;
	}

	public void setBtnLimpar(JButton btnLimpar) {
		this.btnLimpar = btnLimpar;
	}

	public JButton getBtnLimpar2() {
		return btnLimpar2;
	}

	public void setBtnLimpar2(JButton btnLimpar2) {
		this.btnLimpar2 = btnLimpar2;
	}

	public JButton getBtnGravar() {
		return btnGravar;
	}

	public void setBtnGravar(JButton btnGravar) {
		this.btnGravar = btnGravar;
	}

	public JRadioButton getRdbtnMasculino() {
		return rdbtnMasculino;
	}

	public void setRdbtnMasculino(JRadioButton rdbtnMasculino) {
		this.rdbtnMasculino = rdbtnMasculino;
	}

	public JRadioButton getRdbtnFeminino() {
		return rdbtnFeminino;
	}

	public void setRdbtnFeminino(JRadioButton rdbtnFeminino) {
		this.rdbtnFeminino = rdbtnFeminino;
	}

	public JComboBox getComboBox() {
		return comboBox;
	}

	public void setComboBox(JComboBox comboBox) {
		this.comboBox = comboBox;
	}

	public JPanel getPainelCadastro() {
		return painelCadastro;
	}

	public void setPainelCadastro(JPanel painelCadastro) {
		this.painelCadastro = painelCadastro;
	}

	public JPanel getPainelInicial() {
		return painel;
	}

	public void setPainelInicial(JPanel painelInicial) {
		this.painel = painelInicial;
	}

	public JPanel getPainelLogin() {
		return painelLogin;
	}

	public void setPainelLogin(JPanel painelLogin) {
		this.painelLogin = painelLogin;
	}

	public ButtonGroup getButtonGroup() {
		return buttonGroup;
	}

	public void setButtonGroup(ButtonGroup buttonGroup) {
		this.buttonGroup = buttonGroup;
	}

	public JPanel getPainel() {
		return painel;
	}

	public void setPainel(JPanel painel) {
		this.painel = painel;
	}

	public JLabel getLabelImagemPessoa() {
		return labelImagemPessoa;
	}

	public void setLabelImagemPessoa(JLabel labelImagemPessoa) {
		this.labelImagemPessoa = labelImagemPessoa;
	}
}
