package ParkingManager;

import ParkingStrategy.NearElevatorStrategy;
import Slot.ParkingSlot;

import java.util.List;

public class TwoWheelerParkingManager extends ParkingManager {

    public TwoWheelerParkingManager(List<ParkingSlot> list, NearElevatorStrategy parkingStrategy) {
        super(list, parkingStrategy);
    }
}
