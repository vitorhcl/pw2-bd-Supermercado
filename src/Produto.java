
public class Produto {
	private String codBar;
	private String nomeProd;
	private int precoVenda;
	private int precoCusto;
	private int estoque = 0;
	public String getCodBar() {
		return codBar;
	}
	public void setCodBar(String codBar) {
		this.codBar = codBar;
	}
	public String getNomeProd() {
		return nomeProd;
	}
	public void setNomeProd(String nomeProd) {
		this.nomeProd = nomeProd;
	}
	public int getPrecoVenda() {
		return precoVenda;
	}
	public void setPrecoVenda(int precoVenda) {
		this.precoVenda = precoVenda;
	}
	public int getPrecoCusto() {
		return precoCusto;
	}
	public void setPrecoCusto(int precoCusto) {
		this.precoCusto = precoCusto;
	}
	public int getEstoque() {
		return estoque;
	}
	public void adicionar(int quantidade) {
		this.estoque += estoque;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	private String categoria;
}
