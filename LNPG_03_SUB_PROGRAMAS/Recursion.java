package LNPG_03_SUB_PROGRAMAS;

import java.util.Scanner;

public class Recursion {

    static int sum(int start, int end) {
        // (1, 2)
        // 1 + (2, 2)
        // 2 + (2, 3)
        // exit
        if (end >= start) {
            return start + sum(start+1, end);
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        int n = scanner.nextInt();
        long inicio = System.nanoTime();
        int soma = sum(1, n);
        long fim = System.nanoTime();
        long tempoDecorrido = fim - inicio;
        System.out.printf("\ntempo: %s nanos", tempoDecorrido);
        System.out.println("\nA soma dos números de 1 a " + n + " é: " + soma);
        scanner.close();
        // main2(args);
    }
    public static void main2(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        int n = scanner.nextInt();
        long inicio = System.nanoTime();
        int soma = 0;
        for (int i = 1; i <= n; i++) {
            soma += i;
        }
        long fim = System.nanoTime();
        long tempoDecorrido = fim - inicio;
        System.out.printf("\ntempo: %s nanos", tempoDecorrido);
        System.out.println("\nA soma dos números de 1 a " + n + " é: " + soma);
        scanner.close();
    }
}
