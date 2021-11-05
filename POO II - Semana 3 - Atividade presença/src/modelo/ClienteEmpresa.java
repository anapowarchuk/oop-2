package modelo;

public class ClienteEmpresa {

	private String codigo;
	private String nome;
	private String cnpj;
	private String endere�o;

	public ClienteEmpresa(String codigo, String nome, String cnpj, String endere�o) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.cnpj = cnpj;
		this.endere�o = endere�o;
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

	public String getEndere�o() {
		return endere�o;
	}

	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}

	public String toString() {
		return "------------------------------------------ \n" + 
				"C�digo: " + codigo + 
				"\nNome:" + nome + 
				"\nCNPJ: " + cnpj +
				"\nEndere�o: " + endere�o + 
				"\n------------------------------------------";
	}

}
