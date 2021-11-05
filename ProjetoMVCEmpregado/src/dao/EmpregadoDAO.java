package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import modelo.Empregado;

public class EmpregadoDAO {

	private Connection con= null;
	
	public EmpregadoDAO () {
		
	}
	
	public boolean consultaEmpregado (Empregado e) {
		
		String nome= null, end= null;
		double sal=0;
				
		ClasseConexaoMySQL.abrirConexao();
		con= ClasseConexaoMySQL.getCon();
		
		String sql = "select * from Empregado where cpf like ? ";
		PreparedStatement prepS;
		
		try {
			prepS = con.prepareStatement(sql);
			prepS.setString(1, e.getCpf());
			ResultSet res = prepS.executeQuery();
			
			while (res.next())
			{
				nome=res.getString(2);
				end=res.getString(3);
				sal= res.getDouble(4);
			}
			
			e.setNome(nome);
			e.setEndereco(end);
			e.setSalario(sal);
			con.close();
			
			return true;
			
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			//e1.printStackTrace();
			try {
				con.close();
			} catch (SQLException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			
			return false;
				
		}
		
	}
}
