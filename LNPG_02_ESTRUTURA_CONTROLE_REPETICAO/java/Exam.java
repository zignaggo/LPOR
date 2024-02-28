package LNPG_02_ESTRUTURA_CONTROLE_REPETICAO.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Exam {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            String answers = "1234554321";
            System.out.print("\nDigite o número de participantes: ");
            int numberParticipants = scan.nextInt();
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
            // FIX-ME
            List<ArrayList<String>> alfabeticOrderedParticipants = participants.stream()
                    .sorted((a, b) -> {
                        var first = a.get(0);
                        var second = b.get(0);
                        return first.compareTo(second);
                    })
                    .toList(); 
            Stream.of(alfabeticOrderedParticipants)
                    .forEach(
                            participant -> System.out.printf("Aluno: %s | %s Acertos", participant.get(0),
                                    participant.get(1)));
            // System.out.printf("Maior pontuação foi do %s com a nota de %s acertos",
            // markOrderedParticipants[0][0], markOrderedParticipants[0][1]);
            // System.out.printf("Menor pontuação foi do %s com a nota de %s acertos",
            // markOrderedParticipants[2][0], markOrderedParticipants[2][1]);
        } catch (Exception e) {
            System.out.println(e);
            // A lista de participantes e suas respectivas notas em ordem alfabética;
            // A maior pontuação, a menor pontuação e o(s) nome(s) do(s) respectivo(s)
            // participante(s);
            // O percentual de participantes com mais da metade das questões certas.

        }
    }
}
