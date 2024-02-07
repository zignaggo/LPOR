package LNPG_01_TIPOS_E_VARIAVEIS.Java;
import java.util.Scanner;

public class MaiorityAge {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite sua idade: ");
            int age = scanner.nextInt();
            if (age >= 18 ) {
                System.out.println("Parabéns, você já pode ser preso!");
            } else {
                System.out.println("Ainda vai demorar um tempo pra ir para cadeia!");
            }
        } catch (Exception e) {}
    }
}
