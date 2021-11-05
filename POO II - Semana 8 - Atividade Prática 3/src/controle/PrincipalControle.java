package controle;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import dao.ClienteDAO;
import modelo.Cliente;
import visao.JanelaPrincipal;

public class PrincipalControle implements ActionListener {

	private JanelaPrincipal jan;
	private ClienteDAO cliDAO;
	
	public PrincipalControle (JanelaPrincipal j) {
		this.jan=j;
		this.jan.getMntmAutenticar().addActionListener(this);
		this.jan.getMntmCadastrar().addActionListener(this);
		this.jan.getMntmSair().addActionListener(this);
	}
	
	public void menuAutenticar () {
		jan.getMntmCadastrar().setEnabled(false);
		CardLayout cl = (CardLayout) (jan.getPainel().getLayout());
		cl.show (jan.getPainel(),"painelL");
		jan.setTitle("Tela de Login");
	}
	
	public void menuCadastrar(){
		 CardLayout cl = (CardLayout) (jan.getPainel().getLayout());
		 cl.show (jan.getPainel(),"painelC");
		 jan.setTitle("Tela de Cadastro");
	}
	
		
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals("Autenticar")) {
			menuAutenticar();
		}
		
		if (e.getActionCommand().equals("Cadastrar")) {
			menuCadastrar();
		}
		
		if (e.getActionCommand().equals("Sair")) {
			System.exit(0);
		}
		
	}


}
