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
		
		//Object listaP [] = {"Engenheiro","Professor", "Pedreiro", "Médico"};
		//String prof = (String) JOptionPane.showInputDialog(null, "Selecione uma profissão", "Seletor de Profissões", 3, null, listaP, "Professor");
		//System.out.println(prof);
		
		
		
		//DIALOGO PARA CONFIRMAÇÃO
		
		/*int opt = JOptionPane.showConfirmDialog(null, "Confirmar o cadastro", "Confirmar operação", 1, 3, null);
		switch (opt) {
		case 0:
			System.out.println("Sim");
			break;
			
		case 1:
			System.out.println("Não");
			break;
			
		case 2:
			System.out.println("Cancelar");
			break;

		default:
			System.out.println("Nenhuma das das opções foram selecionadas");
			break;
		}*/
		
		
		//DIALOGO DE OPÇÃO
		
		Object[] botoes = {"botão 1", "botão 2", "botão 3"};
		JOptionPane.showOptionDialog(null, "Clique em algum botão", "Titulo",  1, 3, null, botoes, "botão 2");
		
	}
}
