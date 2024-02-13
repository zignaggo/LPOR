package LNPG_01_TIPOS_E_VARIAVEIS.Java;

import java.util.Locale;
import java.util.Scanner;

public class WeightedAverage {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double result = 0;
            final int MARKS_NUMBER = 3; 
            double mark;
            double weight;
            double weightSum = 0;
            for (int i = 1; i <= MARKS_NUMBER; i++) {
                System.out.printf("\n%d° nota: ", i);
                mark = scanner.nextDouble();
                System.out.printf("%d° peso: ", i);
                weight = scanner.nextDouble();
                result += (mark * weight);
                weightSum += weight;
            }
            System.out.printf(Locale.US, "\nA média das notas foi: %.1f", result/weightSum);
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
