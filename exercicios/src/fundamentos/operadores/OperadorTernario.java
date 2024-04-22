package fundamentos.operadores;

public class OperadorTernario {
	
	public static void main(String[] args) {
		
		double media = 5.6;
		String resultadoParcial = media >= 5.0 ? "em reculperação" : "reprovado";
		String resultado = media >= 7.0? "aprovado" : resultadoParcial;
		
		System.out.println("O aluno está: " + resultado);
	}

}
