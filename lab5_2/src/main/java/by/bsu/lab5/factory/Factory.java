package by.bsu.lab5.factory;

import by.bsu.lab5.entity.Airliner;
import by.bsu.lab5.entity.CargoAirplane;
import by.bsu.lab5.entity.Plane;

public class Factory {
    public Plane getPlane(PlaneType type) {
        Plane plane = null;
        switch (type) {
            case AIRLINER:
                plane = new Airliner();
                break;
            case CARGOAIRPLANE:
                plane = new CargoAirplane();
                break;
        }
        return plane;
    }
}
