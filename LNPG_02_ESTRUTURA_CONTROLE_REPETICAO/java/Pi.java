package LNPG_02_ESTRUTURA_CONTROLE_REPETICAO.java;

import java.util.Scanner;
import java.lang.Math;
public class Pi {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Quantos termos deseja?");
            int terms = scan.nextInt();
            double sum = 0;
            double denominator = 1;
            for (int i = 0; i < terms; i++) {
                sum = i % 2 == 0 ? sum + (1 / Math.pow(denominator, 3)) : sum - (1 / Math.pow(denominator, 3));
                denominator+=2;
            }
            double pi = Math.cbrt(sum * 32);
            System.out.printf("pi = %.6f", pi);
        } catch (Exception e) {}
    }
}
