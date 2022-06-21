
public class ItemPed {
	private int qtd;
	private Produto produto;
	private Pedido pedido;

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		if (qtd == 0)
			throw new IllegalArgumentException();
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
		Formatador f = new Formatador();

		Produto produto = this.getProduto();
		System.out.println(String.format("%dx %s (%s): %s", this.getQtd(), produto.getNome(),
				f.codBar(produto.getCodBar()), f.moeda(produto.getPrecoVenda() * this.getQtd())));
	}

	public void cadastrar(Produto produto, int qtd) {
		this.produto = produto;
		this.qtd = qtd;
	}
}
