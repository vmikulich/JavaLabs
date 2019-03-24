package by.bsu.lab5.entity;

import org.apache.log4j.Logger;

import java.util.List;
import java.util.Objects;

public class Airline {

    private final static Logger logger = Logger.getLogger(Airline.class);

    private String name;

    private List<Plane> planes;

    public Airline(String name, List<Plane> planes) {
        this.name = name;
        this.planes = planes;
        logger.info("The Airline has been created");
    }

    public String getName() {
        return name;
    }

    public List<Plane> getPlanes() {
        return planes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addPlane(Plane plane) {
        this.planes.add(plane);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airline airline = (Airline) o;
        return Objects.equals(name, airline.name) &&
                Objects.equals(planes, airline.planes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, planes);
    }

    @Override
    public String toString() {
        return "Airline{" +
                "name='" + name + '\'' +
                ", planes=" + planes +
                '}';
    }
}
