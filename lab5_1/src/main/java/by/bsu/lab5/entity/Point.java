package by.bsu.lab5.entity;

import by.bsu.lab5.constans.*;
import org.apache.log4j.Logger;

import java.util.Objects;

public class Point {

    private final static Logger logger = Logger.getLogger(Сircumference.class);

    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
        logger.info(CreatedMessages.POINT_CREATED);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Double.compare(point.x, x) == 0 &&
                Double.compare(point.y, y) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
