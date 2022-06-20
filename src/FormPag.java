
public class FormPag {
	private String nome;
	private FormPagEnum forma;
	public void listar() {
		System.out.println(this.nome);
	}
	public FormPag(String nome, FormPagEnum forma) {
		this.nome = nome;
		this.forma = forma;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public FormPagEnum getForma() {
		return forma;
	}
	public void setForma(FormPagEnum forma) {
		this.forma = forma;
	}
}
