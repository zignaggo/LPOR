package LNPG_02_ESTRUTURA_CONTROLE_REPETICAO.java;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exam {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Digite o gabarito da prova: ");
            String answers = scan.nextLine();
            ArrayList<ArrayList<String>> participants = new ArrayList<>();
            String name = "";
            String participantAnswers = " ";
            int mark = 0;
            while (true) {
                System.out.print("Digite o nome e a nota do participante: ");
                name = scan.next();
                if (name.contains("*")) {
                    break;
                }
                participantAnswers = scan.next();
                if (participantAnswers.contains("*")) {
                    break;
                }
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
            ArrayList<ArrayList<String>> orderedMarkParticipants = alfabeticOrderedParticipants.stream()
                    .sorted((a, b) -> Integer.compare(Integer.parseInt(a.get(1)), Integer.parseInt(b.get(1))))
                    .collect(Collectors.toCollection(ArrayList::new));
            long moreThenHalfCorrect = participants.stream()
                    .filter(participant -> Integer.parseInt(participant.get(1)) > 5)
                    .count();
            System.out.print(moreThenHalfCorrect);
            double percentual = (moreThenHalfCorrect / orderedMarkParticipants.size()) * 100;
            for (ArrayList<String> participant : alfabeticOrderedParticipants) {
                System.out.printf("Aluno: %s -> %s Acertos\n", participant.get(0),
                        participant.get(1));
            }
            ArrayList<String> betterMark = orderedMarkParticipants.get(orderedMarkParticipants.size() - 1);
            ArrayList<String> worseMark = orderedMarkParticipants.get(0);
            System.out.printf(
                "\nMenor nota: %s acertos  | Nome: %s",
                worseMark.get(0), worseMark.get(1)
                );
            System.out.printf(
                "\nMaior nota: %s acertos  | Nome: %s",
                betterMark.get(0),
                betterMark.get(1)
                );
            System.out.printf("\nPorcentagem de quantos acertaram mais que a metade da prova: %.2f",
                    percentual);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
