package exercicios_praticos;

import java.util.Scanner;

public class Exercicio_tres {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
        
        System.out.println("Informe o valor do Salário Bruto:");
        salarioBruto = ler.nextFloat();
        
        System.out.println("Informe o valor do Adicional Noturno:");
        adicionalNoturno = ler.nextFloat();
        
        System.out.println("Informe o valor das Horas Extras:");
        horasExtras = ler.nextFloat();

        System.out.println("Informe o valor dos descontos:");
        descontos = ler.nextFloat();
        
        salarioLiquido = (salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos);
    
        System.out.printf("Salário Líquido = %.2f", salarioLiquido);
        ler.close();
    }
}

