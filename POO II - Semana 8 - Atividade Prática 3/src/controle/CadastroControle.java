package controle;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import dao.ClienteDAO;
import modelo.Cliente;
import visao.JanelaPrincipal;

public class CadastroControle implements ActionListener, MouseListener {
	private JanelaPrincipal jan;
	private ClienteDAO cliDAO;
	private File localImagem;

	public CadastroControle (JanelaPrincipal j) {
		this.jan=j;
		this.jan.getBtnLimpar2().addActionListener(this);
		this.jan.getBtnGravar().addActionListener(this);
		this.jan.getLabelImagemPessoa().addMouseListener(this);
		cliDAO = new ClienteDAO();
	}
	
	public void cadastrar() throws FileNotFoundException {
		String cpf, nome, end, profissao, sexo ;
		
		cpf = this.jan.getFieldCpf().getText();
		nome= this.jan.getFieldNome().getText();
		end= this.jan.getFieldEndereco().getText();
		profissao= this.jan.getComboBox().getSelectedItem().toString();
		sexo = this.jan.getButtonGroup().getSelection().getActionCommand();
		
		if(cpf.length() == 0 || nome.length() == 0 ||end.length()==0|| profissao.length() == 0 || sexo.length() == 0 ||localImagem.length() == 0) {
			JOptionPane.showMessageDialog(null,"Todos os campos devem ser preenchidos!", "Falha no Cadastro", 0);
		}else if(nome.length() > 100){
			JOptionPane.showMessageDialog(null,"O nome deve ter menos que 100 caracteres!", "Falha no Cadastro", 0);
		}else if(end.length() > 100){
			JOptionPane.showMessageDialog(null,"O endereço precisa ter menos que 100 caracteres!", "Falha no Cadastro", 0);
		}else if(cpf.length() != 14){
			JOptionPane.showMessageDialog(null,"O CPF deve ter exatos 11 caracteres!", "Falha no Cadastro", 0);
		}
		
		else {
			cliDAO.cadastraCliente(new Cliente (cpf, nome, end, profissao, sexo, localImagem));
			JOptionPane.showMessageDialog(null, nome + " cadastrado com sucesso!", "Confirmação de Cadastro", 1);	
		}
	}
	
	public void limpar () {
		this.jan.getFieldCpf().setText("");
		this.jan.getFieldEndereco().setText("");
		this.jan.getFieldNome().setText("");
		this.jan.getButtonGroup().clearSelection();
		this.jan.getLabelImagemPessoa().setText("Adicione uma foto aqui");
		this.jan.getLabelImagemPessoa().setIcon(null);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Gravar")) {
				try {
					cadastrar();
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				}
		}	
		if (e.getActionCommand().equals("Limpar")) {
			limpar();
		}
	}

	public void mouseClicked(MouseEvent e) {		
		if(e.getComponent()== jan.getLabelImagemPessoa()) {
			 	JFileChooser jf= new JFileChooser();
				jf.showOpenDialog(jf);
					
				try {
					localImagem = jf.getSelectedFile();
					this.jan.getLabelImagemPessoa().setIcon(new ImageIcon(ImageIO.read(localImagem).getScaledInstance(this.jan.getLabelImagemPessoa().getWidth(), this.jan.getLabelImagemPessoa().getHeight(), BufferedImage.TYPE_INT_RGB)));
					jan.getLabelImagemPessoa().setText("");
				} catch (IOException e1) {
					e1.printStackTrace();
				}		
		 }
	}
	
	public void mousePressed(MouseEvent e) {
		
	}

	public void mouseReleased(MouseEvent e) {
		
	}

	public void mouseEntered(MouseEvent e) {
		
	}

	public void mouseExited(MouseEvent e) {
		
	}
	
}
