package modelo;

public class Empregado {

	private String endereco;
	private String nome;
	private String cpf;
	private double salario;
	
	
	public Empregado() {
	
	}


	public Empregado(String endereco, String nome, String cpf, double salario) {
		super();
		this.endereco = endereco;
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}



}
