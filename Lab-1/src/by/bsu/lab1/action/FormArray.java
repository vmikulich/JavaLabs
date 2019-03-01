package by.bsu.lab1.action;

/**
 * This class sort arrays
 * @author Vlad Mikulich
 * @since JDK11
 */

import java.util.Random;


public class FormArray {

    private static final int RANGE = 20;
    /**method forms array
     * @return array
     * @param size of array
     * */
    public static Integer[] getArray(int size){
        if (size <= 0) {
            throw new IllegalArgumentException("Size of array must be greater than 0");
        }
        Integer[] array = new Integer[size];
        Random random = new Random();
        for(int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(RANGE);
        }
        return array;
    }
}
