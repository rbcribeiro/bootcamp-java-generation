package exercicios_praticos;

import java.util.Scanner;

public class Exercicio_tres {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		float salarioBruto, adicionalNoturno, horasExtras, descontos;
		
		System.out.println("Informe o valor do Salário Bruto:");
		salarioBruto = ler.nextFloat();
		
		System.out.println("Informe o valor do Adicional Noturno:");
		adicionalNoturno = ler.nextFloat();
		
		System.out.println("Informe o valor das Horas Extras:");
		horasExtras = ler.nextFloat();

		System.out.println("Informe o valor dos descontos:");
		descontos = ler.nextFloat();
	
		System.out.printf("Salário Líquido = %.2f", (salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos));
		ler.close();
	}
}