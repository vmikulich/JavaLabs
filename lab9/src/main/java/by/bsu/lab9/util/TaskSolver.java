package by.bsu.lab9.util;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TaskSolver {
    public static List<String> wordSorter(String str, char givenLetter) {
        String[] strs = str.split("[^a-zA-Z]+");
        return Arrays.stream(strs).sorted((word1, word2) -> {
            int count1 = lettersCounter(word1, givenLetter);
            int count2 = lettersCounter(word2, givenLetter);
            if (count1 == count2) {
                return word1.compareTo(word2);
            }
            return count1 - count2;
        }).collect(Collectors.toList());
    }

    public static int lettersCounter(String word, char givenLetter) {
        int counter = 0;
        char[] letters = word.toCharArray();
        for (char letter : letters) {
            if (letter == givenLetter) {
                counter++;
            }
        }
        return counter;
    }

}
