package LNPG_02_ESTRUTURA_CONTROLE_REPETICAO.java;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exam {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            final String answers = "1234554321";
            System.out.print("\nDigite o número de participantes: ");
            final int numberParticipants = scan.nextInt();
            int mark = 0;
            ArrayList<ArrayList<String>> participants = new ArrayList<>();
            for (int i = 0; i < numberParticipants; i++) {
                System.out.printf("Digite o nome do %s° participante: ", i + 1);
                String name = scan.next();
                System.out.print("\nDigite as respostas da prova neste modelo, ex: 1122... :");
                String participantAnswers = scan.next();
                for (int index = 0; index < answers.length(); index++) {
                    char answer = answers.charAt(index);
                    char participantAnswer = participantAnswers.charAt(index);
                    if (answer == participantAnswer) {
                        mark++;
                    }
                }
                ArrayList<String> participant = new ArrayList<>();
                participant.add(name);
                participant.add(String.valueOf(mark));
                participants.add(participant);
                mark = 0;
            }
            ArrayList<ArrayList<String>> alfabeticOrderedParticipants = participants.stream()
                    .sorted((a, b) -> a.get(0).compareTo(b.get(0)))
                    .collect(Collectors.toCollection(ArrayList::new));
            ArrayList<ArrayList<String>> orderedMarkParticipants = participants.stream()
                    .sorted((a, b) -> Integer.compare(Integer.parseInt(a.get(1)), Integer.parseInt(b.get(1))))
                    .collect(Collectors.toCollection(ArrayList::new));
            int moreThenHalfCorrect = 0;
            for (ArrayList<String> participant : orderedMarkParticipants) {
                if (Integer.parseInt(participant.get(1)) > 5) {
                    moreThenHalfCorrect++;
                }
            }
            double percentual = (moreThenHalfCorrect / orderedMarkParticipants.size()) * 100;
            for (ArrayList<String> participant : alfabeticOrderedParticipants) {
                System.out.printf("Aluno: %s -> %s Acertos\n", participant.get(0),
                        participant.get(1));
            }
            ArrayList<String> betterMark = orderedMarkParticipants.get(orderedMarkParticipants.size() - 1);
            ArrayList<String> worseMark = orderedMarkParticipants.get(0);
            System.out.printf("\nMenor pontuação foi do %s com a nota de %s acertos",
                    worseMark.get(0), worseMark.get(1));
            System.out.printf("\nMaior pontuação foi do %s com a nota de %s acertos",
                    betterMark.get(0),
                    betterMark.get(1));
            System.out.printf("\nPorcentagem de quantos acertaram mais que a metade da prova: %.2f %%",
                    percentual);

        } catch (Exception e) {
            System.out.println(e);
            // A lista de participantes e suas respectivas notas em ordem alfabética;
            // A maior pontuação, a menor pontuação e o(s) nome(s) do(s) respectivo(s)
            // participante(s);
            // O percentual de participantes com mais da metade das questões certas.

        }
    }
}
