package by.bsu.lab5.entity;

import by.bsu.lab5.constans.*;
import by.bsu.lab5.exepptions.*;
import org.apache.log4j.Logger;

import java.util.Objects;


public class Сircumference {

    private final static Logger logger = Logger.getLogger(Сircumference.class);

    private Point center;
    private double radius;

    public Сircumference(double radius, Point center) throws RadiusIllegalArgument {
        if (radius < 0) {
            logger.error(ErrorConstans.INVALIDE_RADIUS);
            throw new RadiusIllegalArgument(ErrorConstans.INVALIDE_RADIUS);
        }
        this.radius = radius;
        this.center = center;
        logger.info(CreatedMessages.СIRCUMFERENCE_CREATED);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getPerimeter() {
        return 2*Math.PI*this.radius;
    }

    @Override
    public String toString() {
        return "Сircumference{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Сircumference that = (Сircumference) o;
        return Double.compare(that.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }
}
