package controle;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import dao.ClienteDAO;
import dao.UsuarioDAO;
import modelo.Cliente;
import modelo.Usuario;
import visao.JanelaPrincipal;

public class LoginControle implements ActionListener {

	private JanelaPrincipal jan;
	private UsuarioDAO usuDAO;
	
	public LoginControle (JanelaPrincipal j) {
		this.jan=j;
		this.jan.getBtnAutenticar().addActionListener(this);
		this.jan.getBtnLimpar().addActionListener(this);
		usuDAO = new UsuarioDAO();	
	}

	public void autenticaCliente () {
		String usuario =  this.jan.getFieldUsuario().getText(), senha= this.jan.getFieldSenha().getText();
	
		Usuario usu = new Usuario (usuario,senha);
		
		if (usuario.length()==0||senha.length()==0) {
			JOptionPane.showMessageDialog(null, "Campos Incompletos", "Falha ao autenticar", 0);
		}
		else {
			if (usuDAO.autenticaUsuario(usu)) {
				this.jan.getMntmCadastrar().setEnabled(true);
				JOptionPane.showMessageDialog(null, "Usuário autenticado!");
			}
			else {
				JOptionPane.showMessageDialog(null, "Usuário não encontrado!", "Falha ao autenticar", 0);
			}
		}
	}
	
	
	public void limpar() {
		this.jan.getFieldSenha().setText("");
		this.jan.getFieldUsuario().setText("");
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Autenticar")) {
			autenticaCliente(); 
		}
		
		if (e.getActionCommand().equals("Limpar")) {
			limpar ();
		}
	}
}
