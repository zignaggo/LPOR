package LNPG_01_TIPOS_E_VARIAVEIS.Java;

import java.util.Locale;
import java.util.Scanner;

public class WeightedAverage {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double result = 0;
            final int MARKS_NUMBER = 3; 
            for (int i = 1; i <= MARKS_NUMBER; i++) {
                System.out.printf("\n%d° nota: ", i);
                double mark = scanner.nextDouble();
                System.out.printf("%d° peso: ", i);
                double weight = scanner.nextDouble();
                double calculedMark = mark * weight;
                result += calculedMark;
            }
            System.out.printf(Locale.US, "\nA média das notas foi: %.1f", result/MARKS_NUMBER);
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
