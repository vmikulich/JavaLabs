package by.bsu.lab5.util;

import by.bsu.lab5.entity.Airline;
import by.bsu.lab5.entity.Airliner;
import by.bsu.lab5.entity.Plane;

import java.util.List;
import java.util.stream.Collectors;

public class PlaneWithCurrentFuelConsumption {

    public static Plane getPlaneWithCurrentFuelConsumption(Airline planes, double upperBorder, double lowBorder) {
        List<Plane> res = planes.getPlanes().stream()
                                        .filter(plane -> plane.getFuelConsumption() >= lowBorder && plane.getFuelConsumption() <= upperBorder)
                                        .collect(Collectors.toList());
        return res.get(0);
    }

}
