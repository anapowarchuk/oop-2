package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import dao.ClienteEmpresaDAO;
import modelo.ClienteEmpresa;
import visao.JanelaCadastro;

public class ClienteEmpresaControle implements ActionListener {

	private ClienteEmpresa cli;
	private JanelaCadastro jan;
	private ClienteEmpresaDAO clidao;
	
	
	public ClienteEmpresaControle (JanelaCadastro j, ClienteEmpresa c){
		this.jan = j;
		this.cli = c;
		clidao = new ClienteEmpresaDAO();
		
		this.jan.getButtonSalvar().addActionListener(this);
		this.jan.getButtonSair().addActionListener(this);

	}
	
	public void salvar() {
		String cod = this.jan.getFieldCodigo().getText();
		String cnpj = this.jan.getFieldCnpj().getText(); 
		String nome = this.jan.getFieldNome().getText();
		String endereço = this.jan.getFieldEnderco().getText(); 
		
		cli.setCnpj(cnpj);
		cli.setCodigo(cod);
		cli.setEndereço(endereço);
		cli.setNome(nome);
		//ou
		// cli = new ClienteEmpresa(cod, nome, cnpj, endereco);
		
		clidao.salvarClienteEmpresa(cli);
		
		this.jan.getFieldCodigo().setText("");
		this.jan.getFieldCnpj().setText("");
		this.jan.getFieldNome().setText("");
		this.jan.getFieldEnderco().setText("");
		
		
		
		
	}
	
	public void sair () {
		System.exit(0);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals("Salvar")) {
			salvar();
		}
		else if (e.getActionCommand().equals("Sair")) {
			sair ();
		}
	}
}
