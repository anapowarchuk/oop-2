package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import modelo.Empregado;

public class EmpregadoDAO {

	private Connection con= null;
	
	public EmpregadoDAO () {
		
	}
	
	//métodos de consulta de empregados
	public boolean consultaEmpregado (Empregado e) {
		
		String nome=null, end=null;
		double sal=0;
		
		ClasseConexaoMySQL.abrirConexao();
		con = ClasseConexaoMySQL.getCon( );
		
		String sql = "select * from Empregado where cpf like ?";
		
		PreparedStatement prepS;
		try {
			prepS = con.prepareStatement(sql);
			prepS.setString(1, e.getCpf());
			ResultSet res = prepS.executeQuery();
			
			//tabela de dados retorna ao ResultSet
			while (res.next()) {
				nome = res.getString(2);
				end= res.getString(3);
				sal = res.getDouble(4);
			}
					
			e.setNome(nome);
			e.setEndereco(end);
			e.setSalario(sal);
			JOptionPane.showMessageDialog(null, "CPF não encontrado");
			
			con.close();
			
			return true;
			
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
				e1.printStackTrace();
			
			try {
				con.close();
			} catch (SQLException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			
			return false;
		}	
		
	}
	
	public boolean cadastrarEmpregado (Empregado e) {
		ClasseConexaoMySQL.abrirConexao();
		con= ClasseConexaoMySQL.getCon();
		
		if (con!= null) {
			String sql = "INSERT INTO Empregado VALUES (?,?,?,?)";
			
			PreparedStatement prepS = null;
			
			try {
				prepS=con.prepareStatement(sql);
				prepS.setString(1,e.getCpf());
				prepS.setString(2,e.getNome());
				prepS.setString(3,e.getEndereco());
				prepS.setDouble(4,e.getSalario());
				
				int res = prepS.executeUpdate();
				
				if (res==1) {
					JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
					ClasseConexaoMySQL.fecharConexao();
					return true;
				}
				
				else {
					JOptionPane.showMessageDialog(null, "Não foi possível fazer o cadastro!");
					ClasseConexaoMySQL.fecharConexao();
					return false;
				}
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		else {
			JOptionPane.showMessageDialog(null, "Conexão não realizada");
		}
	return false;
		
	}
	
	public boolean atualizarEmpregado (Empregado e) {
		ClasseConexaoMySQL.abrirConexao();
		con = ClasseConexaoMySQL.getCon();
		
		if (con != null) {
			String sql = "UPDATE Empregado SET nome =? , endereco = ?, salario = ? WHERE cpf = ?";
			
			PreparedStatement prepS;
			
			try {
				prepS=con.prepareStatement(sql);
				prepS.setString(1,e.getCpf());
				prepS.setString(2,e.getNome());
				prepS.setString(3,e.getEndereco());
				prepS.setDouble(4,e.getSalario());
				
				int res = prepS.executeUpdate();
				
				if (res==1) {
					JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
					ClasseConexaoMySQL.fecharConexao();
					return true;
				}
				
				else {
					JOptionPane.showMessageDialog(null, "Não foi possível fazer o cadastro!");
					ClasseConexaoMySQL.fecharConexao();
					return false;
				}
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		else {
			
		}
		
		return false;
	}
	
	public boolean removerEmpregado (Empregado e) {
		ClasseConexaoMySQL.abrirConexao();
		con = ClasseConexaoMySQL.getCon();
		
		if (con != null) {
			String sql = "DELETE FROM Empregado WHERE cpf like ?";
			
			PreparedStatement prepS;

			try {
				prepS = con.prepareStatement(sql);
				prepS.setString(1, e.getCpf());

				int res = prepS.executeUpdate();

				if (res == 1) {
					JOptionPane.showMessageDialog(null, "Empregado removido com sucesso!");
					con.close();
					return true;
				}

				else {
					JOptionPane.showMessageDialog(null, "Não foi possível remover!!");
					con.close();
					return false;
				}

			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}
		return false;
	}
		
}
