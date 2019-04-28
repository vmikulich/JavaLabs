package by.bsu.lab13.util;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TaskSolver {

    public static Map<String, Number> resistCounter(List<Double> I, List<Double> U) {
        double denominator = I.stream().reduce(0.0, (acc, item) -> acc + item*item);
        double numerator = 0;
        double numerInCalculationError = 0;
        for (int i = 0; i < I.size(); i++) {
            numerator += I.get(i)*U.get(i);
        }
        double R = numerator / denominator;
        for (int i = 0; i < I.size(); i++) {
            numerInCalculationError += Math.pow(2, R*I.get(i) - U.get(i));
        }
        double calculationError = Math.sqrt(numerInCalculationError/denominator*(I.size() - 2));
        Map<String, Number> result = new HashMap<>();
        result.put("+calculationError", R + calculationError);
        result.put("-calculationError", R - calculationError);

        return result;
    }
}
