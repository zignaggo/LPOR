package LNPG_07_SUBPROGRAMAS.java;

import java.util.Scanner;

public class CaixaEletronico {
    static double saldo = 1000.00;

    static double saque(double valor, double saldo) throws Exception {
        double total = saldo - valor;
        if (total < 0) {
            throw new Exception("O valor do saque excede o valor da conta");
        }
        return total;
    }

    static double deposito(double valor, double saldo) throws Exception {
        if (valor < 0) {
            throw new Exception("O valor de despósito deve ser maior que 0");
        }
        return saldo + valor;
    }

    static void menu(double saldo) {
        System.out.printf(
                "Bem-vindo ao Caixa Eletrônico\nSeu saldo atual é: R$%.2f\nEscolha uma opção:\n1 - Saque\n2 - Depósito\n3 - Consultar Saldo\nSua Resposta: ", saldo);
    }

    static void mostrarSaldo(double saldo) {
        System.out.printf("Seu saldo atual é: R$%.2f", saldo);
    }
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);) {
            int opcao;
            double valor;
            menu(saldo);
            opcao = scanner.nextInt();
            if (opcao == 1){
                System.out.println("Digite o valor do saque:");
                valor = scanner.nextDouble();
                saldo = saque(valor, saldo);
                System.out.printf("Saque de R$%.2f realizado.", valor);
                System.out.printf("\nSaldo de: R$%.2f", saldo);
            }
            else if (opcao == 2){
                System.out.println("Digite o valor do depósito:");
                valor = scanner.nextDouble();
                saldo = deposito(valor, saldo);
                System.out.printf("Depósito de R$%.2f realizado.", valor);
                System.out.printf("\nSaldo de: R$%.2f", saldo);
            }
            else if (opcao == 3){
                mostrarSaldo(saldo);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
