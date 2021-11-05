package controle;

import modelo.ClienteEmpresa;
import visao.JanelaCadastro;

public class App {
	public static void main(String[] args) {
		ClienteEmpresa cli =  new ClienteEmpresa();
		JanelaCadastro ja = new JanelaCadastro();
		ja.setVisible(true);
		
		ClienteEmpresaControle ccin =  new ClienteEmpresaControle(ja, cli);
	}
}
