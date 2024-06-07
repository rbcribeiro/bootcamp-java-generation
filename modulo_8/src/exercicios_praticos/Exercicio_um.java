package exercicios_praticos;

import java.util.*;

public class Exercicio_um {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		float salario, abono, novoSalario;
		
		System.out.println("Informe o valor do salário:");
		salario = ler.nextFloat();
		
		System.out.println("Informe o valor do abono:");
		abono = ler.nextFloat();
		
		novoSalario = (salario + abono);
		
		System.out.printf("Novo Salário = %.2f", novoSalario);
		ler.close();
	}
}
