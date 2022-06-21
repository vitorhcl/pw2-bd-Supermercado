
public class Fornecedor implements Listavel {
	private String cnpj;
	private String nome;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		if (cnpj.length() != 14)
			throw new IllegalArgumentException();
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
		this.setCnpj(cnpj);
	}

	public void listar() {
		Formatador f = new Formatador();

		System.out.println("Nome: " + this.getNome());
		System.out.println("CNPJ: " + f.cnpj(this.getCnpj()));
	}

	public Produto comprar(String nome, int quantidade, double precoCusto) {
		Produto produto = new Produto();
		produto.setNome(nome);
		produto.setPrecoCusto(precoCusto);
		produto.adicionar(quantidade);
		return produto;
	}
}
