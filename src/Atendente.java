
public class Atendente {
	private String cpf;
	private double slr;
	private String nome;
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSlr() {
		return slr;
	}
	public void setSlr(double slr) {
		this.slr = slr;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void listar() {
		Formatador f = new Formatador();
		System.out.println(String.format("%s (%s) ganha %s", this.nome, f.cpf(this.cpf), f.moeda(this.slr)));
	}
	public void cadastrar(String cpf, String nome, double slr) {
		this.nome = nome;
		this.cpf = cpf;
		this.slr = slr;
	}
	public void atenderPedido(Pedido pedido) {
		pedido.setAtendente(this);
		pedido.atendido();
	}
}
