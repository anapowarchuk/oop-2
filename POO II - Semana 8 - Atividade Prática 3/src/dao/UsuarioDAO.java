package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import modelo.Usuario;



public class UsuarioDAO {

	private Connection con = null;
	
	public UsuarioDAO () {
		
	}
	
	public boolean autenticaUsuario (Usuario u) {
		
		ClasseConexaoMySQL.abrirConexao();
		con = ClasseConexaoMySQL.getCon( );
		
		String sql = "SELECT * FROM Usuario WHERE usuario = ? AND senha = ?";
		
		PreparedStatement prepS;
		try {
			prepS = con.prepareStatement(sql);
			prepS.setString(1, u.getUsuario());
			prepS.setString(2, u.getSenha());
			
			//rodando o login
			ResultSet res = prepS.executeQuery();
			
			//tabela de dados retorna ao ResultSet
			if (res.next()) {
				return true;
			}
			else {
				return false;
			}

			
		} catch (Exception e1) {

		}
			
		return false;
	}
}
	

