
public class TestaProduto {
	static Fornecedor forn = TestaFornecedor.criaFornecedor();
	public static Produto criaProduto1() {
		FornProd fp1 = new FornProd();
		
		Produto produto1 = forn.comprar("Arroz", 320, 5);
		produto1.cadastrar("7898357410015", 8, "Alimentos");
		
		fp1.setFornecedor(forn);
		fp1.setProduto(produto1);
		Supermercado.getProdutos().add(produto1);
		return produto1;
	}
	public static Produto criaProduto2() {
		FornProd fp2 = new FornProd();
		Produto produto2 = forn.comprar("Feijão", 370, 15);
		produto2.cadastrar("7897652320359", 20, "Alimentos");
		
		fp2.setFornecedor(forn);
		fp2.setProduto(produto2);
		Supermercado.getProdutos().add(produto2);
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
