import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class TestaPedido {
	public static Pedido criaPedido() {
		Produto produto1 = TestaProduto.criaProduto1();
		Produto produto2 = TestaProduto.criaProduto2();
		ItemPed item1 = new ItemPed();
		ItemPed item2 = new ItemPed();
		item1.cadastrar(produto1, 2);
		item2.cadastrar(produto2, 5);
				
		Cliente cliente = new Cliente();
		cliente.cadastrar("1", "12345678909");
		
		FormPag formpag = new FormPag();
		formpag.setNome("Crédito");
		
		Nf nf = new Nf();
		nf.setCodBar("78995865937");
		LocalDate dt = LocalDate.now();
		
		nf.setDataEmi(dt);
		nf.setNum("2535");
		Pedido pedido = new Pedido(); 
		pedido.cadastrar("1", cliente, formpag, nf);
		pedido.adicionarItens(item1, item2);
		return pedido;
	}
	public static void main(String[] args) {
		Pedido pedido = TestaPedido.criaPedido();
		
		System.out.println("Número: " + pedido.getNumero());
		System.out.println("Forma de pagamento: " + pedido.getFormPag().getNome());
		System.out.println("Cliente: " + pedido.getCliente().apresentarCpf());
		pedido.getItens().forEach(itemPed -> itemPed.listar());
	}
}
