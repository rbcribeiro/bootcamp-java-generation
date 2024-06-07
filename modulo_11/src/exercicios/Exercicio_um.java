package exercicios;

import java.util.Scanner;

public class Exercicio_um {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        
        System.out.print("Digite o número que você deseja encontrar: ");
        
        int[] vetor = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
        int numero = leia.nextInt();
        int posicao = encontrarNumero(vetor, numero);

        if (posicao != -1) {
            System.out.println("O número " + numero + " está localizado na posição: " + posicao);
        } else {
            System.out.println("O número " + numero + " não foi encontrado!");
        }

        leia.close();
    }

    public static int encontrarNumero(int[] vetor, int numero) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numero) {
                return i;
            }
        }
        return -1;
    }
}
