package classe;

import java.util.Scanner;

public class ProdutoTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Produto p1 = new Produto("Notebook");
		//p1.nome = "Notebook";
		p1.preco = 4359.89;
		p1.desconto = 0.25;
		
		var p2 = new Produto();
		p2.nome = "Caneta";
		p2.preco = 2.56;
		p2.desconto = 0.29;
		
		double preco1 = p1.precoComDesconto();
		double preco2 = p2.precoComDesconto();
		
		System.out.println(preco1);
		System.out.println(preco2);
	}

}
