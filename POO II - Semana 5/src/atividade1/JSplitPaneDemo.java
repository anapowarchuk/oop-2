package atividade1;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;

public class JSplitPaneDemo extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JSplitPaneDemo frame = new JSplitPaneDemo();
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
	public JSplitPaneDemo() {
		setTitle("SplitPane Demo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));
		
		JSplitPane splitPane = new JSplitPane();
		contentPane.add(splitPane);
		splitPane.setDividerSize(50);
		
		
		
		JPanel panel1 = new JPanel();
		splitPane.setLeftComponent(panel1);
		splitPane.setDividerLocation(200);
		
		JTextArea textArea_1 = new JTextArea(10,10);
		panel1.add(textArea_1);
		textArea_1.setMinimumSize(new Dimension(100, 100));
		
		
		JPanel panel2 = new JPanel();
		splitPane.setRightComponent(panel2);
		
		JTextArea textArea = new JTextArea(10,10);
		panel2.add(textArea);
		
		//pack(); - ajusta a tamanhos
		
	}

}
