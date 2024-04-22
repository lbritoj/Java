package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {
	
	public static void main(String[] args) {
		
		System.out.println("2" == "2");
		
		String s1 = new String("2");
		System.out.println("2" == s1); 
		System.out.println("2".equals(s1)); //equals vai comparar os conteúdos e não vai entrar nos pontos internos da linguagem
		
		Scanner teclado = new Scanner(System.in);
		
		String s2 = teclado.next(); // O next tambem remove os espaços em branco, diferente do nextLine
		System.out.println("2" == s2.trim()); //trim remove os espaços em branco
		System.out.println("2".equals(s2.trim()));
		teclado.close();
		
		/*
		 * A dica dessa aula é sempre usar o equals para comparar Strings.
		 */
		
	}

}
