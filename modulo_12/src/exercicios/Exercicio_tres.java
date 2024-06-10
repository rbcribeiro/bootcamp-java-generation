package exercicios;

import java.util.*;

public class Exercicio_tres {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		Set<Integer> numeros = new HashSet<>();

		System.out.println("Digite 10 valores inteiros não repetidos:");

		for (int i = 0; i < 10; i++) {
			System.out.print("Valor " + (i + 1) + ": ");
			int valor = leia.nextInt();
			numeros.add(valor);
		}
		
		System.out.println("\nListar dados do Set:");
		
		Iterator<Integer> iterator = numeros.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		leia.close();
	}
}