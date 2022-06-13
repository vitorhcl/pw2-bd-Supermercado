import java.util.LinkedList;
import java.util.List;

public class Pedido {
	private String numero;
	private Cliente cliente;
	private FormPag formPag;
	private Atendente aten;
	private boolean atendido = false;
	private List<ItemPed> itens = new LinkedList<ItemPed>();
	public String getNumero() {
		return numero;
	}
	public void setNumPedido(String numero) {
		this.numero = numero;
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
	public void atendido() {
		this.atendido = true;
	}
	public List<ItemPed> getItens() {
		return itens;
	}
	public void setItens(List<ItemPed> itens) {
		this.itens = itens;
	}
	public void cadastrar(String numero, Cliente cliente, FormPag formPag) {
		this.numero = numero;
		this.cliente = cliente;
		this.formPag = formPag;
	}
	public void cadastrar(String numero, Cliente cliente, FormPag formPag, List<ItemPed> itens) {
		this.numero = numero;
		this.cliente = cliente;
		this.formPag = formPag;
		itens.forEach(itemPed -> itemPed.setPedido(this));
		this.itens = itens;
	}

	public void adicionarItens(ItemPed... itens) {
		for(ItemPed item : itens)
			this.itens.add(item);
	}
}
