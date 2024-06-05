package exercicios_praticos;

import java.util.*;

public class Exercicio_cinco {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int codigoProduto, quantidade;

		System.out.println("Digite o código do produto (1 a 6):");
		codigoProduto = leia.nextInt();

		System.out.println("Digite a quantidade:");
		quantidade = leia.nextInt();
		leia.close();

		String nomeProduto = "";
		double precoUnitario = 0.0;
		switch (codigoProduto) {
		case 1:
			nomeProduto = "Cachorro Quente";
			precoUnitario = 10.00;
			break;
		case 2:
			nomeProduto = "X-Salada";
			precoUnitario = 15.00;
			break;
		case 3:
			nomeProduto = "X-Bacon";
			precoUnitario = 18.00;
			break;
		case 4:
			nomeProduto = "Bauru";
			precoUnitario = 12.00;
			break;
		case 5:
			nomeProduto = "Refrigerante";
			precoUnitario = 8.00;
			break;
		case 6:
			nomeProduto = "Suco de laranja";
			precoUnitario = 13.00;
			break;
		default:
			System.out.println("Código de produto inválido!");
			leia.close();
			return;
		}

		double valorTotal = precoUnitario * quantidade;

		System.out.println("Produto: " + nomeProduto);
		System.out.println("Valor total: R$ " + String.format("%.2f", valorTotal));
	}
}