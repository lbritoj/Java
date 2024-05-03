package classe;

public class Produto {

	String nome;
	double preco;
	double desconto;

	//Construtor Padrao
	Produto() {
		
	}

	//Construtor que recebe parametro
	Produto(String nomeInicial){
		nome = nomeInicial;
		
	}
	
	
	double precoComDesconto() {
		return (preco * (1 - desconto));
	}

}
