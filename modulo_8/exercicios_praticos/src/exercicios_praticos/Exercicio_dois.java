package exercicios_praticos;
import java.util.*;

public class Exercicio_dois {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		float nota1, nota2, nota3, nota4;
		
		System.out.println("Informe o valor da 1º nota:");
		nota1 = ler.nextFloat();
		
		System.out.println("Informe o valor da 2º nota:");
		nota2 = ler.nextFloat();
		
		System.out.println("Informe o valor da 3º nota:");
		nota3 = ler.nextFloat();

		System.out.println("Informe o valor da 4º nota:");
		nota4 = ler.nextFloat();
	
		System.out.printf("Media de notas = %.1f", (nota1 + nota2 + nota3 + nota4)/4 );
		ler.close();
	}
}