
public class TestaFornecedor {
	public static Fornecedor criaFornecedor() {
		Fornecedor forn = new Fornecedor();
		forn.cadastrar("Camil", "64904295000103");
		Supermercado.getFornecedores().add(forn);
		return forn;
	}
	public static void main(String[] args) {
		Fornecedor forn = criaFornecedor();
		forn.listar();
	}

}
