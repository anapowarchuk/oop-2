package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ClasseConexaoMySQL {

	private static Connection con;
	private static String status;
	
	public ClasseConexaoMySQL () {
		
	}
	
	public static void abrirConexao () {
		String serverName = "localhost";
		String database = "meubanco";	
		String url = "jdbc:mysql://"+serverName+":3306/"+database+"?useTimezone=true&serverTimezone=UTC";
		String userName= "aninha";
		String password= "ana123456";
				
		try {
			con= DriverManager.getConnection(url, userName, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (con != null) {
			status= "STATUS -------> Conectado com sucesso!";
			
		}
		else {
			status= "STATUS-----> Não foi possível realizar a conexão!";
		}
		
	}
	
	public static boolean fecharConexao() {
		try {
			con.close();
			System.out.println("Conexão encerrada!");
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	
	public static void obterStatusConexao () {
		System.out.println(status);
	}
		
	public static void main(String[] args) {
		ClasseConexaoMySQL.abrirConexao();
		ClasseConexaoMySQL.obterStatusConexao();
		ClasseConexaoMySQL.fecharConexao();
	}

	public static Connection getCon() {
		return con;
	}

	public static void setCon(Connection con) {
		ClasseConexaoMySQL.con = con;
	}
	
	 
}