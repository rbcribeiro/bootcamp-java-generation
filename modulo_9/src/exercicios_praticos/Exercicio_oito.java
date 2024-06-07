package exercicios_praticos;

import java.util.*;

public class Exercicio_oito {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        float saldo = 1000.00f; 

        System.out.println("Operação:");
        int operacao = leia.nextInt();

        switch (operacao) {
            case 1:
                System.out.println("Operação - Saldo - Saldo: R$ " + saldo);
                break;
            case 2:
                System.out.println("Valor:");
                float saque = leia.nextFloat();
                if (saque > saldo) {
                    System.out.println("Operação - Saque - Saldo Insuficiente!");
                } else {
                    saldo -= saque;
                    System.out.println("Operação - Saque - Novo Saldo: R$ " + saldo);
                }
                break;
            case 3:
                System.out.println("Valor:");
                float deposito = leia.nextFloat();
                saldo += deposito;
                System.out.println("Operação - Depósito - Novo Saldo: R$ " + saldo);
                break;
            default:
                System.out.println("Operação Inválida!");
                break;
        }

        leia.close();
    }
}