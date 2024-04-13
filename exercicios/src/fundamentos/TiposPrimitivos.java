package fundamentos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		//Informações do funcionário
		
		//Tipos numéricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 563928;
		long pontosAcumulados = 3_234_845_223L; // é possível separar com _
		//Para definir um long é preciso colocar a letra L no final (minúscula ou maiúscula)
		
		//Tipos numéricos reais
		float salario = 11_445.44F; //Precisa da letra F no final
		double vendasAcumuladas = 2_991_797_103.01;
		
		//Tipo Booleano
		boolean estaDeFerias = true;
		
		//Tipo caractere
		char status = 'A';
		System.out.println(status);
		//Dias de empresa
		System.out.println(anosDeEmpresa * 365);
	
		//Numero de viagens
		System.out.println(numeroDeVoos / 2);
		
		//Pontos por real vendidos
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + " ganha -> " + salario);
		System.out.println("Férias? " + estaDeFerias);
		
	}

}
