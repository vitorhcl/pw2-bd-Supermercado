public class TestaPedido {
	public static Pedido criaPedido() {
		Produto produto1 = TestaProduto.criaProduto1();
		Produto produto2 = TestaProduto.criaProduto2();
		ItemPed item1 = new ItemPed();
		ItemPed item2 = new ItemPed();
		item1.cadastrar(produto1, 2);
		item2.cadastrar(produto2, 5);
				
		Cliente cliente = new Cliente();
		cliente.cadastrar("00001", "12345678909");
		
		FormPag formpag = new FormPag("Crédito", FormPagEnum.CREDITO);
		
		Nf nf = new Nf();
		nf.cadastrar("7899586528937", "2535");
		
		Pedido pedido = new Pedido();
		pedido.adicionarItens(item1, item2);
		pedido.cadastrar("000001", cliente, formpag, nf);
		return pedido;
	}
	public static void main(String[] args) {
		Pedido pedido = TestaPedido.criaPedido();
		System.out.println("Pedido:");
		pedido.listar();
		
		System.out.println();
		System.out.println("Nota Fiscal: ");
		pedido.getNf().listar();
	}
}
