package LNPG_03_SUB_PROGRAMAS;

import java.io.IOException;
import java.nio.file.*;
import java.util.*;
import java.util.stream.IntStream;

public class File {
    static int getFirstOcurranceWord(List<String> lines, String word) {
        for (int i = 0; i < lines.size(); i++) {
            for (int ii = 0; ii < lines.get(i).split(" ").length; ii++) {
                if (lines.get(i).split(" ")[ii].toLowerCase().contains(word)) {
                    return i;
                }
            }
        }
        return -1;
    }

    static char getMostFrequencyVowel(List<String> words) {
        List<Integer> vowels = new ArrayList<>(List.of(0, 0, 0, 0, 0));
        int indexVowel = 0;
        for (int i = 0; i < words.size(); i++) {
            for (int ii = 0; ii < words.get(i).length(); ii++) {
                indexVowel = "aeiou".indexOf(words.get(i).charAt(ii));
                if (indexVowel != -1)
                    vowels.set(indexVowel, vowels.get(indexVowel) + 1);
            }
            ;
        }
        indexVowel = IntStream.range(0, vowels.size())
                .reduce((a, b) -> vowels.get(a) < vowels.get(b) ? b : a).getAsInt();
        return "aeiou".charAt(indexVowel);
    }

    static String getBiggestWord(List<String> words) {
        String bigger = words.get(0);
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).length() > bigger.length()) {
                bigger = words.get(i);
            }
        }
        return bigger;
    }

    static List<String> getWords(List<String> lines) {
        List<String> words = new ArrayList<>();
        for (int i = 0; i < lines.size(); i++) {
            words.addAll(List.of(lines.get(i).split(" ")));
        }
        return words;
    }

    static List<String> readLines(String path) throws IOException {
        return Files.readAllLines(Paths.get(path));
    }

    public static void main(String[] args) {
        try {
            long start = System.currentTimeMillis();
            List<String> lines = readLines("LNPG_03_SUB_PROGRAMAS/test.txt");
            List<String> words = getWords(lines);
            int numberWords = words.size();
            String biggestWord = getBiggestWord(words);
            char mostFrequencyVowel = getMostFrequencyVowel(words);
            int line = getFirstOcurranceWord(lines, "ção");
            System.out.printf("Maior palavra: %s", biggestWord);
            System.out.printf("\nQuantidade de palavras: %s", numberWords);
            System.out.printf("\nVogal de maior frequencia: %s", mostFrequencyVowel);
            System.out.printf("\nLinha encontrada: %s", line);
            long elapsed = System.currentTimeMillis() - start;
            System.out.printf("\nTempo: %s", elapsed);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
};