package by.bsu.lab5.entity;

import org.apache.log4j.Logger;

import java.util.Objects;

public class CargoAirplane extends Plane {

    private final static Logger logger = Logger.getLogger(CargoAirplane.class);

    private String transportedCargo;

    public CargoAirplane(String type, String company, double loadCapacity, double rangeOfFlight, double fuelConsumption, double capacityCargoCompartment, String transportedCargo) {
        super(type, company, loadCapacity, rangeOfFlight, fuelConsumption, capacityCargoCompartment);
        this.transportedCargo = transportedCargo;
        logger.info("The cargo airplane has been created");
    }

    public CargoAirplane(){}

    public String getTransportedCargo() {
        return transportedCargo;
    }

    public void setTransportedCargo(String transportedCargo) {
        this.transportedCargo = transportedCargo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CargoAirplane that = (CargoAirplane) o;
        return Objects.equals(transportedCargo, that.transportedCargo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), transportedCargo);
    }

    @Override
    public String toString() {
        return "CargoAirplane{" +
                "capacityCargoCompartment=" + getCapacityCargoCompartment() +
                "transportedCargo=" + transportedCargo +
                "type=" + getType() +
                "company=" + getCompany() +
                "loadCapacity=" + getLoadCapacity() +
                "rangeOfFlight=" + getRangeOfFlight() +
                "fuelConsumption=" + getFuelConsumption() +
                '}';
    }
}
