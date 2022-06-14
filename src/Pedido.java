import java.util.ArrayList;
import java.util.List;

public class Pedido {
	private String numero;
	private Cliente cliente;
	private FormPag formPag;
	private Atendente atendente;
	private Nf nf;
	private boolean atendido = false;
	private List<ItemPed> itens = new ArrayList<ItemPed>();
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
	public Atendente getAtendente() {
		return atendente;
	}
	public void setAtendente(Atendente atendente) {
		this.atendente = atendente;
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
	public Nf getNf() {
		return this.nf;
	}
	public void setNf(Nf nf) {
		this.nf = nf;
	}
	public void cadastrar(String numero, Cliente cliente, FormPag formPag, Nf nf) {
		this.numero = numero;
		this.cliente = cliente;
		this.formPag = formPag;
		
		nf.setPedido(this);
		int qtdTotal = 0, vlrTotal = 0;
		for(ItemPed item : this.itens) {
			qtdTotal += item.getQtd();
			vlrTotal += item.getProduto().getPrecoVenda() * item.getQtd();
		}
		nf.setQtdTotal(qtdTotal);
		nf.setTotal(vlrTotal);
		this.nf = nf;
	}
	public void listar() {
		System.out.println("Número: " + this.getNumero());
		System.out.println("Forma de pagamento: " + this.getFormPag().getNome());
		this.getCliente().listar();
		this.getItens().forEach(itemPed -> itemPed.listar());
		System.out.println("Foi atendido: " + this.isAtendido());
	}
	public void cadastrar(String numero, Cliente cliente, FormPag formPag, Nf nf, List<ItemPed> itens) {
		this.numero = numero;
		this.cliente = cliente;
		this.formPag = formPag;
		
		itens.forEach(itemPed -> itemPed.setPedido(this));
		this.itens = itens;
		
		nf.setPedido(this);
		int qtdTotal = 0;
		for(ItemPed item : itens) {
			qtdTotal += item.getQtd();
		}
		nf.setQtdTotal(qtdTotal);
		
		this.nf = nf;
	}
	public void adicionarItens(ItemPed... itens) {
		for(ItemPed item : itens)
			this.itens.add(item);
	}
	public boolean isAtendido() {
		return atendido;
	}
}
