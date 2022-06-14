
public class TestaProduto {
	static Fornecedor forn = TestaFornecedor.criaFornecedor();
	public static Produto criaProduto1() {
		Produto produto1 = forn.fornecer("Arroz", 320, 5);
		produto1.cadastrar("7898357410015", 8, "Alimentos");
		return produto1;
	}
	public static Produto criaProduto2() {
		Produto produto2 = forn.fornecer("Feijão", 370, 15);
		produto2.cadastrar("7897652320359", 20, "Alimentos");
		return produto2;
	}
	public static void main(String[] args) {
		Produto produto1 = criaProduto1();
		Produto produto2 = criaProduto2();
		
		System.out.println("Produto 1:");
		produto1.listar();
		
		System.out.println();

		System.out.println("Produto 2:");
		produto2.listar();
	}
}
