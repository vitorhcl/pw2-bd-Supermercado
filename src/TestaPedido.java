import java.util.LinkedList;
import java.util.List;

public class TestaPedido {
	public static void main(String[] args) {
		Produto produto1 = new Produto();
		produto1.setCodBar("7898357410015");
		produto1.setNome("Arroz");
		produto1.setCategoria("Alimentos");
		ItemPed item1 = new ItemPed();
		item1.cadastrar(produto1, 2);
		
		Produto produto2 = new Produto();
		produto2.setCodBar("7897652320359");
		produto2.setNome("Feijão");
		produto2.setCategoria("Alimentos");
		ItemPed item2 = new ItemPed();
		item2.cadastrar(produto2, 5);
				
		Cliente cliente = new Cliente();
		cliente.cadastrar("1", "12345678909");
		
		FormPag formpag = new FormPag();
		formpag.setNome("Crédito");
		
		Pedido pedido = new Pedido(); 
		pedido.cadastrar("1", cliente, formpag);
		pedido.adicionarItens(item1, item2);
		
		System.out.println("Número: " + pedido.getNumero());
		System.out.println("Forma de pagamento: " + pedido.getFormPag().getNome());
		System.out.println("Cliente: " + pedido.getCliente().apresentarCpf());
		pedido.getItens().forEach(itemPed -> System.out.println(String.format("%dx %s", itemPed.getQtdPed(), itemPed.getProduto().getNome())));
	}
}
