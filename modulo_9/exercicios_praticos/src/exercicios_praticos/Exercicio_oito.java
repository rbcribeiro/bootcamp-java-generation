package exercicios_praticos;

import java.util.*;

public class Exercicio_oito {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int numero1, numero2, codigoOperacao;
		double operacao = 0;

		System.out.println("Digite o 1º número:");
		numero1 = leia.nextInt();

		System.out.println("Digite o 2º número:");
		numero2 = leia.nextInt();

		System.out.println("Digite o codigo (1-Soma/2-Subtração/3-Multiplicação/4-Divisão)");
		codigoOperacao = leia.nextInt();
		leia.close();

		switch (codigoOperacao) {
		case 1:
			operacao = numero1 + numero2;
            System.out.println(numero1 + " + " + numero2 + " = " + operacao);
			break;
		case 2:
			operacao = numero1 - numero2;
            System.out.println(numero1 + " - " + numero2 + " = " + operacao);

			break;
		case 3:
			operacao = numero1 * numero2;
            System.out.println(numero1 + " * " + numero2 + " = " + operacao);

			break;
		case 4:
            if (numero2 != 0) {
                operacao = (double) numero1 / numero2;
                System.out.println(numero1 + " / " + numero2 + " = " + operacao);
            } else {
                System.out.println("Erro: Divisão por zero não é permitida.");
            }
			break;
		default:
			System.out.println("Operação inválida!");
			leia.close();
			return;
		}

	}

}

