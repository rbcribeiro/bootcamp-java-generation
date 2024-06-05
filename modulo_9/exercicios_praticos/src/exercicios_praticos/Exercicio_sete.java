package exercicios_praticos;

import java.util.Scanner;

public class Exercicio_sete {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		String nomeColaborador, cargo;
		int codigoCargoColaborador;
		double salario, novoSalario, reajuste;

		System.out.println("Digite o nome do Colaborador:");
		nomeColaborador = leia.nextLine();

		System.out.println("Digite o código do Cargo do Colaborador (1 a 6):");
		codigoCargoColaborador = leia.nextInt();

		System.out.println("Digite o salário:");
		salario = leia.nextFloat();
		leia.close();

		cargo = "";

		switch (codigoCargoColaborador) {
		case 1:
			cargo = "Gerente";
			reajuste = 0.10;
			break;
		case 2:
			cargo = "Vendedor";
			reajuste = 0.07;
			break;
		case 3:
			cargo = "Supervisor";
			reajuste = 0.09;
			break;
		case 4:
			cargo = "Motorista";
			reajuste = 0.06;
			break;
		case 5:
			cargo = "Estoquista";
			reajuste = 0.05;
			break;
		case 6:
			cargo = "Técnico de TI";
			reajuste = 0.08;
			break;
		default:
			System.out.println("Código inválido!");
			leia.close();
			return;
		}

		novoSalario = salario + (reajuste * salario);

		System.out.println("Nome do colaborador: " + nomeColaborador + ". Cargo: " + cargo + ". Salário atualizado: "
				+ novoSalario);
	}

}
