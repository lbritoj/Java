package fundamentos.operadores;

public class Aritmeticos {

		public static void main(String[] args) {
			
			System.out.println(2 + 3);
			
			var x = 34.56;
			double y = 2.2;
			
			System.out.println(x + y);
			System.out.println(x - y);
			System.out.println(x * y);
			System.out.println(x / y);
			
			//as operaçoes envolvendo double sempre retornarão double
		
			int a = 8;
			int b = 3;
			
			System.out.println(a + b);
			System.out.println(a - b);
			System.out.println(a * b);
			System.out.println(a / b);
			
			//para retornar um double de uma operacao envolvendo inteiros:
			System.out.println(a / (double) b);
			
			//retornar o modulo da divisão
			System.out.println(8 % 3);
			System.out.println(a % b);
			
		
		
		}
}
