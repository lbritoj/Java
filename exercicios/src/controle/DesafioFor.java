package controle;

public class DesafioFor {
public static void main(String[] args) {
	/* String valor = "#";
	for(int i = 1; i<=5; i++) {
		System.out.println(valor);
		valor += "#";
	}*/
	
	String valor2 = "#";
	for(;valor2.length() <= 5;) {
		System.out.println(valor2);
		valor2 += "#";
	}
}
}
