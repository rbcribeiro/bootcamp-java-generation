package exercicios_praticos;

import java.util.Scanner;

public class Exercicio_quatro {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		float n1, n2, n3, n4;
		
		System.out.println("Informe o 1º valor:");
		n1 = ler.nextFloat();
		
		System.out.println("Informe o 2º valor:");
		n2 = ler.nextFloat();
		
		System.out.println("Informe o 3º valor:");
		n3 = ler.nextFloat();

		System.out.println("Informe o 4º valor:");
		n4 = ler.nextFloat();
	
		System.out.printf("Diferença = %.1f", (n1*n2) - (n3*n4));
		ler.close();
	}
}