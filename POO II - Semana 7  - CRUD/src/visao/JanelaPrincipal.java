package visao;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class JanelaPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField fieldCpf;
	private JTextField fieldNome;
	private JTextField fieldEndereco;
	private JTextField fieldSalario;
	private JButton buttonConsultar;
	private JButton buttonCadastrar;
	private JButton buttonAtualizar;
	private JButton buttonRemover;
	private JButton buttonLimpar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaPrincipal frame = new JanelaPrincipal();
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
		setTitle("Empregado CRUD");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 604, 269);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][grow][][][][grow]", "[][][][][][]"));
		
		JLabel labelCpf = new JLabel("CPF");
		contentPane.add(labelCpf, "cell 0 0,alignx left");
		
		fieldCpf = new JTextField();
		contentPane.add(fieldCpf, "flowx,cell 1 0,growx, spanx 2");
		fieldCpf.setColumns(10);
		
		JLabel labelNome = new JLabel("Nome");
		contentPane.add(labelNome, "flowx,cell 3 0, alignx left, spanx 5");
		
		JLabel labelEndereco = new JLabel("Endere\u00E7o");
		contentPane.add(labelEndereco, "cell 0 1,alignx left");
		
		fieldEndereco = new JTextField();
		contentPane.add(fieldEndereco, "cell 1 1,growx,  spanx 5");
		fieldEndereco.setColumns(10);
		
		JLabel labelSalario = new JLabel("Salario");
		contentPane.add(labelSalario, "cell 0 2,alignx trailing");
		
		fieldSalario = new JTextField();
		contentPane.add(fieldSalario, "cell 1 2,growx");
		fieldSalario.setColumns(10);
		
		buttonCadastrar = new JButton("Cadastrar");
		contentPane.add(buttonCadastrar, "cell 1 5,growx");
		
		buttonAtualizar = new JButton("Atualizar");
		contentPane.add(buttonAtualizar, "cell 2 5,growx");
		
		buttonRemover = new JButton("Remover");
		contentPane.add(buttonRemover, "cell 3 5,growx");
		
		buttonConsultar = new JButton("Consultar");
		contentPane.add(buttonConsultar, "cell 4 5,growx");
		
		fieldNome = new JTextField();
		contentPane.add(fieldNome, "cell 3 0 5 1,growx");
		fieldNome.setColumns(10);
		
		buttonLimpar = new JButton("Limpar");
		contentPane.add(buttonLimpar, "cell 5 5,growx");
	}

	public JTextField getFieldCpf() {
		return fieldCpf;
	}

	public void setFieldCpf(JTextField fieldCpf) {
		this.fieldCpf = fieldCpf;
	}
	
	

	public JButton getButtonLimpar() {
		return buttonLimpar;
	}

	public void setButtonLimpar(JButton buttonLimpar) {
		this.buttonLimpar = buttonLimpar;
	}

	public JTextField getFieldNome() {
		return fieldNome;
	}

	public void setFieldNome(JTextField fieldNome) {
		this.fieldNome = fieldNome;
	}

	public JTextField getFieldEndereco() {
		return fieldEndereco;
	}

	public void setFieldEndereco(JTextField fieldEndereco) {
		this.fieldEndereco = fieldEndereco;
	}

	public JTextField getFieldSalario() {
		return fieldSalario;
	}

	public void setFieldSalario(JTextField fieldSalario) {
		this.fieldSalario = fieldSalario;
	}

	public JButton getButtonConsultar() {
		return buttonConsultar;
	}

	public void setButtonConsultar(JButton buttonConsultar) {
		this.buttonConsultar = buttonConsultar;
	}

	public JButton getButtonCadastrar() {
		return buttonCadastrar;
	}

	public void setButtonCadastrar(JButton buttonCadastrar) {
		this.buttonCadastrar = buttonCadastrar;
	}

	public JButton getButtonAtualizar() {
		return buttonAtualizar;
	}

	public void setButtonAtualizar(JButton buttonAtualizar) {
		this.buttonAtualizar = buttonAtualizar;
	}

	public JButton getButtonRemover() {
		return buttonRemover;
	}

	public void setButtonRemover(JButton buttonRemover) {
		this.buttonRemover = buttonRemover;
	}

	public void limpar () {
		getFieldCpf().setText("");
		getFieldEndereco().setText("");
		getFieldNome().setText("");
		getFieldSalario().setText("");
	}
	
	
}

