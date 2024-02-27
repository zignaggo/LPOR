package LNPG_02_ESTRUTURA_CONTROLE_REPETICAO.java;

import java.util.Scanner;
import java.lang.Math;
public class Pi {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Quantos termos deseja?");
            int n = scan.nextInt();
            double s = 0;
            boolean sum = true;
            double division = 1;
            for (int i = 0; i <= n*2; i++) {
                if (i % 2 != 0) {
                    division = Math.pow(i, 3); // 1,3 -> 1³;
                    if (sum) {
                        s += (1 / division); 
                        sum = false;
                    } else {
                        s -= (1 / division);
                        sum = true;
                    }
                }
            }
            double pi = Math.cbrt((s*32));
            System.out.printf("\npi = %f", pi);
        } catch (Exception e) {}
    }
}
