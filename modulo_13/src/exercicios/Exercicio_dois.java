package exercicios;

import java.util.*;

public class Exercicio_dois {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Stack<String> pilhaLivros = new Stack<>();
		int opcao = -1;

		while (opcao != 0) {
			System.out.println("\n\n*******************************");
			System.out.println("1 - Adicionar livro na Pilha");
			System.out.println("2 - Listar todos os livros");
			System.out.println("3 - Retirar livro da Pilha");
			System.out.println("0 - Sair");
			System.out.println("*******************************");
			System.out.println("Entre com a opção desejada:");
			opcao = leia.nextInt();
			leia.nextLine();

			switch (opcao) {
			case 1:
				System.out.println("Digite o nome do livro:");
				String nomeDoLivro = leia.nextLine();
				pilhaLivros.push(nomeDoLivro);
				System.out.println("Pilha:");
				listarLivros(pilhaLivros);
				System.out.println("Livro adicionado!");
				break;
			case 2:
				System.out.println("Lista de Livros na Pilha:");
				listarLivros(pilhaLivros);
				break;
			case 3:
				if (pilhaLivros.isEmpty()) {
					System.out.println("A Pilha está vazia!");
				} else {
					pilhaLivros.pop();
					listarLivros(pilhaLivros);
					System.out.println("Um Livro foi retirado da pilha!");
				}
				break;
			case 0:
				System.out.println("Programa Finalizado!");
				break;
			default:
				System.out.println("Opção inválida! Tente novamente.");
				break;
			}
		}
		leia.close();
	}

	private static void listarLivros(Stack<String> pilhaLivros) {
		System.out.println("Pilha:");
		for (String livro : pilhaLivros) {
			System.out.println(livro);
		}
	}
}