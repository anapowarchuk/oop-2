package visao;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.awt.Color;
import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;
import javax.swing.JTextField;

public class JanelaCadastro extends JFrame {

	private JPanel contentPane;
	private JTextField fieldCodigo;
	private JTextField fieldNome;
	private JTextField fieldCnpj;
	private JTextField fieldEnderco;
	private JButton buttonSalvar;
	private JButton buttonSair;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public JanelaCadastro() {
		setTitle("Empresa de TI");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 611, 364);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(new Color(255, 250, 205));
		contentPane.add(panel1, BorderLayout.NORTH);
		
		JLabel labelImagem = new JLabel("");
		labelImagem.setBounds(0, 0, 100, 80);
		try {
			labelImagem.setIcon(new ImageIcon(ImageIO.read(JanelaCadastro.class.getResource("/figuras/internet.png")).getScaledInstance(labelImagem.getWidth(), labelImagem.getHeight(), BufferedImage.TYPE_INT_RGB)));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		panel1.add(labelImagem);
		
		JLabel labelTitulo = new JLabel("CADASTRO DE CLIENTES");
		labelTitulo.setFont(new Font("Tahoma", Font.BOLD, 25));
		panel1.add(labelTitulo);
		
		JPanel panel2 = new JPanel();
		panel2.setBackground(new Color(204, 255, 204));
		contentPane.add(panel2, BorderLayout.CENTER);
		panel2.setLayout(new MigLayout("", "[][grow]", "[][][][][15][15][15][]"));
		
		JLabel labelCodigo = new JLabel("C\u00F3digo");
		panel2.add(labelCodigo, "cell 0 0");
		
		JLabel labelNome = new JLabel("Nome");
		panel2.add(labelNome, "cell 1 0");
		
		fieldCodigo = new JTextField();
		panel2.add(fieldCodigo, "cell 0 1,growx");
		fieldCodigo.setColumns(10);
		
		fieldNome = new JTextField();
		panel2.add(fieldNome, "cell 1 1, pushx, growx, alignx left");
		fieldNome.setColumns(10);
		
		JLabel labelCnpj = new JLabel("CNPJ");
		panel2.add(labelCnpj, "cell 0 2");
		
		JLabel labelEndereco = new JLabel("Endere\u00E7o");
		panel2.add(labelEndereco, "cell 1 2");
		
		fieldCnpj = new JTextField();
		panel2.add(fieldCnpj, "cell 0 3, growx");
		fieldCnpj.setColumns(10);
		
		fieldEnderco = new JTextField();
		panel2.add(fieldEnderco, "cell 1 3,pushx, growx, alignx left");
		fieldEnderco.setColumns(10);
		
		buttonSalvar = new JButton("Salvar");
		buttonSalvar.setIcon(new ImageIcon(JanelaCadastro.class.getResource("/figuras/salve-.png")));
		panel2.add(buttonSalvar, "flowx,cell 0 7");
		
		buttonSair = new JButton("Sair");
		buttonSair.setIcon(new ImageIcon(JanelaCadastro.class.getResource("/figuras/saida.png")));
		panel2.add(buttonSair, "cell 0 7");
	}


	public JTextField getFieldCodigo() {
		return fieldCodigo;
	}

	public void setFieldCodigo(JTextField fieldCodigo) {
		this.fieldCodigo = fieldCodigo;
	}

	public JTextField getFieldNome() {
		return fieldNome;
	}

	public void setFieldNome(JTextField fieldNome) {
		this.fieldNome = fieldNome;
	}

	public JTextField getFieldCnpj() {
		return fieldCnpj;
	}

	public void setFieldCnpj(JTextField fieldCnpj) {
		this.fieldCnpj = fieldCnpj;
	}

	public JTextField getFieldEnderco() {
		return fieldEnderco;
	}

	public void setFieldEnderco(JTextField fieldEnderco) {
		this.fieldEnderco = fieldEnderco;
	}

	public JButton getButtonSalvar() {
		return buttonSalvar;
	}

	public void setButtonSalvar(JButton buttonSalvar) {
		this.buttonSalvar = buttonSalvar;
	}

	public JButton getButtonSair() {
		return buttonSair;
	}

	public void setButtonSair(JButton buttonSair) {
		this.buttonSair = buttonSair;
	}

	
	
}
