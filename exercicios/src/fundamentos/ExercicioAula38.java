package fundamentos;

import java.util.Scanner;

public class ExercicioAula38 {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		//criar um scanner
		//pegar tres strings usando next Line
		//receber os ultimos tres salarios
		//calcular a média
		//pode separar as casas decimais com virgula ou ponto
		
		System.out.print("Informe o primeiro salário:");
		String salario1 = teclado.next().replace(",", ".");
		System.out.print("\nInforme o segundo salário:");
		String salario2 = teclado.next().replace(",", ".");
		System.out.print("\nInforme o terceiro salário:");
		String salario3 = teclado.next().replace(",", ".");
		
		teclado.close();
		
		double s1 = Double.parseDouble(salario1);
		double s2 = Double.parseDouble(salario2);
		double s3 = Double.parseDouble(salario3);
		
		double media = ( s1 + s2 + s3 ) / 3;
		
		System.out.println(media);
	}

}
