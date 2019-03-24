package by.bsu.lab5.util;

import by.bsu.lab5.entity.Airline;
import by.bsu.lab5.entity.Plane;

import java.util.List;

public class TotalLoadCapacity {

    public static double getTotalLoadCapacity(Airline planes) {
        return planes.getPlanes().stream().reduce(0.0, (acc, item) -> acc + item.getLoadCapacity(), (left, right) -> left + right);
    }

}
