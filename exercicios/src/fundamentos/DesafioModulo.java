package fundamentos;

import java.util.Scanner;

public class DesafioModulo {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o primeiro número: ");
		double num1 = teclado.nextDouble();
		System.out.print("Digite o segundo número: ");
		double num2 = teclado.nextDouble();
		System.out.print("Qual a operação desejada ( + - * / %) ?");
		String op = teclado.next();
		
		
		// Lógica
		double resultado = "+".equals(op) ? num1 + num2 : 0;
		resultado = "-".equals(op) ? num1 - num2 : resultado;
		resultado = "*".equals(op) ? num1 * num2 : resultado;
		resultado = "/".equals(op) ? num1 / num2 : resultado;
		resultado = "%".equals(op) ? num1 % num2 : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f", num1, op, num2, resultado);
		
		teclado.close();
	}

}
