package by.bsu.lab13;

import by.bsu.lab13.util.TaskSolver;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class TaskSolverTest {
    List<Double> I;
    List<Double> U;
    double R;
    double error;

    @Before
    public void initialization() {
        I = Arrays.asList(1.0, 2.0, 3.0, 4.0);
        U = Arrays.asList(3.0, 4.0, 5.0, 6.0);
        R = 1.6666666666666667;
        error = 0.4908639893023787;
    }

    @Test
    public void getR() {
        Map<String, Number> expected = new HashMap<>();
        expected.put("+calculationError", R + error);
        expected.put("-calculationError", R - error);
        assertEquals(expected, TaskSolver.resistCounter(I, U));
    }
}
