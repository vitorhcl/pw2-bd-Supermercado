import java.util.List;

public class Pedido {
	private String numPedido;
	private Cliente cliente;
	private FormPag formPag;
	private Atendente aten;
	private List<PedProd> produtos;
	public String getNumPedido() {
		return numPedido;
	}
	public void setNumPedido(String numPedido) {
		this.numPedido = numPedido;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public FormPag getFormPag() {
		return formPag;
	}
	public void setFormPag(FormPag formPag) {
		this.formPag = formPag;
	}
	public Atendente getAten() {
		return aten;
	}
	public void setAten(Atendente aten) {
		this.aten = aten;
	}
	public Pedido solicitar(String numPedido, Cliente cliente, FormPag formPag, Atendente aten, List<PedProd> produtos) {
		Pedido pedido = new Pedido();
		pedido.numPedido = numPedido;
		pedido.cliente = cliente;
		pedido.formPag = formPag;
		pedido.aten = aten;
		pedido.produtos = produtos;
		return pedido;
	};
}
