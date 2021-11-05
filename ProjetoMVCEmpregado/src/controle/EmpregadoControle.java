package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import dao.EmpregadoDAO;
import modelo.Empregado;
import visao.JanelaPrincipal;

public class EmpregadoControle implements ActionListener {
	
	private JanelaPrincipal jan;
	private EmpregadoDAO empDAO;
	
	public EmpregadoControle (JanelaPrincipal j) {
		
		this.jan = j;
		this.jan.getButtonConsultar().addActionListener(this);
		empDAO = new EmpregadoDAO();
				
	}
	
	
	public void consultarEmpregado () {
		String cpf = this.jan.getFieldCPF().getText();
		
		Empregado emp = new Empregado (cpf, null, null, 0);
		
		empDAO.consultaEmpregado(emp);
		
		this.jan.getFieldCPF().setText(emp.getNome());
		this.jan.getFieldEndereco().setText(emp.getEndereco());
		this.jan.getFieldSalario().setText(String.valueOf(emp.getEndereco()));
		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals("Consultar")) {
			consultarEmpregado();
		}
		
	}
	

}
