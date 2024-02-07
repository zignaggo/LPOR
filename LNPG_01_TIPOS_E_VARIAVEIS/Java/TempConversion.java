package LNPG_01_TIPOS_E_VARIAVEIS.Java;

import java.util.Locale;
import java.util.Scanner;
class TempConversion {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Qual a temperatura em C°: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = celsius * 1.8 + 32;
            System.out.printf(Locale.US, "Convertendo %.1f° para fahrenheit temos: %.1f°", celsius, fahrenheit);
        } catch (Exception e) {}
    }
}