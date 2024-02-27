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
                // cada 15 games 8% do valor de cada game
                // cada game custa 19.90
                // ela recebe 50% do valor total das vendas
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
            // Escreva um programa que receba como entrada a quantidade de jogos vendidos esse mês por Catarina e exiba três valores: o valor total arrecadado em vendas, o valor ganho como bônus, e o valor total que Catarina receberá no mês.
            
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
