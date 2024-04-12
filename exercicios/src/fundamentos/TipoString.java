package fundamentos;

public class TipoString {
	
	 public static void main(String[] args) {
		 System.out.println("Olá pessoal".charAt(4));
		 
		 String s = "Boa tarde"; //Não é possivel modificar o valor da string
		 System.out.println(s.concat("!!!"));
		 s = "Bom dia"; // Mas é poss´vel substituir o seu valor
	 	 System.out.println(s + "!!!");
	 	 System.out.println(s.startsWith("Bom"));
	 	 System.out.println(s.startsWith("bom"));
	 	 System.out.println(s.endsWith("dia"));
	 	 System.out.println(s.length());
	 	 System.out.println(s.equals("bom dia"));
	 	 System.out.println(s.equalsIgnoreCase("bom dia"));
		
	 	 var nome = "Pedro";
	 	 var sobrenome = "Santos";
	 	 var idade = 33;
	 	 var salario = 12345.67;
	 	 System.out.println("Nome: " + nome +"\nSobrenome: " +sobrenome +"\nIdade: " +idade);
	 	 System.out.printf("O senhor %s %s tem %d anos e ganha R$ %.2f", nome, sobrenome, idade, salario);
	 	 
	 	 
	 	 String frase = String.format("\n\nO senhor %s %s tem %d anos e ganha R$ %.2f", nome, sobrenome, idade, salario);
	 	 System.out.println(frase);
	 	 
	 	 System.out.println("Frase qualquer".contains("qual"));
	 	 System.out.println("Frase qualquer".indexOf("qual"));
	 	 System.out.println("Frase qualquer".substring(6));
	 	System.out.println("Frase qualquer".substring(6,9));
	 
	 	 
	 
	 }

}
