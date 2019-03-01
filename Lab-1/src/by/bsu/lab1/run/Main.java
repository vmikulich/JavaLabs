package by.bsu.lab1.run;
import by.bsu.lab1.action.FormArray;

import java.util.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            try {
                int size = sc.nextInt();
                Integer[] array = FormArray.getArray(size);
                System.out.println(Arrays.toString(array));
                Arrays.sort(array);
                System.out.println(Arrays.toString(array));
                Comparator<Integer> comp = (a, b) -> b - a;
                Arrays.sort(array, comp);
                System.out.println(Arrays.toString(array));
                break;
            }
            catch (IllegalArgumentException e) {
                e.printStackTrace();
            }
        }
    }
}
