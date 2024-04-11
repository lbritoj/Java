package fundamentos;

public class Inferencia {
	
	public static void main(String[] args) {
	
		double a = 4.5;
		System.out.println(a);
		/*
		 * Deixando o Java inferir o tipo de variável
		 * Após ele inferir, não será possível alterar o tipo
		 */
		var b = 4.5;
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);
		
		c = "Outro texto";
		System.out.println(c);
		
		double d; //variável foi declarada
		d = 132.56; //variável foi inicializada
		System.out.println(d);
		
		var e = 12; //inferiu tipo inteiro, não será possivel usar mudar para double por exemplo
		System.out.println(e);
	}

}
