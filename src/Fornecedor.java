import java.util.ArrayList;
import java.util.List;

public class Fornecedor implements Listavel {
	private String cnpj;
	private String nome;
	private List<Produto> produtos = new ArrayList<Produto>();

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
	
	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public void cadastrar(String nome, String cnpj) {
		this.nome = nome;
		this.setCnpj(cnpj);
	}

	public void listar() {
		Formatador f = new Formatador();

		System.out.println("Nome: " + this.getNome());
		System.out.println("CNPJ: " + f.cnpj(this.getCnpj()));
		System.out.print("Produtos fornecidos: ");
		this.produtos.forEach(prod -> System.out.printf("%s (%s); ", prod.getNome(), prod.getCodBar()));
	}

	public void comprar(Produto prod, int quantidade) {
		prod.adicionar(quantidade);
		if(prod.getFornecedores().contains(this))
			return;
		prod.getFornecedores().add(this);
		this.getProdutos().add(prod);
	}

}
