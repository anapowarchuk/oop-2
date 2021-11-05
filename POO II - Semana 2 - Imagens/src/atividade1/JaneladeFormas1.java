package atividade1;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class JaneladeFormas1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JaneladeFormas1 frame = new JaneladeFormas1();
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
	public JaneladeFormas1() {
		setTitle("Formas Geom\u00E9tricas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
	
	
	public void paint(Graphics g) {
		int vetx[] = {300, 250, 350};
		int vety [] = {100,200,200};
		
								
		super.paint(g);
		Graphics2D g2=(Graphics2D)g;
		
		Line2D li = new Line2D.Double(100, 100, 300 , 100);
		g2.setColor(Color.RED); //cor da forma
		g2.setStroke(new BasicStroke(3));//espessura da linha
		g2.draw(li);
		
		Rectangle2D rec = new Rectangle2D.Double(100, 300, 300, 200);
		g2.setColor(Color.BLUE); 
		g2.setStroke(new BasicStroke(3));//espessura da linha
		g2.draw(rec);
		g2.setColor(Color.BLUE);
		g2.fillRect(102, 299 , 297, 198);//local onde o preenchimento vai acontecer
		// g2.fill (rec); pinta todo o retalngulo
		
		
		Polygon p = new Polygon(vetx, vety, 3);
		g2.setColor(Color.GREEN);
		g2.fill(p);
		
		g2.dispose();
		
	}

}