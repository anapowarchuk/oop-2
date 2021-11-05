package atividade2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import net.miginfocom.swing.MigLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JSplit extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JSplitPane splitPane;
	private JButton btnSair;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JSplit frame = new JSplit();
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
	public JSplit() {
		setTitle("JSpit Task");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 420, 318);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		splitPane = new JSplitPane();
		contentPane.add(splitPane, BorderLayout.CENTER);
		splitPane.setResizeWeight (0);
		
		JScrollPane scrollPane = new JScrollPane();
		splitPane.setLeftComponent(scrollPane);
		

		ImageIcon icon =  new ImageIcon(JSplit.class.getResource("/figuras/homer2.jpg"));
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(icon);
		scrollPane.setViewportView(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		splitPane.setRightComponent(panel_1);
		panel_1.setLayout(new MigLayout("", "[]", "[][][][][][][]"));
		
		JLabel lblNewLabel_1 = new JLabel("Nome da imagem: homer2.jpg" );
		panel_1.add(lblNewLabel_1, "cell 0 2");
		
		JLabel lblNewLabel_2 = new JLabel("Largura da imagem: " + icon.getIconWidth());
		panel_1.add(lblNewLabel_2, "cell 0 4");
		
		JLabel lblNewLabel_3 = new JLabel("Altura da imagem: " + icon.getIconHeight());
		panel_1.add(lblNewLabel_3, "cell 0 6");
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		
		btnSair= new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			System.exit(0);
			}
		});
		panel.add(btnSair);
		
		
	}
	
	
	
	public JLabel getLblNewLabel() {
		return lblNewLabel;
	}

	public void setLblNewLabel(JLabel lblNewLabel) {
		this.lblNewLabel = lblNewLabel;
	}

	public JSplitPane getSplitPane() {
		return splitPane;
	}

	public void setSplitPane(JSplitPane splitPane) {
		this.splitPane = splitPane;
	}

	public JButton getBtnSair() {
		return btnSair;
	}

	public void setBtnSair(JButton btnSair) {
		this.btnSair = btnSair;
	}
	
	

}
