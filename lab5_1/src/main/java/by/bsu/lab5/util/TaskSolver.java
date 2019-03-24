package by.bsu.lab5.util;


import by.bsu.lab5.entity.Circle;
import by.bsu.lab5.entity.Point;

public class TaskSolver {

    public static boolean isBelongToCircle(Point point, Circle circle) {
        return Math.pow((point.getX() - circle.getCenter().getX()), 2) +
                Math.pow((point.getY() - circle.getCenter().getY()), 2) <= Math.pow(circle.getRadius(), 2);
    }

}
