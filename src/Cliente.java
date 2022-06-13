
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
	public String apresentarCpf() {
		return String.format("%s.%s.%s-%s", this.cpf.substring(0, 3), this.cpf.substring(3, 6), this.cpf.substring(6, 9), this.cpf.substring(9, 11));
	}
	public void cadastrar(String codigo, String cpf) {
		this.codigo = codigo;
		this.cpf = cpf;
	}
}
