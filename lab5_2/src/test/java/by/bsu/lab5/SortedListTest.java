package by.bsu.lab5;

import by.bsu.lab5.entity.Airline;
import by.bsu.lab5.entity.Airliner;
import by.bsu.lab5.entity.CargoAirplane;
import by.bsu.lab5.entity.Plane;
import by.bsu.lab5.util.SortedList;
import by.bsu.lab5.util.TotalCapacity;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SortedListTest {

    Plane pln1;
    Plane pln2;
    Plane pln3;
    Airline planes;

    @Before
    public void initialization() {
        pln1 = new Airliner("turboprop", "WWA", 1000, 20000, 50, 200, 400);
        pln2 = new CargoAirplane("reactive", "WBA", 4500, 25000, 40, 500, "Cars");
        pln3 = new Airliner("turboprop", "HWA", 1000, 19000, 20, 200, 400);
        List<Plane> res = new ArrayList<>();
        res.add(pln1);
        res.add(pln2);
        res.add(pln3);
        planes = new Airline("WGH", res);
    }

    @Test
    public void getSortedListOfPlanes() {
        List<Plane> expected = Arrays.asList(pln3, pln1, pln2);
        assertEquals(expected, SortedList.getSortedListOfPlanes(planes));
    }

}
