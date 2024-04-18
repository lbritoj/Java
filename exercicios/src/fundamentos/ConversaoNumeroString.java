package fundamentos;

public class ConversaoNumeroString {
	
	public static void main(String[] args) {
		 //usando wrapper
		Integer num1 = 10000;
		System.out.println(num1.toString());
		System.out.println(num1.toString().length()); //apos converter para string, é possível acessar todos os métodos da string
		
		//diretamente do tipo integer
		int num2 = 10000; 
		System.out.println(Integer.toString(num2));
		System.out.println(Integer.toString(num2).length());
		
		Long.toString(num2);
		//Short.toString(num2);
		//Byte.toString(num2);
		
		//concatenando com string vazia
		System.out.println("" + num2);
		System.out.println(("" + num2).length());
		
	}

}
