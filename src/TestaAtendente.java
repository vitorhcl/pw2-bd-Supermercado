
public class TestaAtendente {
	public static void main(String[] args) {
		Pedido pedido = TestaPedido.criaPedido();
		
		Atendente aten = new Atendente();
		aten.cadastrar("13032350050", "Lúcia", 1800);
		aten.atenderPedido(pedido);
		
		aten.listar();
		System.out.println();
		pedido.listar();
	}
}
