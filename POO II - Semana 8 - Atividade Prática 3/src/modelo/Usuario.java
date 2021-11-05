package modelo;

public class Usuario {

	private String senha;
	private String usuario;
	
	public Usuario() {
		// TODO Auto-generated constructor stub
	}
			
	public Usuario(String senha, String usuario) {
		super();
		this.senha = senha;
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	
}
