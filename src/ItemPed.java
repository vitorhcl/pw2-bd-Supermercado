
public class ItemPed {
	private int qtd;
	private Produto produto;
	private Pedido pedido;
	public int getQtdPed() {
		return qtd;
	}
	public void setQtdPed(int qtd) {
		this.qtd = qtd;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	public void listar() {
		Produto produto = this.getProduto();
		System.out.println(String.format("%dx %s (%s)",
							this.getQtdPed(),
							produto.getNome(),
							produto.getCodBar()));
	}
	public void cadastrar(Produto produto, int qtd) {
		this.produto = produto;
		this.qtd = qtd;
	}
}
