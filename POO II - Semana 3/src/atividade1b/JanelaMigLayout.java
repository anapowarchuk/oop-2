package atividade1b;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class JanelaMigLayout extends JFrame {

	private JPanel contentPane;
	private JLabel lblDescrio;
	private JTextField fieldCodigo;
	private JTextField fieldDescricao;
	private JLabel lblTotalPagar;
	private JLabel lblFormaDePagamento;
	private JLabel lblValorPago;
	private JLabel lblTroco;
	private JTextField fieldTotal;
	private JTextField fieldPagamento;
	private JTextField fieldValorPago;
	private JTextField fieldTroco;
	private JLabel lblPreo;
	private JTextField fieldPreco;
	private JLabel lblQuantidade;
	private JTextField fieldQuantidade;
	private JLabel lblValorDoItem;
	private JLabel lblSubTotal;
	private JTextField valorItemField;
	private JTextField fieldSubTotal;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaMigLayout frame = new JanelaMigLayout();
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
	public JanelaMigLayout() {
		setTitle("M\u00F3dulo PDV");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 599, 372);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[grow][grow][grow][grow]", "[grow][grow][grow][grow][grow][grow][grow][grow][][][grow][grow][][grow][grow]"));
		
		JLabel lblC = new JLabel("C\u00F3digo");
		contentPane.add(lblC, "flowx,cell 0 0");
		
		lblDescrio = new JLabel("Descri\u00E7\u00E3o");
		contentPane.add(lblDescrio, "cell 1 0");
		
		fieldCodigo = new JTextField();
		contentPane.add(fieldCodigo, "cell 0 1,grow");
		fieldCodigo.setColumns(10);
		
		fieldDescricao = new JTextField();
		contentPane.add(fieldDescricao, "cell 1 1 3 1,grow");
		fieldDescricao.setColumns(10);
		
		textArea = new JTextArea();
		contentPane.add(textArea, "cell 0 2 3 11,grow");
		
		lblPreo = new JLabel("Pre\u00E7o");
		contentPane.add(lblPreo, "cell 3 2");
		
		fieldPreco = new JTextField();
		contentPane.add(fieldPreco, "cell 3 3,grow");
		fieldPreco.setColumns(10);
		
		lblQuantidade = new JLabel("Quantidade");
		contentPane.add(lblQuantidade, "cell 3 4");
		
		fieldQuantidade = new JTextField();
		contentPane.add(fieldQuantidade, "cell 3 5,grow");
		fieldQuantidade.setColumns(10);
		
		lblValorDoItem = new JLabel("Valor do item");
		contentPane.add(lblValorDoItem, "cell 3 6");
		
		valorItemField = new JTextField();
		contentPane.add(valorItemField, "cell 3 7,grow");
		valorItemField.setColumns(10);
		
		lblSubTotal = new JLabel("Sub Total");
		contentPane.add(lblSubTotal, "cell 3 10");
		
		fieldSubTotal = new JTextField();
		contentPane.add(fieldSubTotal, "cell 3 11,grow");
		fieldSubTotal.setColumns(10);
		
		lblTotalPagar = new JLabel("Total \u00E0 Pagar");
		contentPane.add(lblTotalPagar, "cell 0 13");
		
		lblFormaDePagamento = new JLabel("Forma de Pagamento");
		contentPane.add(lblFormaDePagamento, "cell 1 13");
		
		lblValorPago = new JLabel("Valor Pago");
		contentPane.add(lblValorPago, "cell 2 13");
		
		lblTroco = new JLabel("Troco");
		contentPane.add(lblTroco, "cell 3 13");
		
		fieldTotal = new JTextField();
		contentPane.add(fieldTotal, "cell 0 14,grow");
		fieldTotal.setColumns(10);
		
		fieldPagamento = new JTextField();
		contentPane.add(fieldPagamento, "cell 1 14,grow");
		fieldPagamento.setColumns(10);
		
		fieldValorPago = new JTextField();
		contentPane.add(fieldValorPago, "cell 2 14,grow");
		fieldValorPago.setColumns(10);
		
		fieldTroco = new JTextField();
		contentPane.add(fieldTroco, "cell 3 14,grow");
		fieldTroco.setColumns(10);
	}

}
