package by.bsu.lab9;

import by.bsu.lab9.util.TaskSolver;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TaskSolverTest {
    String str;
    char letter;
    String str1;

    @Before
    public void initialization() {
        str = "aa aaaa baba a";
        letter = 'a';
        str1 = "ababa";
    }

    @Test
    public void wordSorter() {
        List<String> expected = Arrays.asList("a", "aa", "baba", "aaaa");
        assertEquals(expected, TaskSolver.wordSorter(str, letter));
    }

    @Test
    public void lettersCounter() {
        int expected = 3;
        assertEquals(expected, TaskSolver.lettersCounter(str1, letter));
    }
}
