package modelo;

public class ClienteEmpresa {

	private String codigo;
	private String nome;
	private String cnpj;
	private String endereço;

	public ClienteEmpresa(String codigo, String nome, String cnpj, String endereço) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.cnpj = cnpj;
		this.endereço = endereço;
	}

	public ClienteEmpresa() {

	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	public String toString() {
		return "------------------------------------------ \n" + 
				"Código: " + codigo + 
				"\nNome:" + nome + 
				"\nCNPJ: " + cnpj +
				"\nEndereço: " + endereço + 
				"\n------------------------------------------";
	}

}
