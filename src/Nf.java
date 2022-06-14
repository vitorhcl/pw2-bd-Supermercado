import java.time.LocalDate;

public class Nf {
	public String num;
	public int total;
	private int qtdTotal;
	private String codBar;
	private Pedido pedido;
	private LocalDate dataEmi;
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getQtdTotal() {
		return qtdTotal;
	}
	public void setQtdTotal(int qtdTotal) {
		this.qtdTotal = qtdTotal;
	}
	public String getCodBar() {
		return codBar;
	}
	public void setCodBar(String codBar) {
		this.codBar = codBar;
	}
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido numPedido) {
		this.pedido = numPedido;
	}
	public LocalDate getDataEmi() {
		return dataEmi;
	}
	public void setDataEmi(LocalDate dt) {
		this.dataEmi = dt;
	}
	public void cadastrar(String codBar, String num) {
		this.codBar = codBar;
		
		LocalDate dt = LocalDate.now();
		this.dataEmi = dt;
		
		this.num = num;
	}
	public void cadastrar(String codBar, String num, LocalDate dataEmi) {
		this.codBar = codBar;
		this.dataEmi = dataEmi;
		this.num = num;
	}
	public void listar() {
		Formatador f = new Formatador();
		
		System.out.println("Número: " + this.getNum());
		System.out.println("Número do pedido: " + this.getPedido().getNumero());
		System.out.println("Código de barras: " + f.codBar(this.getCodBar()));
		System.out.println("Total de itens: " + this.getQtdTotal());
		System.out.println("Valor total: " + f.moeda(this.getTotal()));
		System.out.println("Data de emissão: " + f.data(this.getDataEmi()));
	}
}
