package exercicios;

import java.util.*;

public class Exercicio_um {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Queue<String> filaClientes = new LinkedList<>();
		int opcao = -1;

		while (opcao != 0) {
			System.out.println("\n\n*******************************");
			System.out.println("1 - Adicionar Cliente na Fila");
			System.out.println("2 - Listar todos os Clientes");
			System.out.println("3 - Retirar Cliente da Fila");
			System.out.println("0 - Sair");
			System.out.println("*******************************");
			System.out.println("Entre com a opção desejada:");
			opcao = leia.nextInt();
			leia.nextLine();

			switch (opcao) {
				case 1:
					System.out.println("Digite o nome: ");
					String nome = leia.nextLine();
					filaClientes.add(nome);
					System.out.println("Cliente Adicionado!");
					listarClientes(filaClientes);
					break;
	
				case 2:
					if (filaClientes.isEmpty()) {
						System.out.println("A fila está vazia!");
					} else {
						listarClientes(filaClientes);
					} break;
	
				case 3:
					if (filaClientes.isEmpty()) {
						System.out.println("A Fila está vazia!");
					} else {
						String chamado = filaClientes.poll();
						System.out.println("O Cliente " + chamado + " foi Chamado!");
						listarClientes(filaClientes);
					} break;
	
				case 0:
					System.out.println("Programa Finalizado!");
					break;
	
				default:
					System.out.println("Opção inválida, tente novamente.");
					break;
			}
		}
		leia.close();
	}

	private static void listarClientes(Queue<String> filaClientes) {
		System.out.println("Fila:");
		for (String cliente : filaClientes) {
			System.out.println(cliente);
		}
	}
}