package by.bsu.lab3.util;


import java.util.*;

/**
 * There is a class to solve the task
 * @author Vlad Mikulich
 * @since JDK11
 */

public class TaskSolver {

    /**method to find number of numerals in numbers with even number of numerals
     * @param numbers
     * @return list of
     */
    public static List<Map<Integer, Integer>> countNumberOfNumerals(int ...numbers) {
        numbers = Arrays.stream(numbers).filter(numb -> String.valueOf(numb).length() % 2 == 0).toArray();
        List<Map<Integer, Integer>> res = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            HashMap<Integer, Integer> numerals = new HashMap<>();
            initMap(numerals);
            int[] digits = getArrayWithArraysOfEvenNumberOfNumerals(numbers[i]);
            for (int j = 0; j < digits.length; j++) {
                numerals.put(digits[j], numerals.get(digits[j]) + 1);
            }
            res.add(numerals);
        }
        return res;
    }

    /**method to transform number into array
     * @param number
     * @return array of numerals
     */
    private static int[] getArrayWithArraysOfEvenNumberOfNumerals(int number) {
        return Integer.toString(number).chars().map(item -> item -= '0').toArray();
    }

    /**method to fill a Map
     * @param map
     */
    private static void initMap(Map<Integer, Integer> map) {
        for (int i = 0; i <= 9; i++) {
            map.put(i, 0);
        }
    }
}


