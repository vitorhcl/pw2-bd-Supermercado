
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
	public Produto fornecer(Produto produto, int quantidade) {
		produto.adicionar(quantidade);
		return produto;
	}
}
