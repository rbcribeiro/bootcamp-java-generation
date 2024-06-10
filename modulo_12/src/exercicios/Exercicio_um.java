package exercicios;

import java.util.*;

public class Exercicio_um {
	public static void main(String[] args) {
		ArrayList<String> cores = new ArrayList<>();

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite 5 cores:");

		for (int i = 0; i < 5; i++) {
			String cor = leia.nextLine();
			cores.add(cor);
		}

		System.out.println("Cores adicionadas:");
		for (String cor : cores) {
			System.out.println(cor);
		}
 
		Collections.sort(cores);

		System.out.println("\nCores ordenadas em ordem crescente:");
		for (String cor : cores) {
			System.out.println(cor);
		}

		leia.close();
	}

}
