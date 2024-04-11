package fundamentos;

public class CelsiusParaFahrenheit {
	public static void main(String[] args) {
		double F;
		double C;
		final double fator = 9.0/5.0;
		final int ajuste = 32;
		
		C = 7;
			
			F = C * fator + ajuste;
			
			System.out.println("A temperatura de " + C +"º Celsius é igual a " + F + "º Fahrenheit.");
			
	}

}
