package fundamentos.operadores;

public class DesafioAritmeticos {
	
	public static void main(String[] args) {
		
		double a1 = (6 * (3+2));
		double a2 = Math.pow(a1, 2);
		double a3 = (a2 / (3*2));
		
		double b1 = (((1-5)*(2-7)) / 2);
		double b2 = Math.pow(b1, 2);
		
		double p1 = (a3 - b2);
		double p2 = Math.pow(p1, 3);
		
		double q = Math.pow(10, 3);
		
		double resposta = p2 /q ;
		
		System.out.println(resposta);
		
		
		
	}

}
