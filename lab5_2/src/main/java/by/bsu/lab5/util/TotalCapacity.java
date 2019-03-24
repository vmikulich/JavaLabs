package by.bsu.lab5.util;

import by.bsu.lab5.entity.Airline;



public class TotalCapacity {

    public static double getTotalCapacity(Airline planes) {
        return planes.getPlanes().stream().reduce(0.0, (acc, item) -> acc + item.getCapacityCargoCompartment(), (left, right) -> left + right);    }
}
