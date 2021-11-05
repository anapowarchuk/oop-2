	package controle;

import visao.JanelaPrincipal;

public class App {

	public static void main(String[] args) {
		JanelaPrincipal jan = new JanelaPrincipal ();
		jan.setVisible(true);
		
		PrincipalControle priC = new PrincipalControle (jan);
		LoginControle logC = new LoginControle (jan);
		CadastroControle cadC = new CadastroControle (jan); 
	}
}
