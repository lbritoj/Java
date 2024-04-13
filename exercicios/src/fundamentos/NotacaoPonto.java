package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {
		
		double a = 2.3;
		System.out.println(a);
		String s = "Bom dia X"; //S maiúsculo
		// String nao é um tipo primitivo e não é uma palavra reservada
		
		System.out.println(s);
		
		s = s.replace("X", "Senhor");
		s = s.toUpperCase();
		s = s.concat(" !!!");
		System.out.println(s);
		
		System.out.println("Leo".toUpperCase());
		
	}
}
