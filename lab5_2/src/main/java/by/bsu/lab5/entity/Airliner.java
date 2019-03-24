package by.bsu.lab5.entity;

import org.apache.log4j.Logger;

import java.util.Objects;

public class Airliner extends Plane {

    private final static Logger logger = Logger.getLogger(Airliner.class);

    private int numberOfPassengers;

    public Airliner(String type, String company, double loadCapacity, double rangeOfFlight, double fuelConsumption, double capacityCargoCompartment, int numberOfPassengers) {
        super(type, company, loadCapacity, rangeOfFlight, fuelConsumption, capacityCargoCompartment);
        this.numberOfPassengers = numberOfPassengers;
        logger.info("The airliner has been created");
    }

    public Airliner(){}

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Airliner airliner = (Airliner) o;
        return numberOfPassengers == airliner.numberOfPassengers;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfPassengers);
    }

    @Override
    public String toString() {
        return "Airliner{" +
                "numberOfPassengers=" + numberOfPassengers +
                "type='" + getType() + '\'' +
                ", company='" + getCompany() + '\'' +
                ", loadCapacity=" + getLoadCapacity() +
                ", rangeOfFlight=" + getRangeOfFlight() +
                ", fuelConsumption=" + getFuelConsumption() +
                ", capacityCargoCompartment=" + getCapacityCargoCompartment() +
                '}';
    }
}
