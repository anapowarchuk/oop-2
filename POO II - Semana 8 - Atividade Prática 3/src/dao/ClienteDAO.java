package dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import controle.CadastroControle;
import modelo.Cliente;

public class ClienteDAO {

	private Connection con = null;
	
	
	public ClienteDAO () {
		
	}
	
	
	public boolean cadastraCliente (Cliente c) throws FileNotFoundException {
		ClasseConexaoMySQL.abrirConexao();
		con= ClasseConexaoMySQL.getCon();
		
		if (con!= null ) {
			String sql = "INSERT INTO Cliente VALUES(?,?,?,?,?,?)";
			
			PreparedStatement prepS = null;
			
			try {
					prepS = con.prepareStatement(sql);
					prepS.setString(1, c.getCpf());
					prepS.setString(2, c.getNome());
					prepS.setString (3, c.getSexo());
					prepS.setString(4, c.getProfissao());
					prepS.setString(5,c.getEndereco());
					prepS.setBlob(6, new FileInputStream (c.getImagem()));
				
			} catch (SQLException  e) {
					e.printStackTrace();
			}
				
		}
		
		return false;
	}
	
}
