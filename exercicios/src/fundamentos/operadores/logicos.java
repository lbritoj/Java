package fundamentos.operadores;

public class logicos {

		public static void main(String[] args) {
			boolean condicao1 = true;
			boolean condicao2 = 3 > 7;
			
			System.out.println(condicao1 && condicao2);
			System.out.println(condicao1 || condicao2);
			System.out.println(condicao1 ^ condicao2); //OU exclusivo
			System.out.println(!condicao1);
			System.out.println(!condicao2);
			System.out.println(condicao1 && !condicao2);
			System.out.println(!!condicao1);
			
		}
}
