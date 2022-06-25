import java.util.ArrayList;
import java.util.List;

public class Produto implements Listavel {
	private String codBar;
	private String nome;
	private double precoVenda;
	private double precoCusto;
	private int estoque = 0;
	private String categoria;
	private List<Fornecedor> fornecedores = new ArrayList<Fornecedor>();

	public String getCodBar() {
		return codBar;
	}

	public void setCodBar(String codBar) {
		if (codBar.length() != 13)
			throw new IllegalArgumentException();
		this.codBar = codBar;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}

	public double getPrecoCusto() {
		return precoCusto;
	}

	public void setPrecoCusto(double precoCusto) {
		this.precoCusto = precoCusto;
	}

	public int getEstoque() {
		return estoque;
	}

	public void adicionar(int quantidade) {
		this.estoque += quantidade;
	}

	public void remover(int quantidade) {
		this.estoque -= quantidade;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public List<Fornecedor> getFornecedores() {
		return fornecedores;
	}

	public void setFornecedores(List<Fornecedor> fornecedores) {
		this.fornecedores = fornecedores;
	}

	public void listar() {
		Formatador f = new Formatador();

		System.out.println("Nome: " + this.getNome());
		System.out.println("Código de barras: " + f.codBar(this.getCodBar()));
		System.out.println("Preço de custo: " + f.moeda(this.getPrecoCusto()));
		System.out.println("Preço de venda: " + f.moeda(this.getPrecoVenda()));
		System.out.println("Categoria: " + this.getCategoria());
		System.out.println("Estoque: " + this.getEstoque());
		
		System.out.print("Fornecedores: ");
		this.fornecedores.forEach(forn -> System.out.print(forn.getNome() + "; "));
		System.out.println();
	}

	public void cadastrar(String nome, String codBar, String categoria, double precoCusto, double precoVenda) {
		this.nome = nome;
		this.codBar = codBar;
		this.categoria = categoria;
		this.precoVenda = precoVenda;
		this.categoria = categoria;
	}
}
