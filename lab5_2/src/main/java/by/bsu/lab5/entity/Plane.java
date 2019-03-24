package by.bsu.lab5.entity;

import org.apache.log4j.Logger;

import java.util.Objects;

public class Plane {

    private final static Logger logger = Logger.getLogger(Plane.class);

    private String type;
    private String company;
    private double loadCapacity;
    private double rangeOfFlight;
    private double fuelConsumption;
    private double capacityCargoCompartment;


    public Plane(String type, String company, double loadCapacity, double rangeOfFlight, double fuelConsumption, double capacityCargoCompartment) {
        this.type = type;
        this.company = company;
        this.loadCapacity = loadCapacity;
        this.rangeOfFlight = rangeOfFlight;
        this.fuelConsumption = fuelConsumption;
        this.capacityCargoCompartment = capacityCargoCompartment;
        logger.info("The plane has been created");
    }

    public Plane(){}

    public String getType() {
        return type;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public double getRangeOfFlight() {
        return rangeOfFlight;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public String getCompany() {
        return company;
    }

    public double getCapacityCargoCompartment() {
        return capacityCargoCompartment;
    }

    public void setCapacityCargoCompartment(double capacityCargoCompartment) {
        this.capacityCargoCompartment = capacityCargoCompartment;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public void setRangeOfFlight(double rangeOfFlight) {
        this.rangeOfFlight = rangeOfFlight;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plane plane = (Plane) o;
        return Double.compare(plane.loadCapacity, loadCapacity) == 0 &&
                Double.compare(plane.rangeOfFlight, rangeOfFlight) == 0 &&
                Double.compare(plane.fuelConsumption, fuelConsumption) == 0 &&
                Double.compare(plane.capacityCargoCompartment, capacityCargoCompartment) == 0 &&
                Objects.equals(type, plane.type) &&
                Objects.equals(company, plane.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, company, loadCapacity, rangeOfFlight, fuelConsumption, capacityCargoCompartment);
    }

    @Override
    public String toString() {
        return "Plane{" +
                "type='" + type + '\'' +
                ", company='" + company + '\'' +
                ", loadCapacity=" + loadCapacity +
                ", rangeOfFlight=" + rangeOfFlight +
                ", fuelConsumption=" + fuelConsumption +
                ", capacityCargoCompartment=" + capacityCargoCompartment +
                '}';
    }
}
