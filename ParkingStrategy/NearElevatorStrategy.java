package ParkingStrategy;

import Slot.ParkingSlot;

import java.util.List;

public class NearElevatorStrategy implements ParkingStrategy {

    @Override
    public ParkingSlot findSlot(List<ParkingSlot> parkingSlotList) {
        return parkingSlotList.get(1);
    }
}
