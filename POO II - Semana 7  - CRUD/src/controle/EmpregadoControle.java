package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import dao.EmpregadoDAO;
import modelo.Empregado;
import visao.JanelaPrincipal;

public class EmpregadoControle implements ActionListener {

	private JanelaPrincipal jan;
	private EmpregadoDAO empDAO;
	
	public EmpregadoControle(JanelaPrincipal j) {
		this.jan=j;
		this.jan.getButtonConsultar().addActionListener(this);
		this.jan.getButtonCadastrar().addActionListener(this);
		this.jan.getButtonAtualizar().addActionListener(this);
		this.jan.getButtonRemover().addActionListener(this);
		this.jan.getButtonLimpar().addActionListener(this);
		empDAO= new EmpregadoDAO();
	}

	//chama DAO da consulta
	public void consultarEmpregado () {
		
		String cpf = this.jan.getFieldCpf().getText();
		
		Empregado emp = new Empregado (cpf, null, null, 0);
		
		empDAO.consultaEmpregado(emp);
		
		this.jan.getFieldNome().setText(emp.getNome());
		this.jan.getFieldEndereco().setText(emp.getEndereco());
		this.jan.getFieldSalario().setText(String.valueOf(emp.getSalario()));
		
	}
	
	public void cadastrarEmpregado () {
		String cpf, nome, end;
		double sal;
		
		cpf = this.jan.getFieldCpf().getText();
		nome = this.jan.getFieldNome().getText();
		end = this.jan.getFieldEndereco().getText();
		sal = Double.parseDouble(this.jan.getFieldSalario().getText());
		
		empDAO.cadastrarEmpregado(new Empregado(cpf, nome, end, sal));
		
		limpar ();
			
	}
	
	public void atualizarEmpregado () {
		String cpf, nome, end;
		double sal;
		
		cpf = this.jan.getFieldCpf().getText();
		nome = this.jan.getFieldNome().getText();
		end = this.jan.getFieldEndereco().getText();
		sal = Double.parseDouble(this.jan.getFieldSalario().getText());
		
		empDAO.atualizarEmpregado(new Empregado(cpf, nome, end, sal));
		
		limpar ();
		
	}
	
	public void removerEmpregado () {
		String cpf, nome, end;
		
	}
	
	public void limpar () {
		this.jan.getFieldCpf().setText("");
		this.jan.getFieldEndereco().setText("");
		this.jan.getFieldNome().setText("");
		this.jan.getFieldSalario().setText("");
			
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if (e.getActionCommand().equals("Consultar")) {
			if (this.jan.getFieldCpf().getText().equals("")) {
				JOptionPane.showMessageDialog(null, "É necessario informar o CPF!");
			} else {
				consultarEmpregado();
			}
			
		}
		
		if (e.getActionCommand().equals("Cadastrar")){
			if (this.jan.getFieldCpf().getText().equals("") || this.jan.getFieldNome().getText().equals("")
					|| this.jan.getFieldEndereco().getText().equals("")
					|| this.jan.getFieldSalario().getText().equals("")) {
				JOptionPane.showMessageDialog(null, "É necessário preencher todos os campos!");
			} else {
				cadastrarEmpregado();
			}
		}
		
		if (e.getActionCommand().equals("Atualizar")) {
			if (this.jan.getFieldCpf().getText().equals("") || this.jan.getFieldNome().getText().equals("")
					|| this.jan.getFieldEndereco().getText().equals("")
					|| this.jan.getFieldSalario().getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Não foi possível atualizar!");
			} else {
				atualizarEmpregado();
			}
		}
		if (e.getActionCommand().equals("Remover")) {
			if (this.jan.getFieldCpf().getText().equals("") || this.jan.getFieldNome().getText().equals("")
					|| this.jan.getFieldEndereco().getText().equals("")
					|| this.jan.getFieldSalario().getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Não foi possível remover!");
			} else {
				removerEmpregado();
			}
		}
		if (e.getActionCommand().equals("Limpar")) {
			limpar();
		}
	}
	
}
