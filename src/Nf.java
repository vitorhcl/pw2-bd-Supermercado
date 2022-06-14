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
	public Pedido getNumPedido() {
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
}
