package classe;

public class ValorVsReferencia {
	
	public static void main(String[] args) {
		
		double a = 2;
		double b = a; //atribuição por valor
		
		a++;
		b--;
		
		System.out.println(a + " ");
		
		Produto p1 = new Produto("teste");
		Produto p2 = p1; //Atribuição por referência
		
		p1.desconto = 0.22;
		p1.preco = 100.00;
		
		p2.nome = "Alterando o nome";
		
		System.out.println(p1.nome);
		
		
		
	}

}
