
public class Fornecedor {
	private String cnpj;
	private String nome;
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void fornecer(Produto produto, int quantidade, double precoCusto) {
		produto.setPrecoCusto(precoCusto);
		produto.adicionar(quantidade);
	}
}
