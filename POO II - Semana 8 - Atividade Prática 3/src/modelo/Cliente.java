package modelo;


import java.io.File;
import java.io.InputStream;

public class Cliente {

	private String cpf;
	private String nome;
	private String endereco;
	private String profissao;
	private String sexo;
	private File imagem;

	
	public Cliente() {

	}
		
	
	
	public Cliente(String cpf, String nome, String endereco, String profissao, String sexo, File imagem) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.endereco = endereco;
		this.profissao = profissao;
		this.sexo = sexo;
		this.imagem = imagem;
	}



	public File getImagem() {
		return imagem;
	}


	public void setImagem(File imagem) {
		this.imagem = imagem;
	}


	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getProfissao() {
		return profissao;
	}
	
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	public String getSexo() {
		return sexo;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	
}
