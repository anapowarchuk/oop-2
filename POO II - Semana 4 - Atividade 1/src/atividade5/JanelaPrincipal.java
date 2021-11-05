package atividade5;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;


public class JanelaPrincipal extends JFrame {

	private JPanel contentPane;
	private static JanelaPrincipal frame;
	int acertos;
	int erros;

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
		setBounds(100, 100, 380, 245);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel labelTitulo = new JLabel("Question\u00E1rio");
		labelTitulo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		labelTitulo.setBounds(108, 47, 130, 40);
		contentPane.add(labelTitulo);

		JButton buttonComecar = new JButton("Iniciar");
		buttonComecar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				JDialogDemo1 jd1 = new JDialogDemo1(frame);
				JDialogDemo2 jd2 = new JDialogDemo2(frame);
				JDialogDemo3 jd3 = new JDialogDemo3(frame);
				JDialogDemo jd = new JDialogDemo(frame);

				jd1.getLabelPergunta().setText("Quanto é 1+1?");
				jd1.getAlternativa1().setText("2");
				jd1.getAlternativa2().setText("3");
				jd1.getAlternativa3().setText("4");
				jd1.getAlternativa4().setText("5");
				jd1.getAlternativa5().setText("6");
				jd1.setVisible(true);
				jd1.getButtonVerifica().addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						jd1.getAlternativa1().setEnabled(false);
						jd1.getAlternativa2().setEnabled(false);
						jd1.getAlternativa3().setEnabled(false);
						jd1.getAlternativa4().setEnabled(false);
						jd1.getAlternativa5().setEnabled(false);

						if (jd1.getAlternativa1().isSelected()) {
							JOptionPane.showMessageDialog(null, "Resposta correta!", null, 0,
									new ImageIcon(JDialogDemo.class.getResource("/figuras/ok1.png")));
							acertos++;
						} else if (jd1.getAlternativa3().isSelected() || jd1.getAlternativa2().isSelected()||
								 jd1.getAlternativa4().isSelected() || jd1.getAlternativa5().isSelected()) {
							JOptionPane.showMessageDialog(null, "Resposta incorreta!", null, 0,
									new ImageIcon(JDialogDemo.class.getResource("/figuras/exit.png")));
							erros++;
						} else {
							JOptionPane.showMessageDialog(null, "Nenhuma alternativa selecionada!", "", 0,
									new ImageIcon(JDialogDemo.class.getResource("/figuras/alerta.png")));
						}
						jd1.setVisible(false);
						jd2.setVisible(true);
					}
				});

				jd2.getLabelPergunta().setText("Quanto é 2*2?");
				jd2.getAlternativa1().setText("1r");
				jd2.getAlternativa2().setText("2");
				jd2.getAlternativa3().setText("3");
				jd2.getAlternativa4().setText("4");
				jd2.getAlternativa5().setText("5");


				jd2.getButtonVerifica().addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						jd2.getAlternativa1().setEnabled(false);
						jd2.getAlternativa2().setEnabled(false);
						jd2.getAlternativa3().setEnabled(false);
						jd2.getAlternativa4().setEnabled(false);
						jd2.getAlternativa5().setEnabled(false);

						if (jd2.getAlternativa4().isSelected()) {
							JOptionPane.showMessageDialog(null, "Resposta correta!", null, 0,
									new ImageIcon(JDialogDemo.class.getResource("/figuras/ok1.png")));
							acertos++;
						} else if (jd2.getAlternativa1().isSelected() || jd2.getAlternativa2().isSelected()
								|| jd2.getAlternativa3().isSelected() || jd2.getAlternativa5().isSelected()) {
							JOptionPane.showMessageDialog(null, "Resposta incorreta!", null, 0,
									new ImageIcon(JDialogDemo.class.getResource("/figuras/exit.png")));
							erros++;
						} else {
							JOptionPane.showMessageDialog(null, "Nenhuma alternativa selecionada!", "", 0,
									new ImageIcon(JDialogDemo.class.getResource("/figuras/alerta.png")));
						}
						jd2.setVisible(false);
						jd3.setVisible(true);

					}
				});

				jd3.getLabelPergunta().setText("Quanto é 5 / 5?");
				jd3.getAlternativa1().setText("0");
				jd3.getAlternativa2().setText("1");
				jd3.getAlternativa3().setText("2");
				jd3.getAlternativa4().setText("3");
				jd3.getAlternativa5().setText("4");

				jd3.getButtonVerifica().addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						jd3.getAlternativa1().setEnabled(false);
						jd3.getAlternativa2().setEnabled(false);
						jd3.getAlternativa3().setEnabled(false);
						jd3.getAlternativa4().setEnabled(false);
						jd3.getAlternativa5().setEnabled(false);

						if (jd3.getAlternativa2().isSelected()) {
							JOptionPane.showMessageDialog(null, "Resposta correta!", null, 0,
									new ImageIcon(JDialogDemo.class.getResource("/figuras/ok1.png")));
							acertos++;
						} else if (jd3.getAlternativa1().isSelected() || jd3.getAlternativa4().isSelected()
								|| jd3.getAlternativa3().isSelected() || jd3.getAlternativa5().isSelected()) {
							JOptionPane.showMessageDialog(null, "Resposta incorreta!", null, 0,
									new ImageIcon(JDialogDemo.class.getResource("/figuras/exit.png")));
							erros++;
						} else {
							JOptionPane.showMessageDialog(null, "Nenhuma alternativa selecionada!", "", 0,
									new ImageIcon(JDialogDemo.class.getResource("/figuras/alerta.png")));
						}
						jd3.setVisible(false);
						jd.setVisible(true);

						jd.getLabelRespostasCertas().setText("Respostas corretas: " + acertos);
						jd.getLabelRespostasErradas().setText("Respostas erradas: " + erros);

					}
				});

			}
		});
		buttonComecar.setBounds(108, 120, 130, 23);
		contentPane.add(buttonComecar);
	}
}