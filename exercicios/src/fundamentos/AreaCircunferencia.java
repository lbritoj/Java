package fundamentos;

public class AreaCircunferencia {
	public static void main(String[] args) {
		double raio = 3;
		final double PI = 3.14159;
		//final -> não permite que haja alterações no valor da variável ao longo do código
		double areaCircunferencia = PI * raio * raio;
		
		System.out.println("Área = " + areaCircunferencia);
	}

}
