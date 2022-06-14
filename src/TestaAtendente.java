
public class TestaAtendente {
	public static void main(String[] args) {
		Pedido pedido = TestaPedido.criaPedido();
		Atendente aten = new Atendente();
		aten.atenderPedido(pedido);
		System.out.println("Foi antendido: " + pedido.isAtendido());
	}
}
