package atividade1;

import javax.swing.JOptionPane;

public class Atividade1 {
public static void main(String[] args) {
	
	String nome = JOptionPane.showInputDialog(null, "Informe o seu primeiro nome:");
	System.out.println(nome);
	
	
	JOptionPane.showMessageDialog(null, "Nome do estudante: "+ nome);
}


}
