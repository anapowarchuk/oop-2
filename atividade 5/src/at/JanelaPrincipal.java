package at;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
				JDialogDemo jd = new JDialogDemo(frame);
				JDialogDemo2 jd2 = new JDialogDemo2(frame);
				JDialogDemo3 jd3 = new JDialogDemo3(frame);
				JDialogFinal jdf = new JDialogFinal(frame);

				jd.getLabelPergunta().setText("Qual a duração do curso?");
				jd.getAlternativa1().setText("4 anos");
				jd.getAlternativa2().setText("5 anos");
				jd.getAlternativa3().setText("4 anos e meio");
				jd.getAlternativa4().setText("5 anos e meio");
				jd.getAlternativa5().setText("6 anos");
				jd.setVisible(true);
				jd.getButtonVerifica().addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						jd.getAlternativa1().setEnabled(false);
						jd.getAlternativa2().setEnabled(false);
						jd.getAlternativa3().setEnabled(false);
						jd.getAlternativa4().setEnabled(false);
						jd.getAlternativa5().setEnabled(false);

						if (jd.getAlternativa1().isSelected()) {
							JOptionPane.showMessageDialog(null, "Resposta correta!", null, 0,
									new ImageIcon(JDialogDemo.class.getResource("/figuras/ok1.png")));
							acertos++;
						} else if (jd.getAlternativa3().isSelected() || jd.getAlternativa2().isSelected()
								|| jd.getAlternativa4().isSelected() || jd.getAlternativa5().isSelected()) {
							JOptionPane.showMessageDialog(null, "Resposta incorreta!", null, 0,
									new ImageIcon(JDialogDemo.class.getResource("/figuras/exit.png")));
							erros++;
						} else {
							JOptionPane.showMessageDialog(null, "Nenhuma alternativa selecionada!", "", 0,
									new ImageIcon(JDialogDemo.class.getResource("/figuras/alerta.png")));
						}
						jd.setVisible(false);
						jd2.setVisible(true);
					}
				});

				jd2.getLabelPergunta().setText("Qual disciplina abaixo é ofertada no primeiro ano do curso?");
				jd2.getAlternativa1().setText("Biologia Molecular");
				jd2.getAlternativa2().setText("Introdução à Inteligência Artificial");
				jd2.getAlternativa3().setText("Banco de Dados");
				jd2.getAlternativa4().setText("Introdução à programação em saúde");
				jd2.getAlternativa5().setText("Física");

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

				jd3.getLabelPergunta().setText("Quais são as duas áreas que o profissional formado pode seguir?");
				jd3.getAlternativa1().setText("Inteligência artificial e Biociências");
				jd3.getAlternativa2().setText("Informática em Saúde e Bioinformática");
				jd3.getAlternativa3().setText("Analista de Dados e Ciência da Computação");
				jd3.getAlternativa4().setText("Biologia Molecular e Biologia tecidual");
				jd3.getAlternativa5().setText("Física das radiações e Banco de Dados");

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
						jdf.setVisible(true);
						
						jdf.getLabelRespostasCertas().setText("Respostas corretas: "+acertos);
						jdf.getLabelRespostasErradas().setText("Respostas erradas: "+erros);

					}
				});
				
						

			}
		});
		buttonComecar.setBounds(108, 120, 130, 23);
		contentPane.add(buttonComecar);
	}

}
