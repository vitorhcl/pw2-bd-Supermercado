
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
	public void cadastrar(String codBar, double precoVenda, String categoria) {
		this.codBar = codBar;
		this.precoVenda = precoVenda;
		this.categoria = categoria;
	}
}
