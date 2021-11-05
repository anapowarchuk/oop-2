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
	private JTextField fieldCPF;
	private JTextField fieldNome;
	private JLabel labelEndereco;
	private JLabel labelSalario;
	private JTextField fieldEndereco;
	private JTextField fieldSalario;
	private JButton buttonCadastrar;
	private JButton buttonAtualizar;
	private JButton buttonRemover;
	private JButton buttonConsultar;

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
		setBounds(100, 100, 677, 224);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][][][][grow]", "[][][][20px][]"));
		
		JLabel labelCpf = new JLabel("CPF");
		contentPane.add(labelCpf, "cell 0 0,alignx left");
		
		fieldCPF = new JTextField();
		contentPane.add(fieldCPF, "cell 1 0,spanx 2, growx");
		fieldCPF.setColumns(10);
		
		JLabel labelNome = new JLabel("Nome");
		contentPane.add(labelNome, "split 2,cell 3 0, alignx left, spanx 3");
		
		fieldNome = new JTextField();
		contentPane.add(fieldNome, "cell 5 0 2 1,growx");
		fieldNome.setColumns(10);
		
		labelEndereco = new JLabel("Endere\u00E7o");
		labelEndereco.setToolTipText("");
		contentPane.add(labelEndereco, "cell 0 1,alignx left");
		
		fieldEndereco = new JTextField();
		contentPane.add(fieldEndereco, "cell 1 1,grow");
		fieldEndereco.setColumns(10);
		
		labelSalario = new JLabel("Sal\u00E1rio");
		contentPane.add(labelSalario, "cell 0 2,alignx left");
		
		fieldSalario = new JTextField();
		contentPane.add(fieldSalario, "cell 1 2,grow");
		fieldSalario.setColumns(10);
		
		buttonCadastrar = new JButton("Cadastrar");
		contentPane.add(buttonCadastrar, "cell 1 4,growx");
		
		buttonAtualizar = new JButton("Atualizar");
		contentPane.add(buttonAtualizar, "cell 2 4,growx");
		
		buttonRemover = new JButton("Remover");
		contentPane.add(buttonRemover, "cell 3 4,growx");
		
		buttonConsultar = new JButton("Consultar");
		contentPane.add(buttonConsultar, "cell 4 4,growx");
		
	}

	public JTextField getFieldCPF() {
		return fieldCPF;
	}

	public void setFieldCPF(JTextField fieldCPF) {
		this.fieldCPF = fieldCPF;
	}

	public JTextField getFieldNome() {
		return fieldNome;
	}

	public void setFieldNome(JTextField fieldNome) {
		this.fieldNome = fieldNome;
	}

	public JLabel getLabelEndereco() {
		return labelEndereco;
	}

	public void setLabelEndereco(JLabel labelEndereco) {
		this.labelEndereco = labelEndereco;
	}

	public JLabel getLabelSalario() {
		return labelSalario;
	}

	public void setLabelSalario(JLabel labelSalario) {
		this.labelSalario = labelSalario;
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

	public JButton getButtonConsultar() {
		return buttonConsultar;
	}

	public void setButtonConsultar(JButton buttonConsultar) {
		this.buttonConsultar = buttonConsultar;
	}

	
}
