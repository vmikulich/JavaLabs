package by.bsu.lab5.util;

import by.bsu.lab5.entity.Airline;
import by.bsu.lab5.entity.Plane;

import java.util.List;
import java.util.stream.Collectors;

public class SortedList {

    public static List<Plane> getSortedListOfPlanes(Airline planes) {
        return planes.getPlanes().stream()
                    .sorted((plane1, plane2) -> Double.compare(plane1.getRangeOfFlight(), plane2.getRangeOfFlight()))
                    .collect(Collectors.toList());
    }

}
