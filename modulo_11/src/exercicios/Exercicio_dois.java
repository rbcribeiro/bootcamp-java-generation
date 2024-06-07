package exercicios;

import java.util.*;

public class Exercicio_dois {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] vetor = new int[10];
        int soma = 0;
        
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }
        
        System.out.println("Elementos nos índices ímpares:");
        for (int i = 1; i < vetor.length; i += 2) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println("\n");
        
        System.out.println("Elementos pares:");
        for (int num : vetor) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println("\n");
        
        for (int num : vetor) {
            soma += num;
        }
        System.out.println("Soma: " + soma + "\n");
        
        double media = (double) soma / vetor.length;
        System.out.println("Média: " + String.format("%.2f", media) + "\n");
        
        scanner.close();
    }
}
