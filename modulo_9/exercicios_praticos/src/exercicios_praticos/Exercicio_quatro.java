package exercicios_praticos;

import java.util.Scanner;

public class Exercicio_quatro {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite a primeira palavra (vertebrado/invertebrado):");
		String palavra1 = leia.nextLine();

		System.out.println("Digite a segunda palavra (ave/mamifero/inseto/anelidio):");
		String palavra2 = leia.nextLine();

		System.out.println("Digite a terceira palavra (carnivoro/onivoro/herbivoro/hematofago):");
		String palavra3 = leia.nextLine();

		leia.close();

		String animal = "";

		if (palavra1.equals("vertebrado")) {
			if (palavra2.equals("ave")) {
				if (palavra3.equals("carnivoro")) {
					animal = "Aguia";
				} else if (palavra3.equals("onivoro")) {
					animal = "Pomba";
				}
			} else if (palavra2.equals("mamifero")) {
				if (palavra3.equals("onivoro")) {
					animal = "Homem";
				} else if (palavra3.equals("herbivoro")) {
					animal = "Vaca";
				}
			}
		} else if (palavra1.equals("invertebrado")) {
			if (palavra2.equals("inseto")) {
				if (palavra3.equals("hematofago")) {
					animal = "Pulga";
				} else if (palavra3.equals("herbivoro")) {
					animal = "Lagarta";
				}
			} else if (palavra2.equals("anelidio")) {
				if (palavra3.equals("hematofago")) {
					animal = "Sanguessuga";
				} else if (palavra3.equals("onivoro")) {
					animal = "Minhoca";
				}
			}
		}

		System.out.println(animal);
	}
}
