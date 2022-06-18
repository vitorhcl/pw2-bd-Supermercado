
public class Produto {
	private String codBar;
	private String nome;
	private double precoVenda;
	private double precoCusto;
	private double estoque = 0;
	private String categoria;
	public String getCodBar() {
		return codBar;
	}
	public void setCodBar(String codBar) {
		if(codBar.length() != 13)
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
	public double getEstoque() {
		return estoque;
	}
	public void adicionar(int quantidade) {
		this.estoque += estoque;
	}
	public void remover(int quantidade) {
		this.estoque += estoque;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public void listar() {
		Formatador f = new Formatador();
		
		if(nome != null)
			System.out.println("Nome: " + this.getNome());
		if(codBar != null)
			System.out.println("Código de barras: " + f.codBar(this.getCodBar()));
		if(precoCusto > 0)
			System.out.println("Preço de custo: " + f.moeda(this.getPrecoCusto()));
		if(precoVenda > 0)
			System.out.println("Preço de venda: " + f.moeda(this.getPrecoVenda()));
		if(categoria != null)
			System.out.println("Categoria: " + this.getCategoria());
	}
	public void cadastrar(String codBar, double precoVenda, String categoria) {
		this.setCodBar(codBar);
		this.precoVenda = precoVenda;
		this.categoria = categoria;
	}
}
