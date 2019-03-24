package by.bsu.lab5;


import by.bsu.lab5.entity.Circle;
import by.bsu.lab5.entity.Point;
import by.bsu.lab5.exepptions.RadiusIllegalArgument;
import by.bsu.lab5.util.TaskSolver;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TaskSolverTest {
    Circle circle;
    Point point;
    Point center;
    @Before
    public void initialization() throws RadiusIllegalArgument {
        point = new Point(5, 5);
        center = new Point(7, 7);
        circle = new Circle(6, "red", center);
    }

    @Test
    public void isBelongToCircle() {
        boolean expected = true;
        assertEquals(expected, TaskSolver.isBelongToCircle(point, circle));
    }

}
