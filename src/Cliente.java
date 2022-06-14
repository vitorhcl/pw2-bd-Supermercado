
public class Cliente {
	private String codigo;
	private String cpf;
	public String getCodigo() {
		return codigo;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public void listar() {
		Formatador f = new Formatador();
		System.out.println(String.format("Cliente %s: %s", codigo, f.cpf(cpf)));
	}
	public void cadastrar(String codigo, String cpf) {
		this.codigo = codigo;
		this.cpf = cpf;
	}
}
