package exercicios;

import java.util.Scanner;

public class Exercicio_tres {
    public static void main(String[] args) {
        
    	Scanner scanner = new Scanner(System.in);
        
    	int[][] matriz = new int[3][3];
        int somaPrincipal = 0;
        int somaSecundaria = 0;
        
        System.out.println("Digite os elementos da matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
       
        System.out.println("\nElementos da Diagonal Principal:");
        for (int i = 0; i < 3; i++) {
            System.out.print(matriz[i][i] + " ");
            somaPrincipal += matriz[i][i];
        }

        System.out.println("\n\nElementos da Diagonal Secundária:");
        for (int i = 0; i < 3; i++) {
            System.out.print(matriz[i][2 - i] + " ");
            somaSecundaria += matriz[i][2 - i];
        }
        
        System.out.println("\n\nSoma dos Elementos da Diagonal Principal:\n" + somaPrincipal);
        System.out.println("Soma dos Elementos da Diagonal Secundária:\n" + somaSecundaria);
        
        scanner.close();
    }
}
