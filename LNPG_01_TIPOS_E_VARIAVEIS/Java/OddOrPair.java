package LNPG_01_TIPOS_E_VARIAVEIS.Java;
import java.util.Scanner;

public class OddOrPair {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite um número inteiro: ");
            int num = scanner.nextInt();
            if (num % 2 == 0) {
                System.out.println("Este número é par");
            } else {
                System.out.println("Este número é Ímpar");
            }
        } catch (Exception e) {}
    }
}
