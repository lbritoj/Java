package fundamentos;

//import java.util.Scanner;

public class Wrappers {
	public static void main(String[] args) {

		//Scanner entrada = new Scanner(System.in);

		// byte
		Byte b = 100;
		Short s = 1000;
		Integer i = Integer.parseInt("1000");

		// Integer i = Integer.parseInt(entrada.next());
		Long l = 10000000L;

		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i);
		System.out.println(l / 3);
		
		Boolean bo = Boolean.parseBoolean("True");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		Character c = '#';
		System.out.println(c.toString());
		
	}

}
