package by.bsu.lab6.util;

import jdk.jshell.spi.ExecutionControl;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class TaskSolver {

    public static Map<String, Integer> wordCounter(String str) {
        String[] strs = str.split("[^a-zA-Z]+");
        HashMap<String, Integer> result = new HashMap<>();
        for(String word : strs) {
            result.put(word, result.get(word) == null ? 1 : result.get(word) + 1);
        }
        return result;
    }

//    public static void main(String[] args) {
//        Map<String, Integer> map = wordCounter("");
//        for(String key : map.keySet().stream().filter(x -> x.length() > 0).collect(Collectors.toList()))
//            System.out.println(key + ", " + map.get(key));
//    }

}
