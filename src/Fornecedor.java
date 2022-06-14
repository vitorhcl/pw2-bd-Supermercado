
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
	public void cadastrar(String nome, String cnpj) {
		this.nome = nome;
		this.cnpj = cnpj;
	}
	public Produto fornecer(String nome, int quantidade, double precoCusto) {
		Produto produto = new Produto();
		produto.setNome(nome);
		produto.setPrecoCusto(precoCusto);
		produto.adicionar(quantidade);
		return produto;
	}
}
