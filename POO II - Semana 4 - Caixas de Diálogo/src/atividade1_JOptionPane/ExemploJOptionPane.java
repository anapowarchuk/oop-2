package atividade1_JOptionPane;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ExemploJOptionPane {
	
	public static void main(String[] args) {
		
		//DIALOGO DE MENSAGEM
		
		// JOptionPane.showMessageDialog(null, "Emitindo uma mensagem");
		
		//JOptionPane.showMessageDialog(null, "Emitindo um alerta", "Titulo da caixa", 2, new ImageIcon (ExemploJOptionPane.class.getResource("/figuras/alerta.png")));
		//JOptionPane.showMessageDialog(null, "Emitindo um alerta", "Titulo da caixa", 2, null);
		
		
		
		//DIALOGO DE ENTRADA DE DADOS
		 
		//System.out.println(idade);
		
		//Object listaP [] = {"Engenheiro","Professor", "Pedreiro", "M�dico"};
		//String prof = (String) JOptionPane.showInputDialog(null, "Selecione uma profiss�o", "Seletor de Profiss�es", 3, null, listaP, "Professor");
		//System.out.println(prof);
		
		
		
		//DIALOGO PARA CONFIRMA��O
		
		/*int opt = JOptionPane.showConfirmDialog(null, "Confirmar o cadastro", "Confirmar opera��o", 1, 3, null);
		switch (opt) {
		case 0:
			System.out.println("Sim");
			break;
			
		case 1:
			System.out.println("N�o");
			break;
			
		case 2:
			System.out.println("Cancelar");
			break;

		default:
			System.out.println("Nenhuma das das op��es foram selecionadas");
			break;
		}*/
		
		
		//DIALOGO DE OP��O
		
		Object[] botoes = {"bot�o 1", "bot�o 2", "bot�o 3"};
		JOptionPane.showOptionDialog(null, "Clique em algum bot�o", "Titulo",  1, 3, null, botoes, "bot�o 2");
		
	}
}
