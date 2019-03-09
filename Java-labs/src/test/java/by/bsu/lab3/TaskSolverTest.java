package by.bsu.lab3;

import by.bsu.lab3.util.TaskSolver;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class TaskSolverTest {

    int numb1;
    int numb2;
    int numb3;
    int numb4;
    int numb5;
    int numb6;


    @Before
    public void initialization() {
        numb1 = 33;
        numb2 = 245;
        numb3 = 1234;
        numb4 = 1;
        numb5 = 554466;
        numb6 = 12345;
    }

    @Test
    public void countNumberOfNumerals() {
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map3 = new HashMap<>();
        HashMap<Integer, Integer> map5 = new HashMap<>();
        for (int i = 0; i <= 9; i++) {
            map1.put(i, 0);
            map3.put(i, 0);
            map5.put(i, 0);
        }
        map1.put(3, 2);

        map3.put(1, 1);
        map3.put(2, 1);
        map3.put(3, 1);
        map3.put(4, 1);

        map5.put(4, 2);
        map5.put(5, 2);
        map5.put(6, 2);

        List<Map<Integer, Integer>> expected1 = Arrays.asList(map1, map3, map5);
        List<Map<Integer, Integer>> expected2 = Arrays.asList(map5);

        assertEquals(expected1, TaskSolver.countNumberOfNumerals(numb1, numb2, numb3, numb4, numb5, numb6));
        assertEquals(expected2, TaskSolver.countNumberOfNumerals(numb2, numb4, numb5, numb6));
    }

}
