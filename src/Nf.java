import java.util.Calendar;

public class Nf {
	public String num;
	public int total;
	private int qtdTotal;
	private String codBar;
	private int numPedido;
	private Calendar dataEmi;
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
	public int getNumPedido() {
		return numPedido;
	}
	public void setNumPedido(int numPedido) {
		this.numPedido = numPedido;
	}
	public Calendar getDataEmi() {
		return dataEmi;
	}
	public void setDataEmi(Calendar dataEmi) {
		this.dataEmi = dataEmi;
	}
}
