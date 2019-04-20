package by.bsu.lab6;

import by.bsu.lab6.util.TaskSolver;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class TaskSolverTest {
    String str1;
    String str2;
    String str3;

    @Before
    public void initialization() {
        str1 = "";
        str2 = "vlad:  vlad pasha kirill, kirill";
        str3 = "a,.d:a d";
    }
    @Test
    public void worCounter() {
        HashMap<String, Integer> expected1 = new HashMap<>();
        HashMap<String, Integer> expected2 = new HashMap<>();
        HashMap<String, Integer> expected3 = new HashMap<>();

        expected1.put("", 1);

        expected2.put("vlad", 2);
        expected2.put("pasha", 1);
        expected2.put("kirill", 2);

        expected3.put("a", 2);
        expected3.put("d", 2);

        assertEquals(expected1, TaskSolver.wordCounter(str1));
        assertEquals(expected2, TaskSolver.wordCounter(str2));
        assertEquals(expected3, TaskSolver.wordCounter(str3));
    }
}
