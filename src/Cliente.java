
public class Cliente {
	private String codigo;
	private String cpf;
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		if(codigo.length() != 5)
			throw new IllegalArgumentException();
		this.codigo = codigo;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		if(cpf.length() != 11)
			throw new IllegalArgumentException();
		this.cpf = cpf;
	}
	public void listar() {
		Formatador f = new Formatador();
		System.out.println(String.format("Cliente %s: %s", codigo, f.cpf(cpf)));
	}
	public void cadastrar(String codigo, String cpf) {
		this.setCodigo(codigo);
		this.setCpf(cpf);
	}
}
