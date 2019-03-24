package by.bsu.lab5.entity;

import by.bsu.lab5.constans.CreatedMessages;
import by.bsu.lab5.exepptions.RadiusIllegalArgument;
import org.apache.log4j.Logger;

import java.util.Objects;

public class Circle extends Сircumference {

    private final static Logger logger = Logger.getLogger(Сircumference.class);

    private String color;

    public Circle(double radius, String color, Point center) throws RadiusIllegalArgument{
        super(radius, center);
        this.color = color;
        logger.info(CreatedMessages.CIRCLE_CREATED);
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return Math.PI*Math.pow(this.getRadius(), 2);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Circle circle = (Circle) o;
        return Objects.equals(color, circle.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), color);
    }
}
