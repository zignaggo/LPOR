package LNPG_02_ESTRUTURA_CONTROLE_REPETICAO.java;

import java.util.Scanner;

public class EducativeGames {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Quantos jogos foram vendidos?");
            int games = scan.nextInt();
            int gamesToBonus = 0;
            double totalSelled = 0;
            double totalBonus = 0;
            for (int i = 0; i < games; i++) {
                gamesToBonus++;
                if (gamesToBonus == 15) {
                    totalBonus += totalSelled * 0.08;
                    gamesToBonus = 0;
                }
                totalSelled += 19.90;
            }
            System.out.printf("Total ganhos: R$%.2f", totalSelled);
            System.out.printf("\nTotal bonus: R$%.2f", totalBonus);
            System.out.printf("\nTotal all: R$%.2f", totalSelled + totalBonus);
        } catch (Exception e) {}
    }
}
