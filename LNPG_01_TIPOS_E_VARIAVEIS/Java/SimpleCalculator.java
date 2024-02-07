package LNPG_01_TIPOS_E_VARIAVEIS.Java;

import java.util.Locale;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Calculadora\nDigite o primeiro número: ");
            double num1 = scanner.nextDouble();
            System.out.print("Digite o segundo número: ");
            double num2 = scanner.nextDouble();
            System.out.println(
                    "Qual operação deseja fazer?\n[1] - Soma\n[2] - Subtração\n[3]- Multiplicação\n[4] - Divisão\nResposta: ");
            int res = scanner.nextInt();
            double result = 0;
            String operation = null;
            switch (res) {
                case 1:
                    result = num1 + num2;
                    operation = "+";
                    break;
                case 2:
                    result = num1 - num2;
                    operation = "-";
                    break;
                case 3:
                    result = num1 * num2;
                    operation = "x";
                    break;
                case 4:
                    result = num1 / num2;
                    operation = "/";
                    break;
                default:
                    System.out.println("Resposta não encontrada!");
                    break;
            }
            if (operation != null) {
                System.out.printf(Locale.US, "%.1f %s %.1f = %.1f", num1, operation, num2, result);
            }
        } catch (Exception e) {
        }
    }
}
