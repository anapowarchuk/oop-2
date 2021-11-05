package atividade2;

import javax.swing.JOptionPane;

public class Atividade2 {
	public static void main(String[] args) {
	

		float altura = Float.parseFloat (JOptionPane.showInputDialog(null, "Entrada de dados - altura"));
		System.out.println(altura);
		
		float largura = Float.parseFloat (JOptionPane.showInputDialog(null, "Entrada de dados - largura"));
		System.out.println(largura);
		
		float area = altura * largura;
		
		JOptionPane.showMessageDialog(null, "Resultado: " + area);
	} 
}
